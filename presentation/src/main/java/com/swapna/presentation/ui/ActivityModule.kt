package com.swapna.presentation.ui

import com.swapna.carlist.ui.car.CarAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun provideAdapter() = CarAdapter(ArrayList())

}