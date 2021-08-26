package com.example.demo.controller.funds

import com.example.demo.model.Student
import com.example.demo.model.University
import tornadofx.*

class FundsController: Controller() {
    val universityList = mutableListOf(
        University("Open Window Institute",2000000.00, "university-1.png", "Open Window is an accredited private higher education provider. " +
                "It was established in 1993 as an art school. It has since expanded into an institute offering three bachelor's degrees, a postgraduate degree and " +
                "accredited certificates."),
    ).asObservable()
}