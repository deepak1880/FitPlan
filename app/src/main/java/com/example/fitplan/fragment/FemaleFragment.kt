package com.example.fitplan.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.R
import com.example.fitplan.adapter.CommonRecyclerViewAdapter
import com.example.fitplan.modalclass.FemaleWorkoutList

class FemaleFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val arrList = FemaleWorkoutList.FEMALE_PART_LIST

        val view = inflater.inflate(R.layout.fragment_female, container, false)

        val getDataFemale=view.findViewById<TextView>(R.id.getDataFragFemale)
        val string=arguments?.getString("userInput")
        getDataFemale?.text=resources.getString(R.string.workout_plan,string)

        val recyclerView = view.findViewById<RecyclerView>(R.id.femaleRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerAdapter = CommonRecyclerViewAdapter(arrList)
        recyclerView.adapter = recyclerAdapter

        return view

    }
}