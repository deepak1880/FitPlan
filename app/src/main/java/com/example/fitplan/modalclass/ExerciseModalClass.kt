package com.example.fitplan.modalclass

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ExerciseModalClass (val image:Int, val text:String) : Parcelable