package hw.pets.entity

import kotlin.random.Random


/*
* @author Alexandr.Yakubov
**/

class Cat : Animal() {
    override var age: Int = Random.nextInt(1, 25)
    override var cost: Double = Random.nextDouble(5.0, 50.0)
    override val color: Color = Color.values().random()
    override val breed: String = BreedAnimal.values().random().name
    override val thoroughbred: Boolean = Random.nextBoolean()


    override val pet: String = when (sex) {
        Sex.female -> "кошка"
        else -> "кот"
    }

    override fun makeSound() {
        println("МЯУ!")
    }

    override fun ageToHuman(age: Int): Int {
        return when (age) {
            1 -> 15
            2 -> 25
            else -> (age - 2) * 4 + 25
        }
    }

}