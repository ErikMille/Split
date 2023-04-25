package com.example.splitexpenses

class FriendModel {
    var modelName: String? = null
    var modelEmail: String? = null

    private var modelImage: Int = 0

    fun getNames(): String {
        return modelName.toString()
    }

    fun setNames(name: String) {
        this.modelName = name
    }

    fun getEmail(): String {
        return modelEmail.toString()
    }

    fun setEmail(text: String) {
        this.modelEmail = text
    }
}