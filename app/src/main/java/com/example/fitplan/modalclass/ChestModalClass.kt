package com.example.fitplan.modalclass

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class ChestModalClass(val image:Int,val text:String) : Parcelable {
    val CHEST_WORKOUTS_LIST : ArrayList<ExciseModalClass> = arrayListOf(
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
    )
}