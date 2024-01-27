package com.levintoo.funfacts.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.levintoo.funfacts.ui.FactComposable
import com.levintoo.funfacts.ui.FactsViewModel
import com.levintoo.funfacts.ui.TextComponent
import com.levintoo.funfacts.ui.TextWithShadow
import com.levintoo.funfacts.ui.TopBar

@Composable
fun WelcomeScreen(userName: String?, animalSelected: String?) {
    Surface(
        modifier = Modifier.fillMaxSize ()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
        ) {
            TopBar("Welcome ${userName}\uD83D\uDE0A")

            TextComponent(
                textValue = "Thank you for sharing your data",
                textSize = 24.sp
            )

            Spacer(modifier = Modifier.size(60.dp))

            val finalText = if (animalSelected == "Cat" ) "You are a cat lover \uD83D\uDC31, you magnificent beautiful son of a " else "You are a dog lover \uD83D\uDC36"

            TextWithShadow(value = finalText)

            val factsViewModel: FactsViewModel = viewModel()

            FactComposable(value = factsViewModel.generateRandomFact(animalSelected!!))
        }
    }
}

@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen("userName", "animalSelected")
}