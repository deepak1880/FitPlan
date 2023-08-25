package com.example.fitplan.modalclass

import com.example.fitplan.R

class MaleWorkoutList() {
    companion object {
        val MALE_PART_LIST: ArrayList<BodyPart> = arrayListOf(
            ChestWorkout(R.drawable.menchest, "Chest"),
            BackWorkout(R.drawable.menback2, "Back"),
            ShoulderWorkout(R.drawable.menshoulder2, "Shoulder"),
            BicepWorkout(R.drawable.menbiceps, "Biceps"),
            ChestWorkout(R.drawable.mentriceps, "Triceps"),
            ChestWorkout(R.drawable.menabs, "Abs"),
            LegsWorkout(R.drawable.menlegs, "legs Workout"),

        )
    }
}