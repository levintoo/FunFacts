package com.levintoo.funfacts.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.levintoo.funfacts.R
import com.levintoo.funfacts.data.UserDataUiEvents
import com.levintoo.funfacts.ui.AnimalCard
import com.levintoo.funfacts.ui.TextComponent
import com.levintoo.funfacts.ui.TextFieldComponent
import com.levintoo.funfacts.ui.TopBar
import com.levintoo.funfacts.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
        )
        {
            TopBar("Hi mom\uD83D\uDC78")

            TextComponent(
                textValue = "Let's learn about you!",
                textSize = 24.sp
            )

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(
                textValue = "This app will prepare a details page based on input provided by you!",
                textSize = 18.sp
            )

            Spacer(modifier = Modifier.size(60.dp))

            TextComponent(
                textValue = "Name",
                textSize = 18.sp
            )

            Spacer(modifier = Modifier.size(10.dp))

            TextFieldComponent(onTextChanged = {
                userInputViewModel.onEvent(
                    UserDataUiEvents.UserNameEntered(it)
                )
            })

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(
                textValue = "WHat do you like",
                textSize = 18.sp
            )

            Row(modifier = Modifier.fillMaxWidth()) {
                AnimalCard(image = R.drawable.cat_ic)
                AnimalCard(image = R.drawable.dog_ic)
            }
        }
    }
}

@Preview
@Composable
fun UserInputScreenPreview() {
    UserInputScreen(UserInputViewModel())
}