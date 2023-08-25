package com.example.fitplan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.R
import com.example.fitplan.modal.Exercise

class CommonExciseAdapter(val arrExcise: List<Exercise>) :
    RecyclerView.Adapter<CommonExciseAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val workoutImageView: ImageView = itemView.findViewById(R.id.workoutImageView)
        val workoutTextView: TextView = itemView.findViewById(R.id.workoutTextView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.workout_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrExcise.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.workoutImageView.setImageResource(arrExcise[position].image)
        holder.workoutTextView.text = arrExcise[position].text
    }
}

