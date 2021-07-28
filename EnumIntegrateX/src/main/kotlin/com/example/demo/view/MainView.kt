package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.MainController
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import javafx.scene.effect.DropShadow
import javafx.scene.paint.Color
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    val mainController: MainController by inject()

    override val root = vbox {
        spacing = 20.0
        hboxConstraints {
            alignment = Pos.TOP_LEFT
        }
        stackpane {
            effect = DropShadow(2.0, Color.WHITESMOKE)
            rectangle {
                stackpaneConstraints {
                    alignment = Pos.TOP_LEFT
                }
                arcHeight = 18.0
                arcWidth = 18.0
                width = 350.0
                height = 30.0
                strokeWidth = 1.0
                fill = Color.BLACK
            }
        }
    }
}