package com.swapna.data.di.module

import com.swapna.carlist.data.repository.CarRepositoryImpl
import com.swapna.domain.repository.CarRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideCarRepository():CarRepository{
        return CarRepositoryImpl()
    }

}