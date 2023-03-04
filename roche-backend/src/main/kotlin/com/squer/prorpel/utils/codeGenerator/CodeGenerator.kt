package com.squer.prorpel.utils.codeGenerator

import org.apache.velocity.Template
import org.apache.velocity.VelocityContext
import org.apache.velocity.app.VelocityEngine
import java.io.File
import java.io.StringWriter
import java.util.*

class CodeGenerator {
    companion object {
        fun main2(args: Array<String>) {
            var className = args[0]
            var fieldList = mutableMapOf<String, String>()
            var searchFiledMap = mutableMapOf<String, String>()
            var current = Class.forName(className).kotlin.java
            var entityColumnList = mutableListOf<EntityColumn>()
            var tmpClass = current
            while (tmpClass.superclass != null) {
                val fields = tmpClass.declaredFields
                fields.forEach { it ->
                    if (!fieldList.containsKey(it.name.toLowerCase())) {
                        var entityColumn: EntityColumn = EntityColumn()
                        var filedNames = getTableColumnName(it.name,it.type.simpleName,current.simpleName)
                        entityColumn.propertyName = getCapitalisedName(it.name)
                        entityColumn.columnName = filedNames[1]
                        entityColumn.columnType = it.type.simpleName
                        entityColumnList.add(entityColumn)
                        fieldList[filedNames[1]]= filedNames[0]
                        searchFiledMap[it.name] = getCapitalisedName(filedNames[0])
                    }
                }
                tmpClass = tmpClass.superclass
            }

            var stContext = VelocityContext()
            stContext.put("repositoryPackageName","${getPackagePath(current.packageName,".")}.repository")
            stContext.put("entityPath",className)
            stContext.put("tablePath","com.squer.prorpel.jooq.tables.references.${current.simpleName.uppercase()}")
            stContext.put("repositoryName","${current.simpleName}Repository")
            stContext.put("entityName","${current.simpleName}")
            stContext.put("tableName","${current.simpleName.uppercase()}")
            stContext.put("updateRow",getUpdateStatement(fieldList,current.simpleName))
            stContext.put("createRow",getCreateStatement(fieldList,current.simpleName))
            writeFile("templates/RepositoryTemplate.vm",stContext,args[1],"repository", "Repository",current)
            println("=============REPOSITORY GENERATED=============")


            stContext = VelocityContext()
            stContext.put("servicePackageName","${getPackagePath(current.packageName,".")}.service")
            stContext.put("entityPath",className)
            stContext.put("serviceName","${current.simpleName}Service")
            stContext.put("entityName","${current.simpleName}")
            writeFile("templates/ServiceTemplate.vm",stContext,args[1],"service","Service",current)
            println("=============SERVICE GENERATED=============")

            stContext = VelocityContext()
            stContext.put("serviceImplPackageName","${getPackagePath(current.packageName,".")}.service.impl")
            stContext.put("entityPath",className)
            stContext.put("repositoryPath","${getPackagePath(current.packageName,".")}.repository.${current.simpleName}Repository")
            stContext.put("servicePath","${getPackagePath(current.packageName,".")}.service.${current.simpleName}Service")
            stContext.put("serviceImplName","${current.simpleName}ServiceImpl")
            stContext.put("serviceName","${current.simpleName}Service")
            stContext.put("repositoryName","${current.simpleName}Repository")
            stContext.put("entityName","${current.simpleName}")
            writeFile("templates/ServiceImplTemplate.vm",stContext,args[1],"service/impl","ServiceImpl",current)
            println("=============SERVICE IMPL GENERATED=============")


            val ve = VelocityEngine()
            val p = Properties()
            ve.setProperty("resource.loader", "file");
            ve.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
            ve.setProperty("file.resource.loader.path", "src/main/kotlin/com/squer/prorpel/utils/codeGenerator");
            ve.init(p)
            val serviceTemplate : Template = ve.getTemplate("templates/SearchFieldEnumTemplate.vm")
            var enumString = ""
            searchFiledMap.keys.forEach{
                stContext = VelocityContext()
                stContext.put("fieldName",it.uppercase())
                stContext.put("fieldNameLower",it)
                stContext.put("jooqFiledName",searchFiledMap[it])
                val stWriter = StringWriter()
                serviceTemplate.merge(stContext, stWriter)
                enumString += stWriter.toString()+"\n"
            }

            stContext = VelocityContext()
            stContext.put("enumPackageName","${getPackagePath(current.packageName,".")}.domain.enums")
            stContext.put("jooqEntity","${current.simpleName.uppercase()}")
            stContext.put("searchFieldName","${current.simpleName}SearchField")
            stContext.put("enumData",enumString)
            writeFile("templates/SearchFieldTemplate.vm",stContext,args[1],"domain/enums","SearchFiled",current)
            println("=============SEARCH ENUM GENERATED=============")

            stContext = VelocityContext()
            stContext.put("controllerPath","${getPackagePath(current.packageName,".")}.controller")
            stContext.put("entiityPath",className)
            stContext.put("entityName","${current.simpleName}")
            stContext.put("contollerName","${current.simpleName}Controller")
            stContext.put("searchFieldPath","${getPackagePath(current.packageName,".")}.domain.enums.${current.simpleName}SearchField")
            stContext.put("servicePath","${getPackagePath(current.packageName,".")}.service.${current.simpleName}Service")
            stContext.put("serviceName","${current.simpleName}Service")
            stContext.put("searchField","${current.simpleName}SearchField.values().associateBy({it.getFieldName()},{it})")
            writeFile("templates/ControllerTemplate.vm",stContext,args[1],"controller","Controller",current)
            println("=============CONTROLLER GENERATED=============")

            stContext = VelocityContext()
            stContext.put("apiPath","${getPackagePath(current.packageName,".")}.api")
            stContext.put("controllerPath","${getPackagePath(current.packageName,".")}.controller.${current.simpleName}Controller")
            stContext.put("servicePath","${getPackagePath(current.packageName,".")}.service.${current.simpleName}Service")
            stContext.put("entityNameLower","${current.simpleName.lowercase()}")
            stContext.put("fileName","${current.simpleName}Api")
            stContext.put("serviceName","${current.simpleName}Service")
            stContext.put("controllerName","${current.simpleName}Controller")
            writeFile("templates/ApiTemplate.vm",stContext,args[1],"api","Api",current)
            println("=============API GENERATED=============")
        }
    }
}

