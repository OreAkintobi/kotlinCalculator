import kotlin.random.Random

fun main() {
    println("Properties & Fields/Calculator")
    println()
    val calculator = RandomCalculator()
    calculator.subtract(6)
    calculator.multiply(8)
    calculator.add(16)
    println()
    println("Our result is: ${calculator.currentValue}")
    println()
//    val remainder = calculator.remainder(8)
    println()
//    println("Remainder: $remainder")
}

class RandomCalculator: Calculator(
    initialValue = Random.nextInt(Int.MIN_VALUE, (Int.MAX_VALUE/10))
) {
    override fun newPrint(string: String) {
        println("$string done with random calculator")
    }
}

class BetterCalculator(initialValue: Int = 0) : Calculator(initialValue){

    fun remainder(number: Int): Int {
        newPrint("$currentValue % $number")
        return currentValue % number
    }

    override fun newPrint(string: String) {
        println("$string is a new abstract function")
    }
}

abstract class Calculator(initialValue: Int = 0) {
    var currentValue = initialValue

    abstract fun newPrint(string:String)

    fun add(number: Int): Int {
        newPrint("$currentValue + $number")
        currentValue += number
        return currentValue
    }

    fun subtract(number: Int): Int {
        newPrint("$currentValue - $number")
        currentValue -= number
        return currentValue
    }

    fun multiply(number: Int): Int {
        println("$currentValue * $number")
        currentValue *= number
        return currentValue
    }

    fun divide(number: Int): Int {
        println("$currentValue / $number")
        currentValue /= number
        return currentValue
    }
}