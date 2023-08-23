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
import com.example.fitplan.modalclass.FemaleWorkoutModalClass

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

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
        val arrList = FemaleWorkoutModalClass.FEMALE_PART_LIST

        val view = inflater.inflate(R.layout.fragment_female, container, false)


        val recyclerView = view.findViewById<RecyclerView>(R.id.femaleRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerAdapter = CommonRecyclerViewAdapter(arrList)
        recyclerView.adapter = recyclerAdapter

        return view

    }
}