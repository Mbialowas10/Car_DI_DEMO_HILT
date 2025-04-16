package com.mbialowas.car_di_demo_hilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mbialowas.car_di_demo_hilt.screens.CarScreen
import com.mbialowas.car_di_demo_hilt.ui.theme.Car_DI_DEMO_HILTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Car_DI_DEMO_HILTTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

