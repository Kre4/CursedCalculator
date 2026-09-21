package ru.kre4.cursedcalculator.logic

sealed class CalculatorKey(val displayText: String) {
    data class Digit(val value: Int) : CalculatorKey(value.toString())

    data object Dot : CalculatorKey(".")
    data object Plus : CalculatorKey("+")
    data object Minus : CalculatorKey("-")
    data object Multiplication : CalculatorKey("*")
    data object Division : CalculatorKey("/")
    data object Evaluate : CalculatorKey("=")
    data object Clear : CalculatorKey("C")
    data object Backspace : CalculatorKey("<=")
    data object OpenBracket : CalculatorKey("(")
    data object ClosedBracket : CalculatorKey(")")
}