package com.example.splitexpenses

class GroupModel {
    var modelName: String? = null
    var modelId: String? = null


    fun getNames(): String {
        return modelName.toString()
    }

    fun setId(Id: String) {
        this.modelId = Id
    }

    fun getId(): String {
        return modelId.toString()
    }

    fun setNames(name: String) {
        this.modelName = name
    }

}