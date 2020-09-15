package com.example.myapplication2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.Model.ItemModel
import com.example.myapplication2.R

class ItemAdapter(val itemModel: ArrayList<ItemModel>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {

        fun bindItem(itemmodel : ItemModel)
        {
            val image : ImageView= itemView.findViewById(R.id.images)
            val name : TextView = itemView.findViewById(R.id.txtname)

            image.setImageResource(itemmodel.image)
            name.setText(itemmodel.name)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.fragment_item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
       return itemModel.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(itemModel[position])
    }

}