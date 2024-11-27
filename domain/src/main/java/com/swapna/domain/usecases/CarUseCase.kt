package com.swapna.domain.usecases

import com.swapna.domain.model.Car
import com.swapna.domain.repository.CarRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CarUseCase @Inject constructor(val repository: CarRepository) {

    operator fun invoke() : Flow<List<Car>>{
        return repository.getCars()
    }

}