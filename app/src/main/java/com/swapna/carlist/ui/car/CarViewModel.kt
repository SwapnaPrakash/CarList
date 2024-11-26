package com.swapna.carlist.ui.car

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.swapna.carlist.data.model.Car
import com.swapna.carlist.data.repository.CarRepository
import com.swapna.carlist.ui.base.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarViewModel @Inject constructor(private val repository: CarRepository) : ViewModel() {

    val _uiState = MutableStateFlow<UiState<List<Car>>>(UiState.Loading)

    var uiState : StateFlow<UiState<List<Car>>> = _uiState

    init {
        fetchCars()
    }

    private fun fetchCars() {
        viewModelScope.launch {
            repository.getCars().catch {
                _uiState.value = UiState.Error(it.message.toString())
            }.collect{
                _uiState.value = UiState.Success(it)
            }
        }
    }
}