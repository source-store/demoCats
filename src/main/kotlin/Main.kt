import hw1.cat.entity.Cat
import hw1.cat.service.Service.Companion.searchCat
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

