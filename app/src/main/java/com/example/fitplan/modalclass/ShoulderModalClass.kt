package com.example.fitplan.modalclass

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class ShoulderModalClass(override val image:Int,override val text:String) : BodyPart(image,text), Parcelable {
    val SHOULDER_WORKOUTS_LIST: ArrayList<ExerciseModalClass> = arrayListOf(
        ExerciseModalClass(R.drawable.main, "Press "),
        ExerciseModalClass(R.drawable.main, "Lateral raise"),
        ExerciseModalClass(R.drawable.main, "Front Raise"),
        ExerciseModalClass(R.drawable.main, "Rear delts"),
        ExerciseModalClass(R.drawable.main, "Delts"),
    )
}