package com.example.splitexpenses

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class GroupActivity : AppCompatActivity() {
    private var list: ArrayList<FriendModel>? = arrayListOf<FriendModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group)

        populateList()
    }

    private fun populateList() {
        val myImageList = arrayOf(R.drawable.ship, R.drawable.ship, R.drawable.ship, R.drawable.ship, R.drawable.ship, R.drawable.ship, R.drawable.ship, R.drawable.ship, R.drawable.ship, R.drawable.ship)
        val myNames = arrayOf("humanname1","humanname2","name3","name","name","name","name","name","name","name10")
        val myDebts = arrayOf(-2.0,-1.0,1.0,1.0,1.0,1.0,1.0,2.0,0.0,0.0)
        for (i in 0..9) {
            val imageModel = FriendModel()
            imageModel.setName(myNames[i])
            imageModel.setDebt(myDebts[i])
            this.list?.add(imageModel)
        }

        render()
    }

    private fun render() {
        val imageModelArrayList = this.list
        val recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view_friends)// Bind to the recyclerview in the layout
        val layoutManager = LinearLayoutManager(this) // Get the layout manager
        recyclerView.layoutManager = layoutManager
        val mAdapter = imageModelArrayList?.let { FriendsAdapter(it) }
        recyclerView.adapter = mAdapter
    }


}