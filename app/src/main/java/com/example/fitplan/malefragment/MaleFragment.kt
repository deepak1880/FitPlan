package com.example.fitplan.malefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.adapter.CommonRecyclerViewAdapter
import com.example.fitplan.R
import com.example.fitplan.modalclass.workoutmodalclass.MaleWorkoutModalClass

class MaleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var flag = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
        if (savedInstanceState?.isEmpty == true) {
            flag = 1
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val arrList = MaleWorkoutModalClass.MALE_PART_LIST

        val view = inflater.inflate(R.layout.fragment_male, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.maleRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerAdapter = CommonRecyclerViewAdapter(arrList)
        recyclerView.adapter = recyclerAdapter
        recyclerAdapter.itemOnClick = {
            val targetfrag=WorkoutFragmentMale()
            targetfrag.arguments=Bundle().apply {
                putParcelable("BodyPart",it)
            }
            fragmentManager(targetfrag, flag)
        }
        return view
    }
    private fun fragmentManager(fragment: Fragment, flag: Int) {
        val ft = parentFragmentManager.beginTransaction()
        if (flag == 1) {
            ft.add(R.id.frag_container, fragment)
        } else {
            ft.replace(R.id.frag_container, fragment)
        }
        ft.commit()
        ft.addToBackStack(null)
    }
}