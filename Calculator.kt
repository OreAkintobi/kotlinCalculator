fun main() {
    printExtraLine("Classes/Calculator")
    val calculator = Calculator()
    val result = calculator.multiply(3, 5)
    printExtraLine("Our result is: $result")
}

class Calculator {
    fun add(num1: Int, num2: Int): Int {
        println("$num1 + $num2")
        return num1 + num2
    }

    fun subtract(num1: Int, num2: Int): Int {
        println("$num1 - $num2")
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        println("$num1 * $num2")
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        println("$num1 / $num2")
        return num1 / num2
    }
}