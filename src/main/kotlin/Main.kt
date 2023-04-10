import hw1.cat.Breed
import hw1.cat.Cat
import hw1.cat.Color
import kotlin.random.Random
import kotlin.random.nextInt

/*
* @author Alexandr.Yakubov
**/

fun main() {
    val cats: MutableList<Cat> = mutableListOf()
    val arraySize = Random.nextInt(IntRange(2, 25))
    for (i in 0..arraySize) {
        cats.add(i, Cat())
        println(cats[i])
    }

    val search = searchCat(cats, cats[arraySize - 1].color, cats[arraySize - 1].breed)
    search.onEach { cat ->
        println("найден: $cat")
    }
}

fun searchCat(cats: List<Cat>, color: Color, breed: Breed): List<Cat> {
    return cats.filter { it.color == color && it.breed == breed }
}