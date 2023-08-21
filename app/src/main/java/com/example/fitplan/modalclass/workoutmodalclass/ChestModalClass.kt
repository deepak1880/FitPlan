package com.example.fitplan.modalclass.workoutmodalclass

import android.os.Parcelable
import com.example.fitplan.R
import com.example.fitplan.modalclass.BodyPart
import com.example.fitplan.modalclass.ExciseModalClass
import kotlinx.parcelize.Parcelize

@Parcelize
class ChestModalClass(override val image: Int, override val text: String) : BodyPart(image, text),Parcelable {
    val CHEST_WORKOUTS_LIST : ArrayList<ExciseModalClass> = arrayListOf(
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
        ExciseModalClass(R.drawable.chest,"Incline dumbell press"),
    )
}