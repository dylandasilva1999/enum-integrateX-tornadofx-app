package com.example.demo.app

import javafx.scene.text.FontWeight
import tornadofx.*
import tornadofx.CssRule.Companion.c

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()

        val login by cssclass()

        val orangeColor = c("#FF5D3C", 1.0)
        val mutedOrangeColor = c("#FFDCD4", 1.0)
        val darkBlueColor = c("#171521", 1.0)
    }

    init {
        label and heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }
    }
}