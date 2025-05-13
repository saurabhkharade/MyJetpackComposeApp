package com.programmingkeeda.myjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.programmingkeeda.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class ImageViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackComposeTheme {
                getLayoutContainersActivity()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun getLayoutContainersActivity() {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text("Basic Box")
        })
    }, modifier = Modifier.fillMaxSize()) {
        Box(

            modifier = Modifier
                .padding(it)
                .background(color = colorResource(R.color.teal_200)),
            contentAlignment = Alignment.Center
        ) {
            Surface(
                modifier = Modifier.padding(100.dp),
                color = colorResource(id = R.color.teal_200)
            ) {

            }

            Text(
                text = "Top Layer", fontSize = 25.sp, color = Color.Red
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun getLayoutContainersActivityPrivew() {
    MyJetpackComposeTheme {
        getLayoutContainersActivity()
    }
}



