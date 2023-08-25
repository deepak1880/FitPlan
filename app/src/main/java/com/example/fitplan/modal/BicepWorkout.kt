package com.example.fitplan.modal

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class BicepWorkout(override val image: Int, override val text: String) : BodyPart(image, text),
    Parcelable {
    val BICEPS_WORKOUTS_LIST : ArrayList<Exercise> = arrayListOf(
        Exercise(R.drawable.chest,"Barbel curl"),
        Exercise(R.drawable.chest,"Cable curl"),
        Exercise(R.drawable.chest,"Dumbell curl"),
        Exercise(R.drawable.chest,"Barbel curl"),
        Exercise(R.drawable.chest,"Picher curl"),
    )

    override fun getExceriseList(): List<Exercise> {
        return BICEPS_WORKOUTS_LIST
    }
}