package com.manop.amphibians

import android.app.Application
import com.manop.amphibians.data.AppContainer
import com.manop.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}