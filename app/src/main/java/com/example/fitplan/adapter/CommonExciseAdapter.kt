package com.example.fitplan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.R
import com.example.fitplan.modalclass.ExerciseModalClass

class CommonExciseAdapter(val arrExcise: List<ExerciseModalClass>) :
RecyclerView.Adapter<CommonExciseAdapter.ViewHolder>(){

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val workoutImageView = itemView.findViewById<ImageView>(R.id.workoutImageView)
        val workoutTextView = itemView.findViewById<TextView>(R.id.workoutTextView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CommonExciseAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.workoutplancardview, parent, false)
        return CommonExciseAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrExcise.size
    }

    override fun onBindViewHolder(holder: CommonExciseAdapter.ViewHolder, position: Int) {
        holder.workoutImageView.setImageResource(arrExcise[position].image)
        holder.workoutTextView .text = arrExcise[position].text
    }
}

