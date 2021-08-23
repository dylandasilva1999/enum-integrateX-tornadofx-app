package com.example.demo.view.students.studentDetailsView

import com.example.demo.app.Styles
import com.example.demo.model.AcademicStaffModel
import com.example.demo.model.AdminStaffModel
import com.example.demo.model.StudentModel
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class adminStaffDetailsView() : Fragment("Admin Staff Details View") {

    val adminStaffModel: AdminStaffModel by inject()

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
                label("Profile Overview") {
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
                    imageview(adminStaffModel.image) {
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
                        label(adminStaffModel.fullName) {
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
                        label("Admin Staff") {
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
                                    width = 180.0
                                    height = 90.0
                                    strokeWidth = 1.0
                                    fill = Styles.blueColor
                                    opacity = 1.0
                                }
                                vbox {
                                    label("ID") {
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
                                    label(adminStaffModel.idNumber) {
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
                                    width = 150.0
                                    height = 90.0
                                    strokeWidth = 1.0
                                    fill = Styles.yellowColor
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Role") {
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
                                    label(adminStaffModel.role) {
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
//                            stackpane {
//                                stackpaneConstraints {
//                                    paddingLeft = 15.0
//                                    paddingTop = 30.0
//                                }
//                                rectangle {
//                                    arcHeight = 20.0
//                                    arcWidth = 20.0
//                                    width = 260.0
//                                    height = 90.0
//                                    strokeWidth = 1.0
//                                    fill = Styles.orangeColor
//                                    opacity = 1.0
//                                }
//                                vbox {
//                                    label("S") {
//                                        vboxConstraints {
//                                            marginTop = 15.0
//                                            marginLeft = 20.0
//                                        }
//                                        style {
//                                            fontWeight = FontWeight.NORMAL
//                                            textFill = Color.WHITE
//                                            fontSize = 18.px
//                                            fontFamily = "Source Sans Pro"
//                                        }
//                                    }
//                                    label(studentModel.education) {
//                                        vboxConstraints {
//                                            marginTop = 5.0
//                                            marginLeft = 20.0
//                                        }
//                                        style {
//                                            fontWeight = FontWeight.BOLD
//                                            textFill = Color.WHITE
//                                            fontSize = 24.px
//                                            fontFamily = "Source Sans Pro"
//                                        }
//                                    }
//                                }
//                            }
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
                                    fill = Styles.mutedDarkBlueColor
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Email") {
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
                                    label(adminStaffModel.email) {
                                        vboxConstraints {
                                            marginTop = 15.0
                                            marginLeft = 20.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 22.px
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
                                    width = 260.0
                                    height = 115.0
                                    strokeWidth = 1.0
                                    fill = Styles.mutedDarkBlueColor
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Salary") {
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
                                    label("R${adminStaffModel.salary.value}") {
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
//                            stackpane {
//                                stackpaneConstraints {
//                                    paddingLeft = 15.0
//                                    paddingTop = 15.0
//                                }
//                                rectangle {
//                                    arcHeight = 20.0
//                                    arcWidth = 20.0
//                                    width = 320.0
//                                    height = 115.0
//                                    strokeWidth = 1.0
//                                    fill = Styles.mutedDarkBlueColor
//                                    opacity = 1.0
//                                }
//                                vbox {
//                                    label("Student Email") {
//                                        vboxConstraints {
//                                            marginTop = 15.0
//                                            marginLeft = 20.0
//                                        }
//                                        style {
//                                            fontWeight = FontWeight.NORMAL
//                                            textFill = Color.WHITE
//                                            fontSize = 18.px
//                                            fontFamily = "Source Sans Pro"
//                                        }
//                                    }
//                                    label(studentModel.email) {
//                                        vboxConstraints {
//                                            marginTop = 30.0
//                                            marginLeft = 20.0
//                                        }
//                                        style {
//                                            fontWeight = FontWeight.BOLD
//                                            textFill = Color.WHITE
//                                            fontSize = 20.px
//                                            fontFamily = "Source Sans Pro"
//                                        }
//                                    }
//                                }
//                            }
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