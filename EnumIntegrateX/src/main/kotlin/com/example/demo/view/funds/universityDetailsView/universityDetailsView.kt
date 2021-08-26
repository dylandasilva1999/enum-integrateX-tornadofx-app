package com.example.demo.view.funds.universityDetailsView

import com.example.demo.app.Styles
import com.example.demo.model.StudentModel
import com.example.demo.model.UniversityModel
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class universityDetailsView() : Fragment("University Details View") {

    val universityModel: UniversityModel by inject()

    override val root = vbox {

        fun closeDetails() {
            removeFromParent()
            clear()
        }
        style {
            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
        }

        stackpane {
            stackpaneConstraints {
                paddingTop = -130.0
            }
            rectangle {
                arcHeight = 60.0
                arcWidth = 60.0
                width = 1460.0
                height = 400.0
                strokeWidth = 1.0
                fill = Styles.blueColor
                opacity = 1.0
            }
            vbox {
                label("University Overview") {
                    vboxConstraints {
                        marginTop = 40.0
                        marginLeft = 60.0
                    }
                    style {
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        fontSize = 26.px
                        fontFamily = "Source Sans Pro"
                    }
                }
            }
            button("Close") {
                stackpaneConstraints {
                    marginTop = -280.0
                    marginLeft = 1250.0
                }
                action {
                    closeDetails()
                }
                style {
                    fontSize = 20.px
                    borderWidth += box(2.5.px)
                    borderColor += box(Styles.mutedDarkBlueColor)
                    backgroundRadius += box(9.px)
                    borderRadius += box(8.px)
                    fontFamily = "Source Sans Pro"
                    fontWeight = FontWeight.BOLD
                    textFill = Color.WHITE
                    backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
                }
                useMaxWidth = false
                paddingAll = 12.0
                paddingLeft = 30.0
                paddingRight = 30.0
            }
        }
    }
}