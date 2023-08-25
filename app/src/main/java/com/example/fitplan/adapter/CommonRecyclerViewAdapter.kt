package com.example.fitplan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.R
import com.example.fitplan.modal.BodyPart

class CommonRecyclerViewAdapter(val arrList: List<BodyPart>) :
    RecyclerView.Adapter<CommonRecyclerViewAdapter.ViewHolder>() {
     var itemOnClick:((BodyPart)->Unit) ?= null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageButton = itemView.findViewById<ImageView>(R.id.imageButton)
        val textView = itemView.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.workout_plan, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageButton.setImageResource(arrList[position].image)
        holder.textView.text = arrList[position].text

        holder.itemView.rootView.setOnClickListener{
            itemOnClick?.invoke(arrList[position])
        }
    }
}