package com.swapna.carlist.data.repository

import com.swapna.carlist.utiles.AppConstants
import com.swapna.domain.model.Car
import com.swapna.domain.repository.CarRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CarRepositoryImpl @Inject constructor():CarRepository{

    override fun getCars() : Flow<List<Car>>{
        return flow {
            emit(AppConstants.CARDETAILS)
        }
    }

}