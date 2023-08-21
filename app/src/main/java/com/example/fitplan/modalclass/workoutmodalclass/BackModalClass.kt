package com.example.fitplan.modalclass.workoutmodalclass

import android.os.Parcelable
import com.example.fitplan.R
import com.example.fitplan.modalclass.BodyPart
import com.example.fitplan.modalclass.ExciseModalClass
import kotlinx.parcelize.Parcelize

@Parcelize
class BackModalClass(override val image:Int,override val text:String) : BodyPart(image,text), Parcelable {
    val BACK_WORKOUTS_LIST: ArrayList<ExciseModalClass> = arrayListOf(
        ExciseModalClass(R.drawable.main, "Back "),
        ExciseModalClass(R.drawable.main, "lat"),
        ExciseModalClass(R.drawable.main, "T bar"),
        ExciseModalClass(R.drawable.main, "Seated"),
        ExciseModalClass(R.drawable.main, "Lat"),
    )
}