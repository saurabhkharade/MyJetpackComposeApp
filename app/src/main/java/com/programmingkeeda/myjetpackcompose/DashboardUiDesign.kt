package com.programmingkeeda.myjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.programmingkeeda.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class DashboardUiDesign : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    getDashboardUiDesign()
                }
            }
        }
    }
}

@Composable
 fun DashboardUiDesign.getDashboardUiDesign() {
    Column(modifier = Modifier.fillMaxSize()) {
        val paddingValues = PaddingValues(16.dp)


    }
}

