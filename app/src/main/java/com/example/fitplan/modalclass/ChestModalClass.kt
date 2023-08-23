package com.example.fitplan.modalclass

import android.os.Parcelable
import com.example.fitplan.R
import kotlinx.parcelize.Parcelize

@Parcelize
class ChestModalClass(override val image: Int, override val text: String) : BodyPart(image, text),Parcelable {
    val CHEST_WORKOUTS_LIST : ArrayList<ExerciseModalClass> = arrayListOf(
        ExerciseModalClass(R.drawable.chest,"Incline Dumbell press"),
        ExerciseModalClass(R.drawable.chest,"Decline Dumbell press"),
        ExerciseModalClass(R.drawable.chest,"Pec fly"),
        ExerciseModalClass(R.drawable.chest,"Cable fly"),
        ExerciseModalClass(R.drawable.chest,"Dumbell Fly"),
    )

    override fun getExceriseList(): List<ExerciseModalClass> {
        return CHEST_WORKOUTS_LIST
    }
}