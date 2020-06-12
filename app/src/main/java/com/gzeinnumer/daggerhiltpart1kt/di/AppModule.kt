package com.gzeinnumer.daggerhiltpart1kt.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

//todo 4
@Module
@InstallIn(ApplicationComponent::class)
object AppModule{
    @Provides
    fun string() : String = "providesString"
}