package com.squer.prorpel.security.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import com.squer.prorpel.persistence.AuditableEntity
import com.squer.prorpel.persistence.NamedReference
import com.squer.prorpel.persistence.SquerEntity
import com.squer.prorpel.persistence.SquerReference
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.util.*

class User: AuditableEntity() {
    var userName: String?= null
    var password: String?= null
    var owner: SquerReference?= null
    var status: NamedReference?= null

//    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
//        val authorities: MutableSet<GrantedAuthority> = HashSet()
//        securityRoles?.forEach {
//            authorities.add(SimpleGrantedAuthority(it.id!!.toString()))
//        }
//        return authorities
//    }


}
