package com.wayfair.todomvrxdatabinding.app.di;

import com.wayfair.todomvrxdatabinding.AssistedViewModelFactory;
import com.wayfair.todomvrxdatabinding.ViewModelKey;
import com.wayfair.todomvrxdatabinding.taskaddedit.TaskAddEditFragment;
import com.wayfair.todomvrxdatabinding.taskaddedit.TaskAddEditFragmentModule;
import com.wayfair.todomvrxdatabinding.taskdetail.TaskDetailFragment;
import com.wayfair.todomvrxdatabinding.taskdetail.TaskDetailFragmentModule;
import com.wayfair.todomvrxdatabinding.tasklist.TaskListFragment;
import com.wayfair.todomvrxdatabinding.tasklist.TaskListFragmentModule;
import com.wayfair.todomvrxdatabinding.tasklist.TaskListViewModel;
import com.wayfair.todomvrxdatabinding.taskstatistics.TaskStatisticsFragment;
import com.wayfair.todomvrxdatabinding.taskstatistics.TaskStatisticsFragmentModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

@Module
interface FragmentBindingsModule {

/*    @ContributesAndroidInjector(modules = TaskListFragmentModule.class)
    TaskListFragment taskListFragment();*/

    @Binds
    @IntoMap
    @ViewModelKey(TaskListViewModel.class)
    AssistedViewModelFactory taskListViewModelFactory(TaskListViewModel.Factory factory);

    @ContributesAndroidInjector(modules = TaskStatisticsFragmentModule.class)
    TaskStatisticsFragment taskStatisticsFragment();

    @ContributesAndroidInjector(modules = TaskDetailFragmentModule.class)
    TaskDetailFragment taskDetailFragment();

    @ContributesAndroidInjector(modules = TaskAddEditFragmentModule.class)
    TaskAddEditFragment taskAddEditFragment();
}
