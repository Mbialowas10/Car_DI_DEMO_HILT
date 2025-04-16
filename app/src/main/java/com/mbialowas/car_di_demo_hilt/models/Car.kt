package com.mbialowas.car_di_demo_hilt.models

import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val transmission: Transmission,
    private val tires: Tires
) {
    fun specs(): String {
        return "Car with ${engine.type()}, ${transmission.type()}, and ${tires.brand()} tires."
    }
}
