package ru.kre4.cursedcalculator.ui.elements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonLayout(modifier: Modifier = Modifier) {
    val itemsList = List(20) { it + 1 }
    LazyVerticalGrid(
        columns = GridCells.Fixed(4), // Фиксируем ровно 4 колонки
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp), // Расстояние между колонками
        verticalArrangement = Arrangement.spacedBy(8.dp)    // Расстояние между строками
    ) {
        items(itemsList) { item ->
            SquareButton(text = item.toString(), 1)
        }
    }
// 10 . + - / * = C ( ) backspace
}