package com.programmingkeeda.myjetpackcompose

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.programmingkeeda.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class ColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackComposeTheme {
                getColumnData()
            }
        }
    }
}

@Composable
fun getColumnData() {
    Column(modifier = Modifier.padding(25.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(text = "First Item")
        Text(text = "Second Item")
        Text(text = "Third Item")
        Text(text = "Fourth Item")
        Text(text = "Fifth Item")
    }
}
