package com.example.fitplan.modalclass

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class BackModalClass(override val image:Int,override val text:String) : BodyPart(image,text), Parcelable {
    val BACK_WORKOUTS_LIST: ArrayList<ExerciseModalClass> = arrayListOf(
        ExerciseModalClass(R.drawable.main, "Back "),
        ExerciseModalClass(R.drawable.main, "lat"),
        ExerciseModalClass(R.drawable.main, "T bar"),
        ExerciseModalClass(R.drawable.main, "Seated"),
        ExerciseModalClass(R.drawable.main, "Lat"),
    )
}