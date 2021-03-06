package com.example.demo.view.funds

import com.example.demo.app.Styles
import com.example.demo.controller.funds.FundsController
import com.example.demo.controller.students.StudentsController
import com.example.demo.model.StudentModel
import com.example.demo.model.University
import com.example.demo.model.UniversityModel
import com.example.demo.view.staff.StaffView
import com.example.demo.view.students.StudentsView
import com.example.demo.view.subjects.SubjectsView
import com.example.demo.view.dashboard.DashboardView
import com.example.demo.view.funds.universityItemView.universityItemView
import com.example.demo.view.login.LoginView
import com.example.demo.view.students.studentListItemView.studentListItemView
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class FundsView : View("Funds View") {

    //Instance of fundsController
    val fundsController: FundsController by inject()
    //Student List
    val universityList = fundsController.universityList

    var universityPoolFund = fundsController.universityPoolFundTotal().value.toDouble()
    val totalOutgoingFunds = fundsController.getTotalAdminStaffFees().value.toDouble() + fundsController.getTotalAcademicStaffFees().value.toDouble()
    val totalIncomingFunds = fundsController.getTotalStudentFees().value.toDouble()

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
                            marginTop = 30.0
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
                            find(FundsView::class).replaceWith(DashboardView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                            find(FundsView::class).replaceWith(StudentsView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                            find(FundsView::class).replaceWith(SubjectsView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                            find(FundsView::class).replaceWith(StaffView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                            backgroundColor = multi(Color.TRANSPARENT, Color.TRANSPARENT, Color.TRANSPARENT)
                        }
                        paddingAll = 12.0
                        paddingLeft = 40.0
                    }
                    button("Funds") {
                        action {
                            find(FundsView::class).refreshable
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
                            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
                        }
                        paddingAll = 12.0
                        paddingLeft = 38.0
                    }
                    vbox {
                        vboxConstraints {
                            alignment = Pos.BOTTOM_LEFT
                            marginTop = 440.0
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
                        button("Sign out") {
                            vboxConstraints {
                                marginLeft = 55.0
                                marginTop = 20.0
                                marginRight = 55.0
                            }
                            action {
                                find(FundsView::class).replaceWith(LoginView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Slide(0.5.seconds))
                            }
                            style {
                                fontSize = 20.px
                                borderWidth += box(2.5.px)
                                backgroundRadius += box(9.px)
                                fontFamily = "Source Sans Pro"
                                fontWeight = FontWeight.BOLD
                                textFill = Color.WHITE
                                backgroundColor = multi(Styles.yellowColor, Styles.yellowColor, Styles.yellowColor)
                            }
                            useMaxWidth = true
                            paddingAll = 15.0
                        }
                    }
                }
            }
        }
        vbox {
            hbox {
                hboxConstraints {
                    alignment = Pos.CENTER_LEFT
                }
                useMaxWidth = true
            }
            vboxConstraints {
                alignment = Pos.CENTER_LEFT
            }
            useMaxHeight = true
            useMaxWidth = true
            stackpane {
                rectangle {
                    width = 1480.0
                    height = 920.0
                    strokeWidth = 1.0
                    fill = Color.TRANSPARENT
                    opacity = 1.0
                }
                vbox {
                    label("University Pool Fund") {
                        vboxConstraints {
                            marginTop = 0.0
                            marginLeft = 12.0
                        }
                        style {
                            fontWeight = FontWeight.BOLD
                            textFill = Color.WHITE
                            fontSize = 36.px
                            fontFamily = "Source Sans Pro"
                        }
                    }
                    for (university in universityList) {
                        add(universityItemView(UniversityModel(university)))
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
                            fill = Styles.darkBlueColor
                            opacity = 1.0
                        }
                        hbox {
                            imageview("payment-icon.png") {
                                hboxConstraints {
                                    marginTop = 40.0
                                    marginLeft = 50.0
                                }
                                fitHeight = 60.0
                                fitWidth = 60.0
                                isPreserveRatio = true
                            }
                            label("Incoming Tuition") {
                                hboxConstraints {
                                    marginTop = 50.0
                                    marginLeft = 30.0
                                }
                                style {
                                    fontWeight = FontWeight.NORMAL
                                    textFill = Color.WHITE
                                    fontSize = 24.px
                                    fontFamily = "Source Sans Pro"
                                }
                            }
                            label("+${fundsController.incomingPayments().value.toString()}") {
                                hboxConstraints {
                                    marginTop = 40.0
                                    marginLeft = 880.0
                                }
                                style {
                                    fontWeight = FontWeight.BOLD
                                    textFill = Color.WHITE
                                    fontSize = 36.px
                                    fontFamily = "Source Sans Pro"
                                }
                            }
                        }
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
                            fill = Styles.darkBlueColor
                            opacity = 1.0
                        }
                        hbox {
                            imageview("withdrawel-icon.png") {
                                hboxConstraints {
                                    marginTop = 40.0
                                    marginLeft = 50.0
                                }
                                fitHeight = 60.0
                                fitWidth = 60.0
                                isPreserveRatio = true
                            }
                            label("Outgoing Salaries") {
                                hboxConstraints {
                                    marginTop = 50.0
                                    marginLeft = 30.0
                                }
                                style {
                                    fontWeight = FontWeight.NORMAL
                                    textFill = Color.WHITE
                                    fontSize = 24.px
                                    fontFamily = "Source Sans Pro"
                                }
                            }
                            label("-${fundsController.outgoingPayments().value.toString()}") {
                                hboxConstraints {
                                    marginTop = 40.0
                                    marginLeft = 880.0
                                }
                                style {
                                    fontWeight = FontWeight.BOLD
                                    textFill = Color.WHITE
                                    fontSize = 36.px
                                    fontFamily = "Source Sans Pro"
                                }
                            }
                        }
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
                            fill = Color.TRANSPARENT
                            opacity = 1.0
                        }
                        hbox {
                            button("Close of the month") {
                                hboxConstraints {
                                    marginTop = 10.0
                                    marginLeft = 1010.0
                                }
                                action {
                                    fundsController.settlePayments()
                                    println(fundsController.universityPoolFundTotal().value)
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
                            button("Start new month") {
                                hboxConstraints {
                                    marginTop = 10.0
                                    marginLeft = 20.0
                                }
                                action {
                                }
                                style {
                                    fontSize = 20.px
                                    borderWidth += box(1.5.px)
                                    backgroundRadius += box(9.px)
                                    fontFamily = "Source Sans Pro"
                                    fontWeight = FontWeight.BOLD
                                    textFill = Color.WHITE
                                    backgroundColor = multi(Styles.yellowColor, Styles.yellowColor, Styles.yellowColor)
                                }
                                useMaxWidth = true
                                paddingAll = 12.0
                                paddingLeft = 30.0
                                paddingRight = 30.0
                            }
                        }
                    }
                }
                universityList.onChange {
                    // Clear View
                    this.clear()
                    vbox {
                        label("University Pool Fund") {
                            vboxConstraints {
                                marginTop = 0.0
                                marginLeft = 12.0
                            }
                            style {
                                fontWeight = FontWeight.BOLD
                                textFill = Color.WHITE
                                fontSize = 36.px
                                fontFamily = "Source Sans Pro"
                            }
                        }
                        for (university in universityList) {
                            add(universityItemView(UniversityModel(university)))
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
                                fill = Styles.darkBlueColor
                                opacity = 1.0
                            }
                            hbox {
                                imageview("payment-icon.png") {
                                    hboxConstraints {
                                        marginTop = 40.0
                                        marginLeft = 50.0
                                    }
                                    fitHeight = 60.0
                                    fitWidth = 60.0
                                    isPreserveRatio = true
                                }
                                label("Incoming Tuition") {
                                    hboxConstraints {
                                        marginTop = 50.0
                                        marginLeft = 30.0
                                    }
                                    style {
                                        fontWeight = FontWeight.NORMAL
                                        textFill = Color.WHITE
                                        fontSize = 24.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                                label("+${fundsController.incomingPayments().value.toString()}") {
                                    hboxConstraints {
                                        marginTop = 40.0
                                        marginLeft = 880.0
                                    }
                                    style {
                                        fontWeight = FontWeight.BOLD
                                        textFill = Color.WHITE
                                        fontSize = 36.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                            }
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
                                fill = Styles.darkBlueColor
                                opacity = 1.0
                            }
                            hbox {
                                imageview("withdrawel-icon.png") {
                                    hboxConstraints {
                                        marginTop = 40.0
                                        marginLeft = 50.0
                                    }
                                    fitHeight = 60.0
                                    fitWidth = 60.0
                                    isPreserveRatio = true
                                }
                                label("Outgoing Salaries") {
                                    hboxConstraints {
                                        marginTop = 50.0
                                        marginLeft = 30.0
                                    }
                                    style {
                                        fontWeight = FontWeight.NORMAL
                                        textFill = Color.WHITE
                                        fontSize = 24.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                                label("-${fundsController.outgoingPayments().value.toString()}") {
                                    hboxConstraints {
                                        marginTop = 40.0
                                        marginLeft = 880.0
                                    }
                                    style {
                                        fontWeight = FontWeight.BOLD
                                        textFill = Color.WHITE
                                        fontSize = 36.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                            }
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
                                fill = Color.TRANSPARENT
                                opacity = 1.0
                            }
                            hbox {
                                button("Close of the month") {
                                    hboxConstraints {
                                        marginTop = 10.0
                                        marginLeft = 1010.0
                                    }
                                    action {
                                        fundsController.settlePayments()
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
                                button("Start new month") {
                                    hboxConstraints {
                                        marginTop = 10.0
                                        marginLeft = 20.0
                                    }
                                    action {
                                    }
                                    style {
                                        fontSize = 20.px
                                        borderWidth += box(1.5.px)
                                        backgroundRadius += box(9.px)
                                        fontFamily = "Source Sans Pro"
                                        fontWeight = FontWeight.BOLD
                                        textFill = Color.WHITE
                                        backgroundColor = multi(Styles.yellowColor, Styles.yellowColor, Styles.yellowColor)
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
            }
            paddingTop = 5.0
            paddingLeft = 50.0
            paddingRight = 50.0
            paddingBottom = 50.0
        }
    }
}