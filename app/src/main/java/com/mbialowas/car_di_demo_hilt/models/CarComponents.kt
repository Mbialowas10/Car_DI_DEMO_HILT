package com.mbialowas.car_di_demo_hilt.models

import javax.inject.Inject

interface Engine {
    fun type(): String
}

interface Transmission {
    fun type(): String
}

interface Tires {
    fun brand(): String
}

class V8Engine @Inject constructor() : Engine {
    override fun type() = "V8 Engine"
}

class AutomaticTransmission @Inject constructor() : Transmission {
    override fun type() = "Automatic"
}

class MichelinTires @Inject constructor() : Tires {
    override fun brand() = "Michelin"
}
