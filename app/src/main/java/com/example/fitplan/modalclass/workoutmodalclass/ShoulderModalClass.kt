package com.example.fitplan.modalclass.workoutmodalclass

import android.os.Parcelable
import com.example.fitplan.R
import com.example.fitplan.modalclass.BodyPart
import com.example.fitplan.modalclass.ExciseModalClass
import kotlinx.parcelize.Parcelize

@Parcelize
class ShoulderModalClass(override val image:Int,override val text:String) : BodyPart(image,text), Parcelable {
    val SHOULDER_WORKOUTS_LIST: ArrayList<ExciseModalClass> = arrayListOf(
        ExciseModalClass(R.drawable.shoulder, "Press "),
        ExciseModalClass(R.drawable.shoulder, "lateral raise"),
        ExciseModalClass(R.drawable.shoulder, "Front Raise"),
        ExciseModalClass(R.drawable.shoulder, "rear delts"),
        ExciseModalClass(R.drawable.shoulder, "delts"),
    )
}