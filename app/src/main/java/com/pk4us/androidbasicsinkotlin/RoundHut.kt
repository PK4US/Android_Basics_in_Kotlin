package com.pk4us.androidbasicsinkotlin

import java.lang.Math.PI
import java.lang.Math.sqrt

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {

    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }

    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }
}