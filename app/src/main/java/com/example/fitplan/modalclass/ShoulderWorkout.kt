package com.example.fitplan.modalclass

import android.os.Parcelable
import com.example.fitplan.R
import com.example.fitplan.modalclass.BodyPart
import com.example.fitplan.modalclass.Exercise
import kotlinx.parcelize.Parcelize

@Parcelize
class ShoulderWorkout(override val image:Int, override val text:String) : BodyPart(image,text), Parcelable {
    val SHOULDER_WORKOUTS_LIST: ArrayList<Exercise> = arrayListOf(
        Exercise(R.drawable.main, "Press "),
        Exercise(R.drawable.main, "Lateral raise"),
        Exercise(R.drawable.main, "Front Raise"),
        Exercise(R.drawable.main, "Rear delts"),
        Exercise(R.drawable.main, "Delts"),
    )

    override fun getExceriseList(): List<Exercise> {
        return SHOULDER_WORKOUTS_LIST
    }
}