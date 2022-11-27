package com.pk4us.androidbasicsinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val squareCabin = SquareCabin(6, 50.0)
        val roundHut = RoundHut(3, 10.0)
        val roundTower = RoundTower(4, 15.5)

        with(squareCabin) {
            println("\nSquare Cabin\n============")
            println("Capacity: ${capacity}")
            println("Material: ${buildingMaterial}")
            println("Floor area: ${floorArea()}")

            with(roundHut) {
                println("\nRound Hut\n=========")
                println("Material: ${buildingMaterial}")
                println("Capacity: ${capacity}")
                println("Floor area: ${floorArea()}")
                println("Has room? ${hasRoom()}")
                getRoom()
                println("Has room? ${hasRoom()}")
                getRoom()
                println("Carpet size: ${calculateMaxCarpetLength()}")
            }

            with(roundTower) {
                println("\nRound Tower\n==========")
                println("Material: ${buildingMaterial}")
                println("Capacity: ${capacity}")
                println("Floor area: ${floorArea()}")
                println("Carpet Length: ${calculateMaxCarpetLength()}")
            }
        }
    }
}