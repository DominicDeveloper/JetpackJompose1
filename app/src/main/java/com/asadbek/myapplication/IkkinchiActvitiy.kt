package com.asadbek.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asadbek.myapplication.ui.theme.MyApplicationTheme

class IkkinchiActvitiy : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Layout o`rniga
            // modifier = view o`lchamlari
            // Modifier.fillMaxSize() - ekranni to`liq egallaydi
            // Modifier.fillMaxWidth() - eniga ekranni to`liq egallaydi
            // Modifier.fillMaxHeight() - bo`yicha ekranni to`liq egallaydi
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                // Bu joy tashlash uchun
                Spacer(modifier = Modifier.height(50.dp))
                //TextView
                Text(text = "Ikkinchi oyna", fontSize = 18.sp)
                var amountText by remember {
                    mutableStateOf("Enter name")
                }
                // EditText
                OutlinedTextField(modifier = Modifier.fillMaxWidth(), value = amountText, onValueChange = {
                    amountText = it
                }, colors = OutlinedTextFieldDefaults.colors(focusedLabelColor = colorResource(id = R.color.black), focusedBorderColor = colorResource(
                    id = R.color.black), cursorColor = colorResource(id = R.color.black)), textStyle = TextStyle(color = Color.Green, fontWeight = FontWeight.Normal, fontSize = 16.sp), keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text, imeAction = ImeAction.Next, autoCorrect = false), readOnly = false)

                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Absolute.Center,) {
                    Text(text = "Row dagi birinchi textview", fontSize = 14.sp)
                    Text(
                        text = "Ikkinchi textview",
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MyApplicationTheme {
        Greeting2("Android")
    }
}