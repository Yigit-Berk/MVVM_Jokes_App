package com.yigitberk.mvvm_jokesapp.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun JokeScreen( modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        LazyColumn(
            Modifier.fillMaxWidth()
        ) {

            items(5){
                JokeItem(joke = "joke", answer = "answer")
                HorizontalDivider()
                Spacer(Modifier.height(2.dp))
            }

        }
    }
}

@Composable
fun JokeItem(joke : String, answer: String){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color(246, 195, 98, 255))
        .padding(5.dp)
    ) {

        Text("Joke Text", color = Color.Black, fontWeight = FontWeight(700))
        Spacer(Modifier.height(10.dp))
        Text("Joke answer", color = Color.Black, fontStyle = FontStyle.Italic)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JokeScreen()
}