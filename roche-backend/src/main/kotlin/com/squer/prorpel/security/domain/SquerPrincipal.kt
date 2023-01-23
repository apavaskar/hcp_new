package com.squer.prorpel.security.domain

class SquerPrincipal: java.security.Principal {

    private lateinit var id: String
    private lateinit var user: User
    private lateinit var name: String
    private var additionalParam: HashMap<String,Object> = hashMapOf()

    override fun getName(): String {
        return name
    }

    public constructor(id: String, user: User, name: String){
        this.id = id
        this.name = name
        this.user = user
    }

    public fun getId(): String?{
        return id
    }
    public fun getUser(): User{
        return user
    }

    public fun addParam(parameter: String, value: Object){
        additionalParam.put(parameter, value)
    }

    public fun addParam(additionalParam: HashMap<String, Object>){
        this.additionalParam.putAll(additionalParam)
    }

    public fun getAdditionalParam(parameter: String): Object?{
        return additionalParam.get(parameter)
    }
}