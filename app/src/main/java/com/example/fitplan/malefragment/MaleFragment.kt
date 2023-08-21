package com.example.fitplan.malefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.modalclass.WorkoutPlanModelClass
import com.example.fitplan.adapter.CommonWorkoutPlanRecyclerViewAdapter
import com.example.fitplan.R

class MaleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val arrList = ArrayList<WorkoutPlanModelClass>()

        val view = inflater.inflate(R.layout.fragment_male, container, false)

        arrList.add(WorkoutPlanModelClass(R.drawable.main, "Chest Workout"))
        arrList.add((WorkoutPlanModelClass(R.drawable.main, "Shoulders Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.main, "Legs Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.main, "Abs Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.main, "Triceps Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.main, "Back Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.main, "Biceps Workout")))


        val recyclerView = view.findViewById<RecyclerView>(R.id.maleRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerAdapter = context?.let { CommonWorkoutPlanRecyclerViewAdapter(it, arrList) }
        recyclerView.adapter = recyclerAdapter
        return view


    }
}