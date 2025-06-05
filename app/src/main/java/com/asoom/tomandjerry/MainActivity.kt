package com.asoom.tomandjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import com.asoom.tomandjerry.ui.screens.TomAccountScreen
import com.asoom.tomandjerry.ui.theme.TomJerryTheme
import com.asoom.tomandjerry.ui.screens.TomKitchenScreen
import com.asoom.tomandjerry.ui.screens.TomStoreScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            TomJerryTheme {
//                TomStoreScreen()
//                TomKitchenScreen()
                TomAccountScreen()
            }
        }
    }
}