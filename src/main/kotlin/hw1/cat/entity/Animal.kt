package hw1.cat.entity


/*
* @author Alexandr.Yakubov
**/

abstract class Animal {
    var isLive: Boolean = true
    abstract val animal:String

    fun determineTheAnimal(animal: String):String {
        return animal
    }
}
