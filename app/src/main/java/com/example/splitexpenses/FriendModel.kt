package com.example.splitexpenses

class FriendModel {
    var modelName: String? = null
    var modelEmail: String? = null
    var modelDebt: Double = 0.0


    fun getNames(): String {
        return modelName.toString()
    }

    fun setName(name: String) {
        this.modelName = name
    }

    fun getEmails(): String {
        return modelEmail.toString()
    }

    fun setEmails(text: String) {
        this.modelEmail = text
    }

    fun getYourDebts(): String {

        if (modelDebt == 0.0) { return "settled up"}
        if (modelDebt > 0.0) { return "You Owe " + modelDebt.toString() }
        if (modelDebt < 0.0) { return "Owes you " + Math.abs(modelDebt).toString() }
        return modelDebt.toString()
    }

    fun setDebt(modelDebt: Double) {
        this.modelDebt = modelDebt
    }
}