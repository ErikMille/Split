package com.example.applicationnews.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.splitexpenses.FriendsFragment
import com.example.splitexpenses.AddFriendFragment
import com.example.splitexpenses.GroupsFragment

class TabAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(index: Int): Fragment {
        when (index) {
            0 -> return FriendsFragment()
            1 -> return GroupsFragment()
            2 -> return AddFriendFragment()
        }
        return GroupsFragment()
    }

    // get item count - equal to number of tabs
    override fun getItemCount(): Int
    {
        return 3
    }
}