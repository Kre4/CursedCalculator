package ru.kre4.cursedcalculator.ui.elements

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.kre4.cursedcalculator.logic.CalculatorKey
import ru.kre4.cursedcalculator.ui.theme.calculatorKey

@Composable
fun SquareButton(key: CalculatorKey, onClick: (CalculatorKey) -> Unit) {
    Button(
        modifier = Modifier
            .aspectRatio(1F),
        onClick = { onClick(key) }
    ) {
        Text(
            text = key.displayText,
            style = MaterialTheme.typography.calculatorKey
        )
    }
}