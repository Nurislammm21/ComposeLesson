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
import androidx.compose.ui.unit.sp
import com.example.composelesson.ui.theme.ComposeLessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLessonTheme {
                Surface( modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        GreetingText(message = "Happy birthday Nurislam!")
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardView(){
    ComposeLessonTheme{
            GreetingText(message = "Happy Birthday Nurislam!")
    }
}

@Composable
fun GreetingText(message : String, modifier : Modifier = Modifier){
    Text(text = message,
        fontSize = 90.sp,
        lineHeight = 116.sp
        )
}



