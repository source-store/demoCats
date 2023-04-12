package hw.pets.service

import hw.pets.entity.*
import kotlin.random.Random


class Service {
    companion object {

        fun searchCat(cats: List<Cat>, color: Color, breed: String): List<Cat> {
            return cats.filter { it.color == color && it.breed == breed }
        }

        fun randomPet(): Pets {
            val x = Random.nextInt(1, 3)
            return when (x) {
                1 -> Cat()
                2 -> Dog()
                else -> Parrot()
            }
        }
    }
}