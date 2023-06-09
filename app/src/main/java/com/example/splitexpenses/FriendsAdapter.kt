package com.example.splitexpenses

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FriendsAdapter (private val imageModelArrayList: MutableList<FriendModel>) : RecyclerView.Adapter<FriendsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.friend_card, parent, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val info = imageModelArrayList[position]
        holder.nameMsg.text = info.getNames()
        holder.debtMsg.text = info.getYourDebts()
        holder.info = info
    }

    override fun getItemCount(): Int {
        return imageModelArrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{

        var imgView = itemView.findViewById<View>(R.id.icon) as ImageView
        var nameMsg = itemView.findViewById<View>(R.id.firstLine) as TextView
        var debtMsg = itemView.findViewById<View>(R.id.debt) as TextView
        var info: FriendModel? = FriendModel()

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            try {
//
            } catch (e: Exception) {
                Log.i("Activities", "Null input")
            }
        }
    }
}