package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import domain.fetch
import domain.getTv
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(){
    var text by remember { mutableStateOf("Hello, World!") }
    var result by remember { mutableStateOf("") }
    val scope = rememberCoroutineScope()

    Column {
        Button(onClick = {
            text = "Hello, Desktop!"
            scope.launch{
                result = getTv( fetch())
            }
        }) {
            Text(text)
        }

        Text(text=result)
    }
}