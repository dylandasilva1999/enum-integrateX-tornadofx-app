package com.example.demo.view.students.studentDetailsView

import com.example.demo.app.Styles
import com.example.demo.model.SubjectModel
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class subjectDetailsView() : Fragment("Student Details View") {

    val subjectModel: SubjectModel by inject()

    override val root = vbox {

        fun closeDetails() {
            removeFromParent()
            clear()
        }
        style {
            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
        }

        fun subjectCardsColour(): Color {
            return when (subjectModel.name.value) {
                "Creative Computing" -> Styles.ccColor
                "Interaction Design" -> Styles.idColor
                "3D Design" -> Styles.ddColor
                "Illustration" -> Styles.ilColor
                "Motion Design" -> Styles.mdColor
                "Photography" -> Styles.pgColor
                "Game Design" -> Styles.gdColor
                "Visual Culture" -> Styles.vcColor
                else -> Styles.mutedDarkBlueColor
            }
        }

        stackpane {
            stackpaneConstraints {
                paddingTop = -100.0
            }
            rectangle {
                arcHeight = 60.0
                arcWidth = 60.0
                width = 1460.0
                height = 400.0
                strokeWidth = 1.0
                fill = Styles.darkBlueColor
                opacity = 1.0
            }
            vbox {
                label("Subject Details") {
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
                hbox {
                    imageview(subjectModel.image) {
                        hboxConstraints {
                            marginTop = 20.0
                            marginLeft = 60.0
                        }
                        fitHeight = 255.0
                        fitWidth = 255.0
                        isPreserveRatio = true
                    }
                    rectangle {
                        hboxConstraints {
                            marginTop = -35.0
                            marginLeft = 60.0
                        }
                        width = 3.0
                        height = 310.0
                        strokeWidth = 1.0
                        fill = Styles.mutedDarkBlueColor
                        opacity = 1.0
                    }
                    vbox {
                        label(subjectModel.name) {
                            vboxConstraints {
                                marginTop = -35.0
                                marginLeft = 60.0
                            }
                            style {
                                fontWeight = FontWeight.BOLD
                                textFill = Color.WHITE
                                fontSize = 26.px
                                fontFamily = "Source Sans Pro"
                            }
                        }
                        label("Subject") {
                            vboxConstraints {
                                marginTop = 0.0
                                marginLeft = 60.0
                            }
                            style {
                                fontWeight = FontWeight.NORMAL
                                textFill = Color.WHITE
                                fontSize = 20.px
                                fontFamily = "Source Sans Pro"
                            }
                        }
                        hbox {
                            stackpane {
                                stackpaneConstraints {
                                    paddingLeft = 60.0
                                    paddingTop = 30.0
                                }
                                rectangle {
                                    arcHeight = 20.0
                                    arcWidth = 20.0
                                    width = 110.0
                                    height = 90.0
                                    strokeWidth = 1.0
                                    fill = subjectCardsColour()
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Code") {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.NORMAL
                                            textFill = Color.WHITE
                                            fontSize = 18.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                    label(subjectModel.code) {
                                        vboxConstraints {
                                            marginTop = 10.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 18.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                }
                            }
                            stackpane {
                                stackpaneConstraints {
                                    paddingLeft = 15.0
                                    paddingTop = 30.0
                                }
                                rectangle {
                                    arcHeight = 20.0
                                    arcWidth = 20.0
                                    width = 360.0
                                    height = 90.0
                                    strokeWidth = 1.0
                                    fill = subjectCardsColour()
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Lecturer") {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.NORMAL
                                            textFill = Color.WHITE
                                            fontSize = 18.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                    label(subjectModel.lecturer) {
                                        vboxConstraints {
                                            marginTop = 5.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 24.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                }
                            }
                            stackpane {
                                stackpaneConstraints {
                                    paddingLeft = 15.0
                                    paddingTop = 30.0
                                }
                                rectangle {
                                    arcHeight = 20.0
                                    arcWidth = 20.0
                                    width = 120.0
                                    height = 90.0
                                    strokeWidth = 1.0
                                    fill = subjectCardsColour()
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Credits") {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.NORMAL
                                            textFill = Color.WHITE
                                            fontSize = 18.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                    label(subjectModel.credits) {
                                        vboxConstraints {
                                            marginTop = 5.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 24.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                }
                            }
                        }
                        hbox {
                            stackpane {
                                stackpaneConstraints {
                                    paddingLeft = 60.0
                                    paddingTop = 15.0
                                }
                                rectangle {
                                    arcHeight = 20.0
                                    arcWidth = 20.0
                                    width = 345.0
                                    height = 115.0
                                    strokeWidth = 1.0
                                    fill = subjectCardsColour()
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Description") {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.NORMAL
                                            textFill = Color.WHITE
                                            fontSize = 18.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                    label(subjectModel.description) {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 16.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                        maxWidth = 200.0
                                    }
                                }
                            }
                            stackpane {
                                stackpaneConstraints {
                                    paddingLeft = 15.0
                                    paddingTop = 15.0
                                }
                                rectangle {
                                    arcHeight = 20.0
                                    arcWidth = 20.0
                                    width = 200.0
                                    height = 115.0
                                    strokeWidth = 1.0
                                    fill = subjectCardsColour()
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Hours per week") {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.NORMAL
                                            textFill = Color.WHITE
                                            fontSize = 18.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                    label(subjectModel.hoursPerWeek) {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 35.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                }
                            }
                            stackpane {
                                stackpaneConstraints {
                                    paddingLeft = 15.0
                                    paddingTop = 15.0
                                }
                                rectangle {
                                    arcHeight = 20.0
                                    arcWidth = 20.0
                                    width = 200.0
                                    height = 115.0
                                    strokeWidth = 1.0
                                    fill = subjectCardsColour()
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Price per month") {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.NORMAL
                                            textFill = Color.WHITE
                                            fontSize = 18.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                    label("R${subjectModel.pricePerMonth.value}") {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 35.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                }
                            }
                        }
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