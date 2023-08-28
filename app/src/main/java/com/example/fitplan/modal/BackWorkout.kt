package com.example.fitplan.modal

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class BackWorkout(override val image:Int, override val text:String) : BodyPart(image,text), Parcelable {
    val BACK_WORKOUTS_LIST: ArrayList<Exercise> = arrayListOf(
        Exercise(R.drawable.mendumbellpress,"Dumbbell Bench Press"),
        Exercise(R.drawable.mencablefly,"Medium Cable Flye"),
        Exercise(R.drawable.menlowcable,"Low-Cable Crossover"),
        Exercise(R.drawable.inclinedumbellfly,"Incline Dumbbell Flye"),
        Exercise(R.drawable.mendumbellfly,"Dumbbell Flye"),
        Exercise(R.drawable.mencablecross,"Cable Crossover"),
        Exercise(R.drawable.meninclinepress,"Decline Dumbell press"),
    )

    override fun getExceriseList(): List<Exercise> {
        return BACK_WORKOUTS_LIST
    }
}