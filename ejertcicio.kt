import kotlin.math.pow

fun main() {
    var count: Int = 15
    //for (i in 2 until count){
    //    if (primo(i)){
    //        perfectos(i)
    //    }
    //}

    count = 50
    var x: Double = 0.0
    var primos: Double = 0.0
    for (i in 2 until count){
        if (primo(i)){
            ++x
            primos += i
            //println(i)
        }
    }
    println("Promedio: ${primos/x}")
}

fun perfectos (num:Int)  {
    val base: Double = 2.0
    val primo : Double = base.pow(num) - 1
    if (primo(primo.toInt())){
        val perfecto : Double = base.pow(num - 1) * primo
        println(perfecto)
    }
}

fun primo(num: Int): Boolean {
    for (x in 2 until num) {
        if (num % x == 0 || num == 1) {
            return false
        }
    }
    return true
}