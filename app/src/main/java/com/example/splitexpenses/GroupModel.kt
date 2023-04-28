package com.example.splitexpenses

import android.media.Image

class GroupModel {
    var modelName: String? = null
    var modelId: String? = null
    var modelImage: Int? = null

    fun setNames(name: String) {
        this.modelName = name
    }
    fun getNames(): String {
        return modelName.toString()
    }

    fun setId(Id: String) {
        this.modelId = Id
    }

    fun getId(): String {
        return modelId.toString()
    }

    fun setImage(image: Int) {
        this.modelImage = image
    }

    fun getImage(): Int? {
        return modelImage
    }



}