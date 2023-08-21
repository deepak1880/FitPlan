package com.example.fitplan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.modalclass.WorkoutPlanModelClass
import com.example.fitplan.R

class CommonWorkoutPlanRecyclerViewAdapter( val arrList: List<WorkoutPlanModelClass>) :
    RecyclerView.Adapter<CommonWorkoutPlanRecyclerViewAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageButton = itemView.findViewById<ImageView>(R.id.imageButton)
        val textView = itemView.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.workoutplancardview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageButton.setImageResource(arrList[position].image)
        holder.textView.text = arrList[position].text
    }
}