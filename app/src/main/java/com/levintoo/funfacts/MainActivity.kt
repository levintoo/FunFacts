package com.levintoo.funfacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.levintoo.funfacts.ui.screens.NavGraph
import com.levintoo.funfacts.ui.ui.FunFactsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FunFactsTheme {
                FunFactsApp()
            }
        }
    }

    @Composable
    fun FunFactsApp() {
        NavGraph()
    }
}