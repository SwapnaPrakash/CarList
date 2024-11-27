package com.swapna.domain.repository

import com.swapna.domain.model.Car
import kotlinx.coroutines.flow.Flow
import javax.inject.Singleton

@Singleton
interface CarRepository {

    fun getCars():Flow<List<Car>>

}