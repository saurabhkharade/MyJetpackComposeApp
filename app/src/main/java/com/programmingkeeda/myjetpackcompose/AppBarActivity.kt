package com.programmingkeeda.myjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.programmingkeeda.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class AppBarActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackComposeTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("Learn Jetpack") },
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = Color.Red,
                                titleContentColor = Color.White,
                                actionIconContentColor = Color.White
                            ),
                            actions = {
                                IconButton(onClick = {}) {
                                    Icon(Icons.Default.MoreVert, contentDescription = "Settings")
                                }
                            },
                            modifier = Modifier.padding()
                        )
                    }, modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Text("Android Developer")
                    }
                }
            }
        }
    }
}

