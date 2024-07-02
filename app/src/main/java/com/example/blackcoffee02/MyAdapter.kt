package com.example.blackcoffee02

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var profileArrayList: ArrayList<profile>, var context : Activity) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = profileArrayList[position]
        holder.hName.text = currentItem.Name
        holder.hImage.setImageResource(currentItem.Image)
        holder.hLocation.text = currentItem.Location
        holder.hDescription.text = currentItem.Description


    }

    override fun getItemCount(): Int {
        return profileArrayList.size
    }


    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)  {
        val hName = itemView.findViewById<TextView>(R.id.profileName)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.profileImage)
        val hLocation = itemView.findViewById<TextView>(R.id.profileLocation)
        val hDescription = itemView.findViewById<TextView>(R.id.profileDescription)

    }
}