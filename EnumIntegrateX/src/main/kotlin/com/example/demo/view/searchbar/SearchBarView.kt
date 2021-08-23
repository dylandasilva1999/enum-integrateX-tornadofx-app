package com.example.demo.view.searchbar

import com.example.demo.app.Styles
import javafx.geometry.Orientation
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

//Search Bar Students
class SearchBarViewStudents : View("Search Bar View Dashboard") {
    override val root = hbox {
        form {
            style {
                fontSize = 20.px
                fontWeight = FontWeight.BOLD
                fontFamily = "Source Sans Pro"
                prefWidth = 1190.px
            }
            useMaxWidth = true
            fieldset {
                labelPosition = Orientation.HORIZONTAL
                field() {
                    textfield() {
                        style {
                            textFill = Color.WHITE
                            backgroundColor = multi(
                                Styles.darkBlueColor,
                                Styles.darkBlueColor,
                                Styles.darkBlueColor
                            )
                            padding = box(15.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.darkBlueColor)
                        }
                    }.promptText = "Search for student by name or ID"
                }
            }
        }
        button("Search") {
            hboxConstraints {
                marginLeft = 10.0
                marginTop = 17.0
            }
            action {
                //Action here
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
            paddingAll = 15.0
        }
    }
}

//Search Bar Subjects
class SearchBarViewSubjects : View("Search Bar View Subjects") {
    override val root = hbox {
        form {
            style {
                fontSize = 20.px
                fontWeight = FontWeight.BOLD
                fontFamily = "Source Sans Pro"
                prefWidth = 1190.px
            }
            useMaxWidth = true
            fieldset {
                labelPosition = Orientation.HORIZONTAL
                field() {
                    textfield() {
                        style {
                            textFill = Color.WHITE
                            backgroundColor = multi(
                                Styles.darkBlueColor,
                                Styles.darkBlueColor,
                                Styles.darkBlueColor
                            )
                            padding = box(15.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.darkBlueColor)
                        }
                    }.promptText = "Search for subject by name or code"
                }
            }
        }
        button("Search") {
            hboxConstraints {
                marginLeft = 10.0
                marginTop = 17.0
            }
            action {
                //Action here
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
            paddingAll = 15.0
        }
    }
}

//Search Bar Staff
class SearchBarViewStaff : View("Search Bar View Staff") {
    override val root = hbox {
        form {
            style {
                fontSize = 20.px
                fontWeight = FontWeight.BOLD
                fontFamily = "Source Sans Pro"
                prefWidth = 1190.px
            }
            useMaxWidth = true
            fieldset {
                labelPosition = Orientation.HORIZONTAL
                field() {
                    textfield() {
                        style {
                            textFill = Color.WHITE
                            backgroundColor = multi(
                                Styles.darkBlueColor,
                                Styles.darkBlueColor,
                                Styles.darkBlueColor
                            )
                            padding = box(15.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.darkBlueColor)
                        }
                    }.promptText = "Search for staff member by name or ID"
                }
            }
        }
        button("Search") {
            hboxConstraints {
                marginLeft = 10.0
                marginTop = 17.0
            }
            action {
                //Action here
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
            paddingAll = 15.0
        }
    }
}