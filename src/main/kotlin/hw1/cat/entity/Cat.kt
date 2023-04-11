package hw1.cat.entity

import kotlin.random.Random
import kotlin.random.nextInt


/*
* @author Alexandr.Yakubov
**/

class Cat : Animal() {
    val color: Color = Color.values().random()
    val breed: Breed = Breed.values().random()
    val name: Name = Name.values().random()
    var age: Int = Random.nextInt(IntRange(1, 25))
    var sex: Sex = Sex.values().random()
    override val animal: String = when (sex) {
        Sex.female -> "кошка"
        else -> "кот"
    }

    fun ageToHuman(age: Int): Int {
        return when (age) {
            1 -> 15
            2 -> 25
            else -> (age - 2) * 4 + 25
        }
    }

    fun inchToCentimeter(age: Int): Double {
        return (age * 2.54 * 100) / 100
    }

    override fun toString(): String {
        return "${determineTheAnimal(animal)}, имя: $name, лет: $age, цвет: $color, порода: $breed"
    }

}