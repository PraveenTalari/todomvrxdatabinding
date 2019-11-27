package com.wayfair.todomvrxdatabinding.app.di

import com.wayfair.todomvrxdatabinding.AssistedViewModelFactory
import com.wayfair.todomvrxdatabinding.BaseViewModel
import com.wayfair.todomvrxdatabinding.PerApplication
import com.wayfair.todomvrxdatabinding.RoomScope
import com.wayfair.todomvrxdatabinding.app.App
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

// REMEMBER TO UPDATE TestAppComponent
@Component(modules = [ActivityBindingsModule::class, AndroidSupportInjectionModule::class, AppModule::class, FragmentBindingsModule::class, RoomModule::class])
@PerApplication
@RoomScope
interface AppComponent {
    /*@Component.Factory
    interface Factory : AndroidInjector.Factory<App>*/

    //fun viewModelFactories(): Map<Class<out BaseViewModel<*>>, AssistedViewModelFactory<*, *>>
}