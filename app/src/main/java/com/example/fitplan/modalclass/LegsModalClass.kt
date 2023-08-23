package com.example.fitplan.modalclass

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize


@Parcelize
class LegsModalClass(override val image:Int,override val text:String) : BodyPart(image,text),
    Parcelable {
    val LEGS_WORKOUTS_LIST: ArrayList<ExerciseModalClass> = arrayListOf(
        ExerciseModalClass(R.drawable.main, "Squts "),
        ExerciseModalClass(R.drawable.main, "Extension"),
        ExerciseModalClass(R.drawable.main, "Curls"),
        ExerciseModalClass(R.drawable.main, "Press"),
        ExerciseModalClass(R.drawable.main, "Calf"),
    )
}