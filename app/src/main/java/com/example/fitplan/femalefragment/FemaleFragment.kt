package com.example.fitplan.femalefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.R
import com.example.fitplan.adapter.CommonRecyclerViewAdapter
import com.example.fitplan.modalclass.WorkoutPlanModelClass


class FemaleFragment : Fragment() {
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

        val view = inflater.inflate(R.layout.fragment_female, container, false)

        arrList.add(WorkoutPlanModelClass(R.drawable.womennn, "Chest Workout"))
        arrList.add((WorkoutPlanModelClass(R.drawable.womennn, "Shoulders Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.womennn, "Legs Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.womennn, "Abs Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.womennn, "Triceps Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.womennn, "Back Workout")))
        arrList.add((WorkoutPlanModelClass(R.drawable.womennn, "Biceps Workout")))


        val recyclerView = view.findViewById<RecyclerView>(R.id.femaleRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerAdapter = CommonRecyclerViewAdapter(arrList)
        recyclerView.adapter = recyclerAdapter
        return view
    }
}