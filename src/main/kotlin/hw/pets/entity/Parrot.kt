package hw.pets.entity

import kotlin.random.Random


/*
* @author Alexandr.Yakubov
**/

class Parrot: Bird() {
    override val speak: Boolean = Random.nextBoolean()
    override val color: Color = Color.values().random()
    override val breed: String = BreedBird.values().random().name
    override var age: Int = Random.nextInt(1, 250)
    override var cost: Double = Random.nextDouble(50.0, 150.0)
    override val pet: String = "попугай"

    override fun makeSound() {
        println("Гоша хороший!")
    }

    override fun ageToHuman(age: Int): Int {
        return age
    }

    override fun fly() {
        println("нравиться летать!")
    }

}