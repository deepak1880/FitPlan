package com.example.fitplan.modalclass

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class BackModalClass(val image:Int,val text:String) : BodyPart(), Parcelable {
    val BACK_WORKOUTS_LIST: ArrayList<ExciseModalClass> = arrayListOf(
        ExciseModalClass(R.drawable.main, "Back "),
        ExciseModalClass(R.drawable.main, "lat"),
        ExciseModalClass(R.drawable.main, "T bar"),
        ExciseModalClass(R.drawable.main, "Seated"),
        ExciseModalClass(R.drawable.main, "Lat"),
    )
}