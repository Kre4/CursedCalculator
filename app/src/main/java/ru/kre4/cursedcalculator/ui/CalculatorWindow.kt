package ru.kre4.cursedcalculator.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import net.objecthunter.exp4j.ExpressionBuilder
import ru.kre4.cursedcalculator.logic.CalculatorKey
import ru.kre4.cursedcalculator.ui.elements.ButtonLayout
import ru.kre4.cursedcalculator.ui.theme.grannyText

@Composable
fun CalculatorWindow(modifier: Modifier = Modifier) {
    var expression by remember { mutableStateOf("") }
    Column(modifier = modifier) {
        Text(
            text = expression,
            textAlign = TextAlign.Right,
            style = MaterialTheme.typography.grannyText,
            modifier = Modifier
                .weight(0.3f)
                .padding(10.dp)
                .wrapContentHeight()
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