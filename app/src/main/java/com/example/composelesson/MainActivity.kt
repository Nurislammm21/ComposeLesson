package com.example.composelesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                        GreetingText(message = "Happy birthday Nurislam!", from = "From Brother")
                }

            }
        }
    }
}



@Composable
fun GreetingText(message : String, from : String, modifier : Modifier = Modifier){
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)){
    Text(text = message,
        fontSize = 79.sp,
        lineHeight = 94.sp,
        textAlign = TextAlign.Center
        )
    Text(text = from,
        fontSize = 28.sp,
        modifier = modifier
            .padding(16.dp)
            .align(alignment = Alignment.End)
    )
}
}

@Composable
fun GreetingImage(message : String, from : String, modifier : Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
    Image(painter =image ,
        contentDescription =null )
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardView(){
    ComposeLessonTheme{
        GreetingImage(message = "Happy Birthday Nurislam!", from = "From Brother")
    }
}