package com.example.fitplan.modalclass

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
open class BodyPart(open val image:Int, open val text:String) : Parcelable{
    open fun getExceriseList():List<ExerciseModalClass> {
       return emptyList()
    }
}