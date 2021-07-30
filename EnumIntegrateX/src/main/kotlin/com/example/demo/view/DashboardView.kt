package com.example.demo.view

import com.example.demo.controller.DashboardController
import tornadofx.*

class DashboardView : View("Dashboard View") {

    //Instance of dashboardController
    val dashboardController: DashboardController by inject()

    //Root Layout
    override val root = vbox {
        label("Dashboard View")
    }
}