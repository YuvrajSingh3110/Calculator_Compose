package com.example.calculator

sealed class CalculatorOperations(val symbol: String) {
    object Add: CalculatorOperations("+")
    object Sub: CalculatorOperations("-")
    object Multiply: CalculatorOperations("x")
    object Divide: CalculatorOperations("/")
}
