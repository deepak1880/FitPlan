package com.example.fitplan.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitplan.adapter.CommonRecyclerViewAdapter
import com.example.fitplan.R
import com.example.fitplan.modal.MaleWorkoutList


class MaleFragment : Fragment() {
    var flag = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState?.isEmpty == true) {
            flag = 1
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val arrList = MaleWorkoutList.MALE_PART_LIST

        val view = inflater.inflate(R.layout.fragment_male, container, false)

        val getDataMale = view?.findViewById<TextView>(R.id.getDataFragMale)
        val string = arguments?.getString("userInput")
        getDataMale?.text = resources.getString(R.string.workout_plan, string)

        val recyclerView = view.findViewById<RecyclerView>(R.id.maleRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerAdapter = CommonRecyclerViewAdapter(arrList)
        recyclerView.adapter = recyclerAdapter

        recyclerAdapter.itemOnClick = {
            val targetfrag = com.example.fitplan.fragment.MaleWorkoutFragment()
            targetfrag.arguments = Bundle().apply {
                putParcelable("BodyPart", it)
            }
            fragmentManager(targetfrag, flag)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
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