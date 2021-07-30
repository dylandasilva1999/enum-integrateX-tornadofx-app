package com.example.demo.view

import com.example.demo.app.Styles
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*
import java.io.File

class LoginView : View("Login View") {
    val mainController: MainController by inject()

    override val root = vbox {
        Form().addClass(Styles.login)
        style {
            backgroundImage += File("src/main/resources/login-background.jpg").toURI()
        }
        setPrefSize(1920.0, 1080.0)
        paddingAll = 220.0
        hbox {
            hboxConstraints {
                alignment = Pos.CENTER
            }
            stackpane {
                rectangle {
                    arcHeight = 50.0
                    arcWidth = 50.0
                    width = 500.0
                    height = 600.0
                    strokeWidth = 1.0
                    fill = Color.WHITE
                    opacity = 1.0
                }
                vbox {
                    imageview("logo-icon-dark.png") {
                        vboxConstraints {
                            marginTop = 70.0
                            marginLeft = 20.0
                            alignment = Pos.CENTER
                        }
                        fitHeight = 160.0
                        fitWidth = 160.0
                        isPreserveRatio = true
                    }
                    form {
                        style {
                            paddingTop = 25.0
                            paddingLeft = 80.0
                            paddingRight = 80.0
                            paddingBottom = 80.0
                            fontSize = 20.px
                            fontWeight = FontWeight.BOLD
                            fontFamily = "Source Sans Pro"
                            prefWidth = 300.px
                        }
                        fieldset {
                            labelPosition = Orientation.VERTICAL
                            field ("Username") {
                                textfield {
                                    style {
                                        textFill = Styles.darkBlueColor
                                        backgroundColor = multi(Styles.mutedOrangeColor, Styles.mutedOrangeColor, Styles.mutedOrangeColor)
                                        padding = box(15.px)
                                        borderWidth += box(1.5.px)
                                        backgroundRadius += box(9.px)
                                        borderRadius += box(9.px)
                                        borderColor += box(Styles.mutedOrangeColor)
                                    }
                                }
                            }
                            field ("Password") {
                                passwordfield {
                                    style {
                                        textFill = Styles.darkBlueColor
                                        backgroundColor = multi(Styles.mutedOrangeColor, Styles.mutedOrangeColor, Styles.mutedOrangeColor)
                                        padding = box(15.px)
                                        borderWidth += box(1.5.px)
                                        backgroundRadius += box(9.px)
                                        borderRadius += box(9.px)
                                        borderColor += box(Styles.mutedOrangeColor)
                                    }
                                }
                            }
                        }
                        button ("Sign In"){
                            vboxConstraints {
                                marginTop = 20.0
                            }
                            useMaxWidth = true
                            paddingAll = 15.0
                            style {
                                fontSize = 20.px
                                borderWidth += box(1.5.px)
                                backgroundRadius += box(9.px)
                                fontFamily = "Source Sans Pro"
                                fontWeight = FontWeight.BOLD
                                textFill = Color.WHITE
                                backgroundColor += Styles.orangeColor
                            }
                            action {

                            }
                        }
                    }
                }
            }
        }
    }
}