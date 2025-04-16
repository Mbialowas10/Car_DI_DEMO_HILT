package com.mbialowas.car_di_demo_hilt.viewModel

import androidx.lifecycle.ViewModel
import com.mbialowas.car_di_demo_hilt.models.Car
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CarViewModel @Inject constructor(
    private val car: Car
) : ViewModel() {
    fun getSpecs(): String = car.specs()
}
