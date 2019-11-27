package com.wayfair.todomvrxdatabinding.app

import android.app.Application
import androidx.fragment.app.FragmentActivity
import com.airbnb.mvrx.BaseMvRxViewModel
import com.airbnb.mvrx.FragmentViewModelContext
import com.airbnb.mvrx.MvRxState
import com.airbnb.mvrx.ViewModelContext
import com.wayfair.todomvrxdatabinding.AssistedViewModelFactory
import com.wayfair.todomvrxdatabinding.HasViewModelFactory
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import com.wayfair.todomvrxdatabinding.app.di.AppComponent


class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        //appComponent = DaggerAppComponent.factory().create(this)
        //appComponent = DaggerAppComponent.create()
    }

    /*override fun applicationInjector(): AndroidInjector<App> {
        return DaggerAppComponent.factory().create(this)
    }*/
}

@Suppress("UNCHECKED_CAST")
inline fun <reified VM : BaseMvRxViewModel<S>, reified S : MvRxState> ViewModelContext.createViewModel(initialState: S)
        {
val viewModelFactoryMap = this.appComponent().viewModelFactories()
val viewModelFactory = viewModelFactoryMap[viewModelClass]
@Suppress("UNCHECKED_CAST")
val castedViewModelFactory = viewModelFactory as? AssistedViewModelFactory<VM, S>
val viewModel = castedViewModelFactory?.create(state)
return viewModel as VM
        }
