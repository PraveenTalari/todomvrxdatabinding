package com.wayfair.todomvrxdatabinding.tasklist

import androidx.fragment.app.Fragment
import com.squareup.inject.assisted.dagger2.AssistedModule
import com.wayfair.todomvrxdatabinding.AssistedViewModelFactory
import com.wayfair.todomvrxdatabinding.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@AssistedModule
@Module(includes = [AssistedInject_TaskListFragmentModule::class])
interface TaskListFragmentModule {

    /*@Binds
    abstract fun bindFragment(fragment: TaskListFragment): Fragment*/

    /*@Binds
    @IntoMap
    @ViewModelKey(TaskListViewModel::class)
    fun taskListViewModelFactory(factory: TaskListViewModel.Factory): AssistedViewModelFactory<*, *>*/
}
