package hw.pets.entity


/*
* @author Alexandr.Yakubov
**/

abstract class Bird: Pets(), Flying {
    abstract val speak: Boolean
    abstract val breed: String

}