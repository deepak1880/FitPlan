package com.example.fitplan.modalclass

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class BicepModalClass(override val image: Int, override val text: String) : BodyPart(image, text),
    Parcelable {
    val BICEPS_WORKOUTS_LIST : ArrayList<ExerciseModalClass> = arrayListOf(
        ExerciseModalClass(R.drawable.chest,"Barbel curl"),
        ExerciseModalClass(R.drawable.chest,"Cable curl"),
        ExerciseModalClass(R.drawable.chest,"Dumbell curl"),
        ExerciseModalClass(R.drawable.chest,"Barbel curl"),
        ExerciseModalClass(R.drawable.chest,"Picher curl"),
    )
}