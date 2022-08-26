package com.baranselklnc.ineedaplayer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.baranselklnc.ineedaplayer.R
import com.baranselklnc.ineedaplayer.model.User


class UserAdapter(val userList:ArrayList<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    class UserViewHolder(var view :View):RecyclerView.ViewHolder (view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view =inflater.inflate(R.layout.user_card,parent,false)
        return UserViewHolder(view)

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.view.name.text=userList[position].userfullName
        holder.view.about.text = userList[position].userBio
        holder.view.imageview.set=userList[position].userPic

    }

    override fun getItemCount(): Int {
    return userList.size
    }
}