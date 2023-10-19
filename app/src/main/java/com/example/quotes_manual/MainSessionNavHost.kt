package com.example.quotes_manual

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dev.hotwire.turbo.config.TurboPathConfiguration
import dev.hotwire.turbo.session.TurboSessionNavHostFragment
import kotlin.reflect.KClass

class MainSessionNavHost : TurboSessionNavHostFragment() {
    override var sessionName = "main"
    override var startLocation = "https://3000-nachovz-railsturbo-yfumzrlo3mn.ws-us105.gitpod.io/quotes"

    override val registeredFragments: List<KClass<out Fragment>>
        get() = listOf(
            WebFragment::class,
            WebModalFragment::class,
            WebBottomSheetFragment::class
        )


    override val registeredActivities: List<KClass<out AppCompatActivity>>
        get() = listOf()

    override val pathConfigurationLocation: TurboPathConfiguration.Location
        get() = TurboPathConfiguration.Location( assetFilePath = "json/configuration.json")

}