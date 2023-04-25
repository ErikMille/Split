package com.example.splitexpenses

class GroupModel {
    var modelName: String? = null

    private var modelImage: Int = 0

    fun getNames(): String {
        return modelName.toString()
    }

    fun setNames(name: String) {
        this.modelName = name
    }

}