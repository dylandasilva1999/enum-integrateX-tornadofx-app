package com.example.demo.view.funds.universityItemView

import com.example.demo.app.Styles
import com.example.demo.controller.funds.FundsController
import com.example.demo.model.Student
import com.example.demo.model.StudentModel
import com.example.demo.model.University
import com.example.demo.model.UniversityModel
import com.example.demo.view.funds.universityDetailsView.universityDetailsView
import com.example.demo.view.students.studentDetailsView.studentDetailsView
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class universityItemView(val universityModel: UniversityModel) : View("University Item View") {
    //Instance of fundsController
    val fundsController: FundsController by inject()
    //Student List
    val universityList = fundsController.universityList

    fun getUniversity(): University {
        val selectedUniversity = University(
            universityModel.name.value,
            universityModel.poolFund.value,
            universityModel.image.value,
            universityModel.description.value,
        )
        return selectedUniversity
    }

    override val root = vbox {

        val universityModel = UniversityModel(getUniversity())

        val fragmentScope = Scope()
        setInScope(universityModel, fragmentScope)

        fun changeView() {
            this += find<universityDetailsView>(fragmentScope)
        }

        stackpane {
            stackpaneConstraints {
                paddingTop = 20.0
            }
            rectangle {
                arcHeight = 60.0
                arcWidth = 60.0
                width = 1460.0
                height = 130.0
                strokeWidth = 1.0
                fill = Styles.blueColor
                opacity = 1.0
            }
            hbox {
                imageview(universityModel.image) {
                    hboxConstraints {
                        marginTop = 35.0
                        marginLeft = 50.0
                    }
                    fitHeight = 100.0
                    fitWidth = 300.0
                    isPreserveRatio = true
                }
                vbox {
                    label("Total Balance") {
                        vboxConstraints {
                            marginTop = 35.0
                            marginLeft = 800.0
                        }
                        style {
                            fontWeight = FontWeight.NORMAL
                            textFill = Color.WHITE
                            fontSize = 16.px
                            fontFamily = "Source Sans Pro"
                            fill = Styles.mutedBlueColor
                        }
                        minWidth = 50.0
                    }
                    label("R${universityModel.poolFund.value}") {
                        vboxConstraints {
                            marginTop = -8.0
                            marginLeft = 800.0
                        }
                        style {
                            fontWeight = FontWeight.BOLD
                            textFill = Color.WHITE
                            fontSize = 48.px
                            fontFamily = "Source Sans Pro"
                        }
                        minWidth = 320.0
                    }
                }
                button("View University Details") {
                    hboxConstraints {
                        marginTop = -75.0
                        marginLeft = -260.0
                    }
                    action {
                        getUniversity()
                        changeView()
                    }
                    style {
                        fontSize = 20.px
                        borderWidth += box(1.5.px)
                        backgroundRadius += box(9.px)
                        fontFamily = "Source Sans Pro"
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        backgroundColor = multi(Styles.orangeColor, Styles.orangeColor, Styles.orangeColor)
                    }
                    useMaxWidth = true
                    paddingAll = 12.0
                    paddingLeft = 30.0
                    paddingRight = 30.0
                }
            }
        }
    }
}