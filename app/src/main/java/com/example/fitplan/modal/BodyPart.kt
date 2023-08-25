package com.example.fitplan.modal

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
open class BodyPart(open val image:Int, open val text:String) : Parcelable{
    open fun getExceriseList():List<Exercise> {
       return emptyList()
    }
}