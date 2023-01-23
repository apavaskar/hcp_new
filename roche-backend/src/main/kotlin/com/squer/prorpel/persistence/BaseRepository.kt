package com.squer.prorpel.persistence

import com.squer.prorpel.security.domain.User
import org.jooq.*
import org.springframework.security.core.context.SecurityContextHolder
import java.rmi.server.UID
import java.time.LocalDateTime
import java.util.*

abstract class BaseRepository<T: SquerEntity> {
    abstract fun findById(id: String): T?

    abstract fun create(entity: T): String

    abstract fun update(entity: T): String

    abstract fun delete(id: String): String?

    abstract fun find(criteria: SearchCriteria): List<T>

    open fun generateGUID(prefix: String): String? {
        var uidString = "00000000000000000000000000000000" + UID().toString()
        uidString = uidString.substring(uidString.length - 32)
        uidString = uidString.replace(':', '0')
        uidString = uidString.replace('-', '0')
        return prefix + uidString
    }
    open fun formCondition(field: Field<Any>, condition: SearchCondition): Condition {
        when(condition.operator) {
            SearchOperator.EQ -> return (field.eq(condition.value))
            SearchOperator.IS -> return (field.isNull)
            SearchOperator.ISNOT -> return field.isNotNull
            SearchOperator.LE -> return field.le(condition.value)
            SearchOperator.GE -> return field.ge(condition.value)
            SearchOperator.LIKE -> return field.like("${condition.value}%")
            else -> return (field.eq(condition.value))
        }
    }

    open fun getCreator(): User {
        val authentication = SecurityContextHolder.getContext().authentication
        if (authentication.principal is String) {
            var user = User()
            user.id = ""
            return user
        }
        return authentication.principal as User
    }

    open fun getConditions(criteria: SearchCriteria): List<Condition>{
        val list = mutableListOf<Condition>()
        criteria.conditions.forEach {
            list.add(formCondition(it.field.getField(), it))
        }
        return list.toList()
    }

    open fun fillEntityForUpdate(entity: T) {
        if(entity is AuditableEntity){
            var user = getCreator()
            entity.updatedOn = LocalDateTime.now()
            entity.updatedBy = user.id!!
            entity.staleId = 1
        }
    }

    open fun fillEntityForCreate(entity: T) {
        if(entity is AuditableEntity){
            var user = getCreator()
            entity.updatedOn = LocalDateTime.now()
            entity.updatedBy = user.id!!
            entity.createdOn = LocalDateTime.now()
            entity.createdBy = user.id!!
            entity.staleId = 1
        }
    }

}
