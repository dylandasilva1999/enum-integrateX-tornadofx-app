package com.example.demo.view

import com.example.demo.controller.FundsController
import com.example.demo.controller.StaffController
import com.example.demo.controller.StudentsController
import com.example.demo.controller.SubjectsController
import tornadofx.*

class FundsView : View("Funds View") {

    //Instance of fundsController
    val fundsController: FundsController by inject()

    //Root Layout
    override val root = hbox {
    }
}