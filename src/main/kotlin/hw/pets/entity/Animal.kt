package hw.pets.entity


/*
* @author Alexandr.Yakubov
**/

abstract class Animal: Pets() {
    val name: Name = Name.values().random()

    abstract val breed: String

    abstract val  thoroughbred: Boolean

    override fun toString(): String {
        return "$pet, имя: $name, лет: $age, цвет: $color, порода: $breed"
    }

}
