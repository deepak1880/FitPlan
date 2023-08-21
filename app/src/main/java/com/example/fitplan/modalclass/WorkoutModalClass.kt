package com.example.fitplan.modalclass

import com.example.fitplan.R
import com.example.fitplan.modalclass.workoutmodalclass.BackModalClass
import com.example.fitplan.modalclass.workoutmodalclass.ChestModalClass

class WorkoutModalClass() {
    companion object {
        val BODY_PART_LIST: ArrayList<BodyPart> = arrayListOf(
            ChestModalClass(R.drawable.main, "Chest"),
            BackModalClass(R.drawable.main, "Back"),
            ChestModalClass(R.drawable.main, "Shoulder"),
            ChestModalClass(R.drawable.main, "Triceps"),
            ChestModalClass(R.drawable.main, "Abs"),
            ChestModalClass(R.drawable.main, "legs"),
        )
    }
}