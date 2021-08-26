package com.example.demo.controller.funds

import com.example.demo.model.Student
import com.example.demo.model.University
import tornadofx.*

class FundsController: Controller() {
    val universityList = mutableListOf(
        University("Open Window Institute",2000000.00, "university-1.png"),
    ).asObservable()
}