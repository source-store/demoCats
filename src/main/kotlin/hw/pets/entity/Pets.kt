package hw.pets.entity


/*
* @author Alexandr.Yakubov
**/

abstract class Pets {
    var isLive: Boolean = true
    var sex: Sex = Sex.values().random()

    abstract val pet: String

    abstract val color: Color
    abstract var age: Int
    abstract var cost: Double

    abstract fun makeSound()
    abstract fun ageToHuman(age: Int): Int

}