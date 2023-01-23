package com.squer.prorpel.installer

import liquibase.change.custom.CustomTaskChange
import liquibase.database.Database
import liquibase.database.jvm.JdbcConnection
import liquibase.exception.CustomChangeException
import liquibase.exception.ValidationErrors
import liquibase.resource.ResourceAccessor
import java.util.ResourceBundle


class LabelInstaller: CustomTaskChange {
    var file: String? = null

    private var resourceAccessor: ResourceAccessor? = null
    override fun getConfirmationMessage(): String {
        return "Confirmation"
    }

    override fun setUp() {

    }

    override fun setFileOpener(resourceAccessor: ResourceAccessor?) {
        this.resourceAccessor = resourceAccessor
    }

    override fun validate(database: Database?): ValidationErrors {
        return ValidationErrors()
    }

    override fun execute(database: Database?) {
        val dbConn: JdbcConnection = database!!.connection as JdbcConnection
        var insertStatement = dbConn.createStatement();
        try {
            val labels = ResourceBundle.getBundle("db.changelog.labels.${file}")
            labels.keySet().forEach {
                var insertSql = String.format("insert into \"labelMeta\"(code, label, is_default) values('%s', '%s', true)", it, labels.getString(it));
                insertStatement.execute(insertSql);
            }
            insertStatement.close()
        } catch (e: Exception) {
            throw CustomChangeException(e)
        }
    }
}
