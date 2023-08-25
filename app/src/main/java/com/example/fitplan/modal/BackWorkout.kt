package com.example.fitplan.modal

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class BackWorkout(override val image:Int, override val text:String) : BodyPart(image,text), Parcelable {
    val BACK_WORKOUTS_LIST: ArrayList<Exercise> = arrayListOf(
        Exercise(R.drawable.main, "Back "),
        Exercise(R.drawable.main, "lat"),
        Exercise(R.drawable.main, "T bar"),
        Exercise(R.drawable.main, "Seated"),
        Exercise(R.drawable.main, "Lat"),
    )

    override fun getExceriseList(): List<Exercise> {
        return BACK_WORKOUTS_LIST
    }
}