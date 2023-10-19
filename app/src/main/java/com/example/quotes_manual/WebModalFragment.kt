package com.example.quotes_manual

import android.os.Bundle
import android.view.View
import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "turbo://fragment/web/modal")
class WebModalFragment : WebFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //initToolbar()
    }

    /*private fun initToolbar() {
        toolbarForNavigation()?.displayBackButtonAsCloseIcon()
    }*/
}
