package com.example.composelesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelesson.ui.theme.ComposeLessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLessonTheme {


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardView(){
    ComposeLessonTheme{
            Greeting(name = "Android")
    }
}

@Composable
fun Greeting(name : String){
    Text("Hello $name!")
}




