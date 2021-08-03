package com.example.demo.view

import com.example.demo.app.Styles
import com.example.demo.controller.staff.AdminStaffController
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class StaffView : View("Staff View") {

    //Instance of staffController
    val adminStaffController: AdminStaffController by inject()

    //Root Layout
    override val root = hbox {
        style {
            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
        }
        setPrefSize(1920.0, 1080.0)
        hbox {
            hboxConstraints {
                alignment = Pos.BASELINE_LEFT
            }
            useMaxHeight = true
            stackpane {
                rectangle {
                    width = 340.0
                    height = 1080.0
                    strokeWidth = 1.0
                    fill = Styles.darkBlueColor
                    opacity = 1.0
                }
                vbox {
                    imageview("side-bar-logo.png") {
                        vboxConstraints {
                            marginTop = 20.0
                            alignment = Pos.TOP_CENTER
                        }
                        fitHeight = 60.0
                        fitWidth = 230.0
                        isPreserveRatio = true
                    }
                    rectangle {
                        vboxConstraints {
                            marginTop = 20.0
                        }
                        width = 230.0
                        height = 2.0
                        strokeWidth = 1.0
                        fill = Color.WHITE
                        opacity = 0.1
                    }
                    button("Dashboard") {
                        action {
                            replaceWith<DashboardView>()
                        }
                        vboxConstraints {
                            marginTop = 20.0
                            prefWidth = 230.0
                            alignment = Pos.CENTER_LEFT
                        }
                        imageview("dashboard-menu-icon.png") {
                            fitHeight = 16.0
                            fitWidth = 16.0
                            isPreserveRatio = true
                        }
                        style {
                            fontSize = 20.px
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            fontFamily = "Source Sans Pro"
                            fontWeight = FontWeight.BOLD
                            textFill = Color.WHITE
                            backgroundColor =
                                multi(Color.TRANSPARENT, Color.TRANSPARENT, Color.TRANSPARENT)
                        }
                        paddingAll = 15.0
                        paddingLeft = 40.0
                    }
                    button("Students") {
                        action {
                            replaceWith<StudentsView>()
                        }
                        vboxConstraints {
                            marginTop = 10.0
                            prefWidth = 230.0
                            alignment = Pos.CENTER_LEFT
                        }
                        imageview("students-menu-icon.png") {
                            fitHeight = 22.0
                            fitWidth = 22.0
                            isPreserveRatio = true
                        }
                        style {
                            fontSize = 20.px
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            fontFamily = "Source Sans Pro"
                            fontWeight = FontWeight.BOLD
                            textFill = Color.WHITE
                            backgroundColor = multi(Color.TRANSPARENT, Color.TRANSPARENT, Color.TRANSPARENT)
                        }
                        paddingAll = 12.0
                        paddingLeft = 34.0
                    }
                    button("Subjects") {
                        action {
                            replaceWith<SubjectsView>()
                        }
                        vboxConstraints {
                            marginTop = 10.0
                            prefWidth = 230.0
                            alignment = Pos.CENTER_LEFT
                        }
                        imageview("subjects-menu-icon.png") {
                            fitHeight = 18.0
                            fitWidth = 18.0
                            isPreserveRatio = true
                        }
                        style {
                            fontSize = 20.px
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            fontFamily = "Source Sans Pro"
                            fontWeight = FontWeight.BOLD
                            textFill = Color.WHITE
                            backgroundColor = multi(Color.TRANSPARENT, Color.TRANSPARENT, Color.TRANSPARENT)
                        }
                        paddingAll = 12.0
                        paddingLeft = 38.0
                    }
                    button("Staff") {
                        action {
                            replaceWith<StaffView>()
                        }
                        vboxConstraints {
                            marginTop = 10.0
                            prefWidth = 230.0
                            alignment = Pos.CENTER_LEFT
                        }
                        imageview("staff-menu-icon.png") {
                            fitHeight = 18.0
                            fitWidth = 18.0
                            isPreserveRatio = true
                        }
                        style {
                            fontSize = 20.px
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            fontFamily = "Source Sans Pro"
                            fontWeight = FontWeight.BOLD
                            textFill = Color.WHITE
                            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
                        }
                        paddingAll = 12.0
                        paddingLeft = 40.0
                    }
                    button("Funds") {
                        action {
                            replaceWith<FundsView>()
                        }
                        vboxConstraints {
                            marginTop = 10.0
                            prefWidth = 230.0
                            alignment = Pos.CENTER_LEFT
                        }
                        imageview("funds-menu-icon.png") {
                            fitHeight = 18.0
                            fitWidth = 18.0
                            isPreserveRatio = true
                        }
                        style {
                            fontSize = 20.px
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            fontFamily = "Source Sans Pro"
                            fontWeight = FontWeight.BOLD
                            textFill = Color.WHITE
                            backgroundColor = multi(Color.TRANSPARENT, Color.TRANSPARENT, Color.TRANSPARENT)
                        }
                        paddingAll = 12.0
                        paddingLeft = 38.0
                    }
                    vbox {
                        vboxConstraints {
                            alignment = Pos.BOTTOM_LEFT
                            marginTop = 470.0
                        }
                        label("YOUR ACCOUNT") {
                            vboxConstraints {
                                alignment = Pos.BOTTOM_LEFT
                                marginLeft = 55.0
                            }
                            style {
                                fontWeight = FontWeight.BOLD
                                textFill = Color.WHITE
                                fontSize = 20.px
                                fontFamily = "Source Sans Pro"
                            }
                        }
                        rectangle {
                            vboxConstraints {
                                marginTop = 10.0
                                marginLeft = 55.0
                            }
                            width = 230.0
                            height = 2.0
                            strokeWidth = 1.0
                            fill = Color.WHITE
                            opacity = 0.1
                        }
                        hbox {
                            imageview("profile-menu-image.png") {
                                hboxConstraints {
                                    alignment = Pos.BOTTOM_LEFT
                                    marginLeft = 55.0
                                    marginTop = 20.0
                                }
                                fitHeight = 45.0
                                fitWidth = 45.0
                                isPreserveRatio = true
                            }
                            vbox {
                                label("Dylan da Silva") {
                                    vboxConstraints {
                                        alignment = Pos.CENTER
                                        marginLeft = 20.0
                                        marginTop = 20.0
                                    }
                                    style {
                                        fontWeight = FontWeight.BOLD
                                        textFill = Color.WHITE
                                        fontSize = 20.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                                label("Administrator") {
                                    vboxConstraints {
                                        alignment = Pos.CENTER
                                        marginLeft = 20.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_LIGHT
                                        textFill = Color.WHITE
                                        opacity = 0.38
                                        fontSize = 14.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}