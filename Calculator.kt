fun main() {
    println("Properties & Fields/Calculator")
    println()
    val calculator = Calculator(7)
    calculator.add(6)
    calculator.multiply(8)
    println()
    println("Our result is: ${calculator.currentValue}")
}

class Calculator(initialValue: Int = 0) {
    var currentValue = initialValue

    fun add(number: Int): Int {
        println("$currentValue + $number")
        currentValue += number
        return currentValue
    }

    fun subtract(number: Int): Int {
        println("$currentValue - $number")
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