package ru.kre4.cursedcalculator.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.kre4.cursedcalculator.ui.elements.ButtonLayout
import ru.kre4.cursedcalculator.ui.elements.SquareButton

@Composable
fun CalculatorWindow(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        Text(text = "there will be value", modifier = Modifier.weight(0.3f).fillMaxWidth())
        ButtonLayout(modifier = modifier)
    }
}