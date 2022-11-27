package com.pk4us.androidbasicsinkotlin

class RoundTower(residents: Int, radius: Double, val floors: Int = 2) : RoundHut(residents, radius) {

    override val buildingMaterial = "Stone"
    override val capacity = floors * 4

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}