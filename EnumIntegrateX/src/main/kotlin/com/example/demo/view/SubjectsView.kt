package com.example.demo.view

import com.example.demo.controller.StudentsController
import com.example.demo.controller.SubjectsController
import tornadofx.*

class SubjectsView : View("Subjects View") {

    //Instance of subjectsController
    val subjectsController: SubjectsController by inject()

    //Root Layout
    override val root = hbox {
    }
}