package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    val mainController: MainController by inject()

    override val root = vbox {
        alignment = Pos.CENTER
        spacing = 50.0

        label(mainController.labelText) {
            bind(mainController.labelText)
            addClass(Styles.heading)
        }

        button {
            this.text = "Click Here"
            action {
                mainController.getRandomLabel()
            }
        }
    }
}