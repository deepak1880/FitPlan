package com.example.fitplan.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.R
import com.example.fitplan.adapter.CommonExciseAdapter
import com.example.fitplan.modalclass.BodyPart

class MaleWorkoutFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

   var bodyPart: BodyPart?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bodyPart = arguments?.getParcelable("BodyPart")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_workoutmale, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.chestRecyclerview)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerAdapter = bodyPart?.let { CommonExciseAdapter(it.getExceriseList()) }
        recyclerView.adapter = recyclerAdapter

        return view
    }

}
