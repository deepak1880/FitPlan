package com.example.fitplan.modal

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize


@Parcelize
class LegsWorkout(override val image:Int, override val text:String) : BodyPart(image,text),
    Parcelable {
    val LEGS_WORKOUTS_LIST: ArrayList<Exercise> = arrayListOf(
        Exercise(R.drawable.main, "Squts "),
        Exercise(R.drawable.main, "Extension"),
        Exercise(R.drawable.main, "Curls"),
        Exercise(R.drawable.main, "Press"),
        Exercise(R.drawable.main, "Calf"),
    )

    override fun getExceriseList(): List<Exercise> {
        return LEGS_WORKOUTS_LIST
    }
}