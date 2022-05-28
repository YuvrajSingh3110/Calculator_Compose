package com.example.calculator

sealed class CalculatorActions {
    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    object BracketOpen: CalculatorActions()
    object BracketClose: CalculatorActions()
    data class Operation(val operation: CalculatorOperations): CalculatorActions()
}
