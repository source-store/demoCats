import hw.pets.entity.Pets
import hw.pets.service.PetShop
import hw.pets.service.Service.Companion.randomPet
import java.text.DecimalFormat
import kotlin.random.Random

/*
* @author Alexandr.Yakubov
**/


fun byPet(petsList: MutableList<Pets?>): Pets? {
    var by: Pets? = null
    val index = Random.nextInt(0, petsList.size - 1)
    by = petsList.get(index)
    petsList[index] = null
    return by
}

fun main() {
    val repeet = 9
    val petShop = PetShop()
    for (i in 0..repeet) {
        petShop.pets.add(randomPet())
    }

    for (i in 0..repeet) {
        val pet = byPet(petShop.pets)
        if (pet == null) {
            println("нет в наличии")
        } else {
            petShop.revenue = ++pet.cost
            println("куплен $pet")
        }
    }

    println("прибыль ${DecimalFormat("#.##").format(petShop.revenue)}")

}