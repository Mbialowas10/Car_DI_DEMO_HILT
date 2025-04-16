package com.mbialowas.car_di_demo_hilt.module

import com.mbialowas.car_di_demo_hilt.models.AutomaticTransmission
import com.mbialowas.car_di_demo_hilt.models.Engine
import com.mbialowas.car_di_demo_hilt.models.MichelinTires
import com.mbialowas.car_di_demo_hilt.models.Tires
import com.mbialowas.car_di_demo_hilt.models.Transmission
import com.mbialowas.car_di_demo_hilt.models.V8Engine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CarDIDemoHiltModule {

    @Binds
    abstract fun bindEngine(engine: V8Engine): Engine

    @Binds
    abstract fun bindTransmission(transmission: AutomaticTransmission): Transmission

    @Binds
    abstract fun bindTires(tires: MichelinTires): Tires
}