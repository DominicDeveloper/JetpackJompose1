package com.asadbek.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.asadbek.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           window.statusBarColor = getColor(R.color.black)
            window.navigationBarColor = getColor(R.color.black)
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Button(onClick ={
                    // button bosilishi
                    val intent = Intent(this@MainActivity,IkkinchiActvitiy::class.java)
                    startActivity(intent)
                }) {
                    Text(text = "Ikkinchi oyna", fontSize = 18.sp)
                }

                Button(onClick = {
                    val intent = Intent(this@MainActivity,MainActivity2::class.java)
                    startActivity(intent)
                })
                {
                    Text(text = "Uchinchi oynaga o`tish", fontSize = 18.sp)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}