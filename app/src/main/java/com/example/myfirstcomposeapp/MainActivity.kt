package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MyFirstScreen()
            }
        }
    }
}

@Composable
fun MyFirstScreen() {
    // Task 3: Menggunakan Surface dengan warna latar belakang (misal: Color.LightGray)
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray // Pilih warna selain Cyan (misal: LightGray, Yellow, dll)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp) // Task 3: Pilih padding terbaik (misal: 24.dp)
        ) {
            // Task 1: Greeting dan ide aplikasi milikmu sendiri
            Text(text = "Hi! I am Dzaki Putra.")
            Text(text = "My idea: A Personal Expense Tracker.")

            // Task 2: Menggunakan gambar sendiri 'my_picture.png' dari drawable
            Image(
                painter = painterResource(id = R.drawable.my_picture),
                contentDescription = "My personal profile picture"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyFirstScreenPreview() {
    MaterialTheme {
        MyFirstScreen()
    }
}