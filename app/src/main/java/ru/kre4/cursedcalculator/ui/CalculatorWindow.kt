package ru.kre4.cursedcalculator.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import net.objecthunter.exp4j.ExpressionBuilder
import ru.kre4.cursedcalculator.logic.CalculatorKey
import ru.kre4.cursedcalculator.ui.elements.ButtonLayout

@Composable
fun CalculatorWindow(modifier: Modifier = Modifier) {
    var expression by remember { mutableStateOf("") }
    Column(modifier = modifier) {
        Text(
            text = expression,
            modifier = Modifier
                .weight(0.3f)
                .fillMaxWidth()
        )
        ButtonLayout(
            modifier = Modifier
                .fillMaxWidth(),
            keyHandler = { key ->
                expression = when (key) {
                    CalculatorKey.Backspace -> expression.dropLast(1)
                    CalculatorKey.Clear -> ""
                    CalculatorKey.Evaluate -> ExpressionBuilder(expression).build().evaluate().toString()
                    else -> expression + key.displayText
                }

            }
        )
    }
}