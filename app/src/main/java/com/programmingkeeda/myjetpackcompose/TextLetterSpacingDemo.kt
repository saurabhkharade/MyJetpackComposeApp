package com.programmingkeeda.myjetpackcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextLetterSpacingDemo : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Scaffold(topBar = {
                    TopAppBar(
                        title = { Text("Letter Spacing Demo") },
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Color.Red, // Background color
                            titleContentColor = Color.White // Title text color (optional)
                        )

                    )
                }) { padding ->
                    Column(
                        modifier = Modifier
                            .padding(padding)
                            .padding(16.dp)
                    ) {
                        GetTextLetterSpacing()
                    }
                }
            }
        }
    }
}

@Composable
fun GetTextLetterSpacing() {
    Column {
        Text(
            text = "Normal Spacing",
            fontSize = 20.sp,
            letterSpacing = TextUnit(0f, TextUnitType.Sp)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Wide Letter Spacing",
            fontSize = 20.sp,
            letterSpacing = 2.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Extra Wide Spacing",
            fontSize = 20.sp,
            letterSpacing = 5.sp
        )
    }
}
