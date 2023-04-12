package hw.pets.entity

import kotlin.random.Random


/*
* @author Alexandr.Yakubov
**/

class Dog : Animal() {
    override val thoroughbred: Boolean = Random.nextBoolean()
    override val color: Color = Color.values().random()
    override val breed: String = BreedAnimal.values().random().name
    override var age: Int = Random.nextInt(1, 30)
    override var cost: Double = Random.nextDouble(20.0, 70.0)

    override fun makeSound() {
        println("ГАВ-ГАВ!")
    }

    override fun ageToHuman(age: Int): Int {
        return when (age) {
            1 -> 15
            2 -> 25
            else -> (age - 2) * 4 + 25
        }
    }

    override val pet: String = when (sex) {
        Sex.female -> "сука"
        else -> "кабель"
    }

}