package com.swapna.carlist.data.repository

import com.swapna.carlist.data.model.Car
import com.swapna.carlist.utiles.AppConstants
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CarRepository @Inject constructor(){

    fun getCars() : Flow<List<Car>>{
        return flow {
            emit(AppConstants.CARDETAILS)
        }
    }
}