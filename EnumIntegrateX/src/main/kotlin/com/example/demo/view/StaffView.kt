package com.example.demo.view

import com.example.demo.controller.StaffController
import com.example.demo.controller.StudentsController
import com.example.demo.controller.SubjectsController
import tornadofx.*

class StaffView : View("Staff View") {

    //Instance of staffController
    val staffController: StaffController by inject()

    //Root Layout
    override val root = hbox {
    }
}