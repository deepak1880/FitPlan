package com.example.fitplan.modal

import com.example.fitplan.R

class FemaleWorkoutList {
    companion object {
        val FEMALE_PART_LIST: ArrayList<BodyPart> = arrayListOf(
            ChestWorkout(R.drawable.womenchest, "Chest"),
            BackWorkout(R.drawable.womenback, "Back"),
            ShoulderWorkout(R.drawable.womenshoulder, "Shoulder"),
            BicepWorkout(R.drawable.womenbicep, "Biceps"),
            ChestWorkout(R.drawable.womentricep, "Triceps"),
            ChestWorkout(R.drawable.womenabs, "Abs"),
            LegsWorkout(R.drawable.womenlegs, "legs"),
        )
    }
}