package com.squer.prorpel.security.domain

import com.squer.prorpel.services.exception.CoreLogger
import com.squer.prorpel.services.exception.SquerException
import com.squer.prorpel.services.log.SquerLogger
import com.squer.prorpel.utils.StringUtils
import java.util.*

class AuthCertificate {
    private var id: String
    private var name: String
    private var ownerId: String = ""
    private var expiresOn: Long


    companion object {
        private var logger: SquerLogger? = SquerLogger.getLogger(CoreLogger.SECURITY_LOGGER)
    }


    public constructor(principal: SquerPrincipal, expiresOn: Long) {
        try{
            this.id = principal.getId().toString()
            this.expiresOn = expiresOn
            this.name = principal.name
            if(principal.getUser() != null && principal.getUser().owner != null){
                this.ownerId = principal.getUser().owner!!.id
            }
        }catch(e: Exception){
            logger!!.error(e)
            throw SquerException(e)
        }
    }

    public constructor(certificate: String?){
        try{
            var decrypted : String? = StringUtils.decrypt(certificate)
            val tokenizer = StringTokenizer(decrypted, ":")
            id = tokenizer.nextToken()
            name = tokenizer.nextToken()
            expiresOn = tokenizer.nextToken().toLong()
            if (tokenizer.hasMoreTokens()) ownerId = tokenizer.nextToken()
        }catch(e: Exception){
            logger!!.error(e)
            throw SquerException(e)
        }
    }

    @Throws(java.lang.Exception::class)
    fun encrypt(): String? {
        var value = id + ":" + name + ":" + expiresOn
        if (!StringUtils.isNullOrEmpty(ownerId)) {
            value += ":" + ownerId
        }
        return StringUtils.encrypt(value)
    }

    fun getId(): String? {
        return id
    }

    fun setId(id: String?) {
        this.id = id!!
    }

    fun getExpiresOn(): Long {
        return expiresOn
    }

    fun setExpiresOn(expiresOn: Long) {
        this.expiresOn = expiresOn
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name!!
    }

    fun getOwnerId(): String? {
        return ownerId
    }

    fun setOwnerId(ownerId: String?) {
        this.ownerId = ownerId!!
    }
}