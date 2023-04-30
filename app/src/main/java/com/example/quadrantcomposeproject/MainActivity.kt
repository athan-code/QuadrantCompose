package com.example.quadrantcomposeproject

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantcomposeproject.ui.theme.QuadrantComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantComposeProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


// CREATION D'UNE COMPOSABLE INFO CARD :
@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            //.fillMaxWidth()
            //.fillMaxHeight()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
        )
    }
}

// CREATION ET REMPLISSAGE DU QUADRANT :
@Composable
fun ComposeQuadrantApp(){
    Column(
        //modifier = Modifier.fillMaxSize()
    ) {
        ComposableInfoCard(
            title = "Text composable",
            description = "Displays text and follows Material Design guidelines.",
            backgroundColor = Color.Green,
            modifier = Modifier
                .weight(1f)
        )
        ComposableInfoCard(
            title = "Image composable",
            description = "Creates a composable that lays out and draws a given Painter class object.",
            backgroundColor = Color.Yellow,
            modifier = Modifier
                .weight(1f)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposableInfoCardPreview() {
    QuadrantComposeProjectTheme {
        ComposableInfoCard(
            "Text composable",
            "Displays text and follows Material Design guidelines.",
            backgroundColor = Color.Green,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposeQuadrantAppPreview() {
    QuadrantComposeProjectTheme {
        ComposeQuadrantApp()
    }
}