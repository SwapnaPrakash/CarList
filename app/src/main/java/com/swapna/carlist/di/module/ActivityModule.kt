package com.swapna.carlist.di.module

import com.swapna.carlist.ui.car.CarAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun provideAdapter() = CarAdapter(ArrayList())
}