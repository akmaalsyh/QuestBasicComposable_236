package com.example.questbasiccomposable_236

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.enableEdgeToEdge
import com.example.questbasiccomposable_236.ui.theme.QuestBasicComposable_236Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuestBasicComposable_236Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Panggil Composable Layout utama dengan padding utama dari Scaffold
                    TataLetakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
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
    QuestBasicComposable_236Theme {
        Greeting("Android")
    }
}