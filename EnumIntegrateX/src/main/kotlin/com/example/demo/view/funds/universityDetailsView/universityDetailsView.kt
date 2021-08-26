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
                height = 380.0
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
                imageview(universityModel.image) {
                    vboxConstraints {
                        marginTop = 30.0
                        marginLeft = 60.0
                    }
                    fitHeight = 100.0
                    fitWidth = 300.0
                    isPreserveRatio = true
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
                            width = 450.0
                            height = 150.0
                            strokeWidth = 1.0
                            fill = Styles.darkerBlueColor
                            opacity = 1.0
                        }
                        vbox {
                            hbox {
                                imageview("fund-blue-icon.png") {
                                    hboxConstraints {
                                        marginTop = 50.0
                                        marginLeft = 40.0
                                    }
                                    fitHeight = 60.0
                                    fitWidth = 60.0
                                    isPreserveRatio = true
                                }
                                vbox {
                                    label("Total Balance") {
                                        vboxConstraints {
                                            marginTop = 45.0
                                            marginLeft = 20.0
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
                                            marginLeft = 20.0
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
                            width = 890.0
                            height = 150.0
                            strokeWidth = 1.0
                            fill = Styles.darkerBlueColor
                            opacity = 1.0
                        }
                        vbox {
                            label("Description") {
                                vboxConstraints {
                                    marginTop = 30.0
                                    marginLeft = 40.0
                                }
                                style {
                                    fontWeight = FontWeight.BOLD
                                    textFill = Color.WHITE
                                    fontSize = 14.px
                                    fontFamily = "Source Sans Pro"
                                }
                            }
                            label(universityModel.description) {
                                vboxConstraints {
                                    marginTop = 5.0
                                    marginLeft = 40.0
                                }
                                style {
                                    fontWeight = FontWeight.NORMAL
                                    textFill = Color.WHITE
                                    fontSize = 18.px
                                    fontFamily = "Source Sans Pro"
                                }
                                maxWidth = 820.0
                                maxHeight = 150.0
                                isWrapText = true
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