class EntityColumn {
    var propertyName: String = ""
    var columnName: String = ""
    var columnType: String = ""
}

private fun writeFile(templateName: String, stContext: VelocityContext, basePath: String, filePath: String, fileType: String, current: Class<out Any>){
    val ve = VelocityEngine()
    val p = Properties()
    ve.setProperty("resource.loader", "file");
    ve.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
    ve.setProperty("file.resource.loader.path", "src/main/kotlin/com/squer/prorpel/utils/codeGenerator");
    ve.init(p)
    val serviceTemplate : Template = ve.getTemplate(templateName)
    val stWriter = StringWriter()
    serviceTemplate.merge(stContext, stWriter)
    var file = File("${basePath}/main/kotlin/${getPackagePath(current.packageName,"/")}/${filePath}/${current.simpleName}${fileType}.kt")
    if(!file.exists()){
        file.createNewFile()
        file.writeText(stWriter.toString())
    }
}

fun getPackagePath(path: String, splitBy: String): String {
    var paths = path.split(".")
    var absPath = "";
    var i = 0;
    paths.forEach { p ->
        if(i < paths.size-1){
            if(absPath=="")
                absPath = p
            else
                absPath = absPath+splitBy+p
        }
        i= i+1
    }
    return absPath;
}

private fun getUpdateStatement(fieldList: Map<String,String>, entityName: String): String {
    var str = "dslContext.update(${entityName.uppercase()}) \n"
    fieldList.keys.forEach{
        if(it != "createdBy" && it != "createdOn") {
            if (it !== "id") {
                str += "\t\t\t.set(${fieldList[it]},entity.${it})\n"
            }
        }
    }
    str += "\t\t\t.where(${entityName.uppercase()}.ID.eq(entity.id))\n"
    str += "\t\t\t.execute()\n\nreturn entity.id!!"
    return str
}

private fun getCreateStatement(fieldList: Map<String,String>, entityName: String): String {
    var str = "var result =  dslContext.insertInto(${entityName.uppercase()},"
    var idx = 0
    fieldList.keys.forEach{
        if(idx > 0)
            str += ","

        str += fieldList[it]
        idx += 1
    }
    str += ")\n.values("

    idx=0
    fieldList.keys.forEach{
        if(idx > 0)
            str += ","

        str += "entity.${it}"
        idx += 1
    }
    str += ")\n.returningResult(${entityName.uppercase()}.ID)\n.fetchOne()\n\nreturn result!!.get(${entityName.uppercase()}.ID)!!"

    return str
}

fun getTableColumnName(str: String, columnType: String, entityName: String): List<String> {
    var newStr = getCapitalisedName(str).lowercase()

    if(columnType.equals("boolean") && !newStr.startsWith("is")) {
        newStr = "is_${newStr}"
        return mutableListOf<String>(entityName.uppercase() + "." + newStr)
    }

    if(columnType.equals("NamedReference") || columnType.equals("SquerReference")) {
        var str1 = str+"!!.id"
        var str2 = newStr+"_id"
        return mutableListOf<String>(entityName.uppercase() + "." + str2.uppercase(), str1)
    }

    return return mutableListOf<String>(entityName.uppercase() + "." + newStr.uppercase(), str)
}

fun getCapitalisedName(str: String): String {
    val regex = "([a-z])([A-Z]+)"
    val replacement = "$1_$2"
    return str.replace(regex.toRegex(), replacement)
}