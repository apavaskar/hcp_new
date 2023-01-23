package com.squer.prorpel.persistence

class NamedReference  {
    var id: String ?= ""
    var name: String? = ""

    companion object{
        fun getInstance(id: String): NamedReference {
            var reference = NamedReference()
            reference.id = id
            return reference
        }

    }
    constructor()

    constructor(id: String, name: String){
        this.id = id
        this.name = name
    }
}
