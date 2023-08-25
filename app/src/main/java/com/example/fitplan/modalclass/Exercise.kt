package com.example.fitplan.modalclass

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Exercise (val image:Int, val text:String) : Parcelable