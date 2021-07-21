package com.example.demo.controller

import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class MainController: Controller() {
    val labelText = SimpleStringProperty("Initial Value")
    private var labelsList: List<String> = listOf(
        "Label One",
        "Label Two",
        "Label Three",
        "Label Four",
        "Label Five"
    )

    fun getRandomLabel() {
        var randomInteger: Int = (0..(labelsList.size - 1)).shuffled().first()
        labelText.value = labelsList[randomInteger]
    }
}