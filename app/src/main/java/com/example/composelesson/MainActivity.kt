package com.example.composelesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelesson.ui.theme.ComposeLessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLessonTheme {
                Surface( modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                            Greeting("Android")
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardView(){
    ComposeLessonTheme{
            Greeting(name = "Nurislam")
    }
}

@Composable
fun Greeting(name : String, modifier : Modifier = Modifier){
    Text("Hello $name!",
        modifier = modifier
        )
}




