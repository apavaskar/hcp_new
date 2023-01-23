package com.squer.prorpel.utils

import org.apache.commons.mail.HtmlEmail
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


@Component
class EmailUtils {
    @Value("\${application.smtp.mail.host}")
    lateinit var hostName: String

    @Value("\${application.smtp.mail.port}")
    lateinit var port: String

    @Value("\${application.smtp.mail.from}")
    lateinit var fromMail: String

    @Value("\${application.smtp.mail.password}")
    lateinit var password: String


    @Value("\${application.smtp.mail.fromName}")
    lateinit var fromName: String
    @Throws(Exception::class)
    fun sendMail(mailTo: MutableList<String>,body: String?, subject: String?): Boolean {
        val htmlEmail = HtmlEmail()
        htmlEmail.setHostName(hostName)
        htmlEmail.setSmtpPort(port.toInt())
        htmlEmail.setAuthentication(fromMail,password)
        htmlEmail.setFrom(fromMail)
        mailTo.forEach {
            htmlEmail.addTo(it)
        }
        htmlEmail.isStartTLSEnabled=true
        htmlEmail.setCharset("UTF-8")
        //htmlEmail.setSSLOnConnect(true)
        htmlEmail.setSubject(subject);
        htmlEmail.setMsg(body);
        htmlEmail.send();
        return true
    }
}
