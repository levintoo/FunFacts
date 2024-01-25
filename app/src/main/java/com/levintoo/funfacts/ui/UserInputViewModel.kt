package com.levintoo.funfacts.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.levintoo.funfacts.data.UserDataUiEvents
import com.levintoo.funfacts.data.UserInputScreenState

class UserInputViewModel : ViewModel() {
    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event: UserDataUiEvents) {
        when(event){
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
            }

            is UserDataUiEvents.AnimalSelected -> {
                uiState.value = uiState.value.copy(
                    animalSelected = event.animalSelected
                )
            }
        }
    }
}