package com.example.fitplan.modalclass

import com.example.fitplan.R

class FemaleWorkoutModalClass {
    companion object {
        val FEMALE_PART_LIST: ArrayList<BodyPart> = arrayListOf(
            ChestModalClass(R.drawable.womenpic, "Chest"),
            BackModalClass(R.drawable.womenpic, "Back"),
            ShoulderModalClass(R.drawable.womenpic, "Shoulder"),
            ChestModalClass(R.drawable.womenpic, "Triceps"),
            ChestModalClass(R.drawable.womenpic, "Abs"),
            ChestModalClass(R.drawable.womenpic, "legs"),
        )
    }
}