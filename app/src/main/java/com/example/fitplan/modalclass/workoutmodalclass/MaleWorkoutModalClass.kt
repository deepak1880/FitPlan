package com.example.fitplan.modalclass.workoutmodalclass

import com.example.fitplan.R
import com.example.fitplan.modalclass.BodyPart

class MaleWorkoutModalClass() {
    companion object {
        val MALE_PART_LIST: ArrayList<BodyPart> = arrayListOf(
            ChestModalClass(R.drawable.main, "Chest"),
            BackModalClass(R.drawable.main, "Back"),
            ShoulderModalClass(R.drawable.main, "Shoulder"),
            ChestModalClass(R.drawable.main, "Triceps"),
            ChestModalClass(R.drawable.main, "Abs"),
            ChestModalClass(R.drawable.main, "legs"),
        )
    }

}