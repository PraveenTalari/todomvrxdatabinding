package com.wayfair.todomvrxdatabinding.tasklist

import com.wayfair.todomvrxdatabinding.AssistedViewModelFactory
import com.wayfair.todomvrxdatabinding.BaseViewModel
import dagger.Component

@Component(modules = [TaskListFragmentModule::class])
interface TaskListFragmentComponent {

    fun viewModelFactories(): Map<Class<out BaseViewModel<*>>, AssistedViewModelFactory<*, *>>

}