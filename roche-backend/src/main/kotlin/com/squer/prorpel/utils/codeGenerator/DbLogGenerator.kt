package com.squer.prorpel.utils.codeGenerator

import java.io.File

class DbLogGenerator {
    companion object {
        fun main1(args: Array<String>) {
            var file = File("/Users/megha/new-propel/roche-backend/src/main/kotlin/com/squer/prorpel/utils/codeGenerator/db.txt")
            var str = ""
            args.forEach {
                var className = it
                var fieldList = mutableMapOf<String, String>()
                var current = Class.forName(className).kotlin.java
                var entityColumnList = mutableListOf<EntityColumn>()
                var tmpClass = current
                while (tmpClass.superclass != null) {
                    val fields = tmpClass.declaredFields
                    fields.forEach { it ->
                        if (!fieldList.containsKey(it.name.toLowerCase())) {
                            var entityColumn: EntityColumn = EntityColumn()
                            var filedNames = getTableColumnName(it.name,it.type.simpleName,current.simpleName)
                            entityColumn.propertyName = getCapitalisedName(it.name).lowercase()
                            entityColumn.columnName = filedNames[1]
                            entityColumn.columnType = it.type.simpleName
                            entityColumnList.add(entityColumn)
                            fieldList[filedNames[1]]= filedNames[0]
                        }
                    }
                    tmpClass = tmpClass.superclass
                }
                str =  "$str<changeSet id=\"${current.simpleName}\" author=\"admin\">\n<createTable tableName=\"${current.simpleName}\">\n"
                entityColumnList.forEach {
                    if (it.propertyName == "id") {
                        str =
                            "$str\t\t<column name=\"id\" type=\"bigint\" autoIncrement=\"true\"> \n\t<constraints primaryKey=\"true\" nullable=\"false\"/></column>\n"
                    } else {
                        if (it.columnType == "NamedReference" || it.columnType == "SquerReference") {
                            str = "$str\t\t<column name=\"${it.propertyName}_id\" type=\"bigint\"/>\n"
                        }
                        if (it.columnType == "String") {
                            str = "$str\t\t<column name=\"${it.propertyName}\" type=\"varchar(50)\"/>\n"
                        }
                        if (it.columnType == "Integer") {
                            str = "$str\t\t<column name=\"${it.propertyName}\" type=\"int\"/>\n"
                        }
                        if (it.columnType == "Boolean") {
                            str = "$str\t\t<column name=\"${it.propertyName}\" type=\"BOOLEAN\"/>\n"
                        }
                        if (it.columnType.lowercase() == "long") {
                            str = "$str\t\t<column name=\"${it.propertyName}\" type=\"BIGINT\"/>\n"
                        }
                        if (it.columnType == "Double") {
                            str = "$str\t\t<column name=\"${it.propertyName}\" type=\"DOUBLE PRECISION\"/>\n"
                        }
                        if (it.columnType == "Date" || it.columnType == "LocalDateTime") {
                            str = "$str\t\t<column name=\"${it.propertyName}\" type=\"TIMESTAMP\"/>\n"
                        }
                    }
                }
                str = "$str\t</createTable>\n</changeSet>\n\n"
                println("=============${current.simpleName} DB LOG GENERATED=============")
            }
            file.writeText(str)
        }
    }
}