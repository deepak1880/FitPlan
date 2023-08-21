package com.example.fitplan.modalclass

import com.example.fitplan.R

class WorkoutModalClass(var image: Int, var text: String) {
    val BODY_PART_LIST: ArrayList<BodyPart> = arrayListOf(
        ChestModalClass(R.drawable.main, "Chest"),
        BackModalClass(R.drawable.main, "Back")
    )

}