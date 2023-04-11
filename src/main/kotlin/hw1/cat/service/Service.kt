package hw1.cat.service

import hw1.cat.entity.Breed
import hw1.cat.entity.Cat
import hw1.cat.entity.Color


class Service {
    companion object {

        fun searchCat(cats: List<Cat>, color: Color, breed: Breed): List<Cat> {
            return cats.filter { it.color == color && it.breed == breed }
        }
    }
}