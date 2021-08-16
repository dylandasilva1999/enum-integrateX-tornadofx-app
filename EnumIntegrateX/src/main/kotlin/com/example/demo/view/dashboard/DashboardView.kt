package com.example.demo.view.dashboard

import com.example.demo.app.Styles
import com.example.demo.controller.dashboard.DashboardController
import com.example.demo.controller.staff.AdminStaffController
import com.example.demo.controller.students.StudentsController
import com.example.demo.model.AdminStaffModel
import com.example.demo.view.funds.FundsView
import com.example.demo.view.staff.StaffView
import com.example.demo.view.students.StudentsView
import com.example.demo.view.subjects.SubjectsView
import com.example.demo.view.dashboard.adminListDashbooard.AdminListDashboardView
import com.example.demo.view.login.LoginView
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class DashboardView : View("Dashboard View") {

    //Instance of dashboardController
    val dashboardController: DashboardController by inject()

    //Instance of studentsController
    val studentsController: StudentsController by inject()
    //Students List
    val students = studentsController.studentsList

    //Instance of adminStaffController
    val adminStaffController: AdminStaffController by inject()
    //AdminStaff List
    val adminStaffList = adminStaffController.adminStaffList
    //Admin staff
    val adminStaff: AdminStaffModel by inject()

    //Root Layout
    override val root = hbox {
        style {
            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
        }
        setPrefSize(1920.0, 1080.0)

        //Side Bar Menu
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
                            find(DashboardView::class).replaceWith(DashboardView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                                multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
                        }
                        paddingAll = 15.0
                        paddingLeft = 40.0
                    }
                    button("Students") {
                        action {
                            find(DashboardView::class).replaceWith(StudentsView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                            find(DashboardView::class).replaceWith(SubjectsView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                            find(DashboardView::class).replaceWith(StaffView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                            find(DashboardView::class).replaceWith(FundsView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds))
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
                                find(DashboardView::class).replaceWith(LoginView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Slide(0.5.seconds))
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
        //Main Content Section (Right Side)
        vbox {
            vboxConstraints {
                alignment = Pos.CENTER_RIGHT
            }
            useMaxHeight = true
            useMaxWidth = true
            stackpane {
                rectangle {
                    arcHeight = 90.0
                    arcWidth = 90.0
                    width = 1480.0
                    height = 920.0
                    strokeWidth = 1.0
                    fill = Styles.darkBlueColor
                    opacity = 1.0
                }
                vbox {
                    label("Dashboard") {
                        vboxConstraints {
                            marginTop = 60.0
                            marginLeft = 70.0
                        }
                        style {
                            fontWeight = FontWeight.BOLD
                            textFill = Color.WHITE
                            fontSize = 36.px
                            fontFamily = "Source Sans Pro"
                        }
                    }
                    label("Open Window Insitute") {
                        vboxConstraints {
                            marginTop = -5.0
                            marginLeft = 70.0
                        }
                        style {
                            fontWeight = FontWeight.EXTRA_LIGHT
                            textFill = Color.WHITE
                            opacity = 0.75
                            fontSize = 20.px
                            fontFamily = "Source Sans Pro"
                        }
                    }
                    hbox() {
                        hboxConstraints {
                            paddingLeft = 70.0
                            paddingTop = 30.0
                        }
                        stackpane {
                            rectangle {
                                arcHeight = 60.0
                                arcWidth = 60.0
                                width = 305.0
                                height = 200.0
                                strokeWidth = 1.0
                                fill = Styles.mutedDarkBlueColor
                                opacity = 1.0
                            }
                            vbox {
                                imageview("diploma-students-icon.png") {
                                    vboxConstraints {
                                        marginTop = 32.0
                                        marginLeft = 45.0
                                    }
                                    fitHeight = 55.0
                                    fitWidth = 55.0
                                    isPreserveRatio = true
                                }
                                label(dashboardController.getTotalDiplomaStudents()) {
                                    vboxConstraints {
                                        marginLeft = 45.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_BOLD
                                        textFill = Styles.blueColor
                                        fontSize = 50.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                                label("Diploma Students") {
                                    vboxConstraints {
                                        marginTop = -10.0
                                        marginLeft = 45.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_LIGHT
                                        textFill = Color.WHITE
                                        fontSize = 22.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                            }
                        }
                        stackpane {
                            stackpaneConstraints {
                                paddingLeft = 40.0
                            }
                            rectangle {
                                arcHeight = 60.0
                                arcWidth = 60.0
                                width = 305.0
                                height = 200.0
                                strokeWidth = 1.0
                                fill = Styles.mutedDarkBlueColor
                                opacity = 1.0
                            }
                            vbox {
                                imageview("degree-students-icon.png") {
                                    vboxConstraints {
                                        marginTop = 32.0
                                        marginLeft = 45.0
                                    }
                                    fitHeight = 55.0
                                    fitWidth = 55.0
                                    isPreserveRatio = true
                                }
                                label(dashboardController.getTotalDegreeStudents()) {
                                    vboxConstraints {
                                        marginLeft = 45.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_BOLD
                                        textFill = Styles.yellowColor
                                        fontSize = 50.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                                label("Degree Students") {
                                    vboxConstraints {
                                        marginTop = -10.0
                                        marginLeft = 45.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_LIGHT
                                        textFill = Color.WHITE
                                        fontSize = 22.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                            }
                        }
                        stackpane {
                            stackpaneConstraints {
                                paddingLeft = 40.0
                            }
                            rectangle {
                                arcHeight = 60.0
                                arcWidth = 60.0
                                width = 305.0
                                height = 200.0
                                strokeWidth = 1.0
                                fill = Styles.mutedDarkBlueColor
                                opacity = 1.0
                            }
                            vbox {
                                imageview("staff-icon.png") {
                                    vboxConstraints {
                                        marginTop = 32.0
                                        marginLeft = 45.0
                                    }
                                    fitHeight = 55.0
                                    fitWidth = 55.0
                                    isPreserveRatio = true
                                }
                                label(dashboardController.getTotalAdminStaff()) {
                                    vboxConstraints {
                                        marginLeft = 45.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_BOLD
                                        textFill = Styles.orangeColor
                                        fontSize = 50.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                                label("Administrative Staff") {
                                    vboxConstraints {
                                        marginTop = -10.0
                                        marginLeft = 45.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_LIGHT
                                        textFill = Color.WHITE
                                        fontSize = 22.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                            }
                        }
                        stackpane {
                            stackpaneConstraints {
                                paddingLeft = 40.0
                            }
                            rectangle {
                                arcHeight = 60.0
                                arcWidth = 60.0
                                width = 305.0
                                height = 200.0
                                strokeWidth = 1.0
                                fill = Styles.mutedDarkBlueColor
                                opacity = 1.0
                            }
                            vbox {
                                imageview("staff-icon.png") {
                                    vboxConstraints {
                                        marginTop = 32.0
                                        marginLeft = 45.0
                                    }
                                    fitHeight = 55.0
                                    fitWidth = 55.0
                                    isPreserveRatio = true
                                }
                                label(dashboardController.getTotalAcademicStaff()) {
                                    vboxConstraints {
                                        marginLeft = 45.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_BOLD
                                        textFill = Styles.orangeColor
                                        fontSize = 50.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                                label("Academic Staff") {
                                    vboxConstraints {
                                        marginTop = -10.0
                                        marginLeft = 45.0
                                    }
                                    style {
                                        fontWeight = FontWeight.EXTRA_LIGHT
                                        textFill = Color.WHITE
                                        fontSize = 22.px
                                        fontFamily = "Source Sans Pro"
                                    }
                                }
                            }
                        }
                    }
                    vbox {
                        label("Overview") {
                            vboxConstraints {
                                marginTop = 30.0
                                marginLeft = 70.0
                            }
                            style {
                                fontWeight = FontWeight.BOLD
                                textFill = Color.WHITE
                                fontSize = 30.px
                                fontFamily = "Source Sans Pro"
                            }
                        }
                        hbox {
                            stackpane {
                                stackpaneConstraints {
                                    paddingLeft = 70.0
                                    paddingTop = 30.0
                                }
                                rectangle {
                                    arcHeight = 60.0
                                    arcWidth = 60.0
                                    width = 305.0
                                    height = 400.0
                                    strokeWidth = 1.0
                                    fill = Styles.blueColor
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Admin Staff") {
                                        vboxConstraints {
                                            marginTop = 30.0
                                            marginLeft = 45.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 22.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                    vbox {
                                        var i: Int = 0
                                        for (adminStaff in adminStaffList) {
                                            if(i < 3) {
                                                add(AdminListDashboardView(AdminStaffModel(adminStaff)))
                                                i++
                                            }
                                        }
                                    }
                                }
                            }
                            stackpane {
                                stackpaneConstraints {
                                    paddingLeft = 40.0
                                    paddingTop = 30.0
                                }
                                rectangle {
                                    arcHeight = 60.0
                                    arcWidth = 60.0
                                    width = 380.0
                                    height = 400.0
                                    strokeWidth = 1.0
                                    fill = Styles.yellowColor
                                    opacity = 1.0
                                }
                                vbox {
                                    label("Pool Fund") {
                                        vboxConstraints {
                                            marginTop = 30.0
                                            marginLeft = 45.0
                                        }
                                        style {
                                            fontWeight = FontWeight.BOLD
                                            textFill = Color.WHITE
                                            fontSize = 22.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                    vbox {
                                        imageview("pool-fund-graph.png") {
                                            vboxConstraints {
                                                marginTop = 40.0
                                                marginLeft = 40.0
                                            }
                                            fitHeight = 200.0
                                            fitWidth = 300.0
                                            isPreserveRatio = true
                                        }
                                        imageview("pool-fund-icon.png") {
                                            vboxConstraints {
                                                marginTop = 50.0
                                                marginLeft = 40.0
                                            }
                                            fitHeight = 45.0
                                            fitWidth = 45.0
                                            isPreserveRatio = true
                                        }
                                        label("Total") {
                                            vboxConstraints {
                                                marginTop = 15.0
                                                marginLeft = 40.0
                                            }
                                            style {
                                                fontWeight = FontWeight.NORMAL
                                                textFill = Color.WHITE
                                                fontSize = 20.px
                                                fontFamily = "Source Sans Pro"
                                            }
                                        }
                                        label("R2 000 000.00") {
                                            vboxConstraints {
                                                marginTop = -10.0
                                                marginLeft = 40.0
                                            }
                                            style {
                                                fontWeight = FontWeight.EXTRA_BOLD
                                                textFill = Color.WHITE
                                                fontSize = 45.px
                                                fontFamily = "Source Sans Pro"
                                            }
                                        }
                                    }
                                }
                            }
                            vbox {
                                stackpane {
                                    stackpaneConstraints {
                                        paddingLeft = 40.0
                                        paddingTop = 30.0
                                    }
                                    rectangle {
                                        arcHeight = 60.0
                                        arcWidth = 60.0
                                        width = 575.0
                                        height = 290.0
                                        strokeWidth = 1.0
                                        fill = Styles.orangeColor
                                        opacity = 1.0
                                    }
                                    vbox {
                                        label("Analytics Overview") {
                                            vboxConstraints {
                                                marginTop = 30.0
                                                marginLeft = 45.0
                                            }
                                            style {
                                                fontWeight = FontWeight.BOLD
                                                textFill = Color.WHITE
                                                fontSize = 22.px
                                                fontFamily = "Source Sans Pro"
                                            }
                                        }
                                        hbox {
                                            stackpane {
                                                stackpaneConstraints {
                                                    paddingLeft = 40.0
                                                    paddingTop = 25.0
                                                }
                                                rectangle {
                                                    arcHeight = 60.0
                                                    arcWidth = 60.0
                                                    width = 230.0
                                                    height = 170.0
                                                    strokeWidth = 1.0
                                                    fill = Color.WHITE
                                                    opacity = 1.0
                                                }
                                                vbox {
                                                    imageview("payment-icon.png") {
                                                        vboxConstraints {
                                                            marginTop = 30.0
                                                            marginLeft = 40.0
                                                        }
                                                        fitHeight = 45.0
                                                        fitWidth = 45.0
                                                        isPreserveRatio = true
                                                    }
                                                    label("180") {
                                                        vboxConstraints {
                                                            marginLeft = 40.0
                                                        }
                                                        style {
                                                            fontWeight = FontWeight.EXTRA_BOLD
                                                            textFill = Styles.orangeColor
                                                            fontSize = 40.px
                                                            fontFamily = "Source Sans Pro"
                                                        }
                                                    }
                                                    label("Total Payments") {
                                                        vboxConstraints {
                                                            marginTop = -10.0
                                                            marginLeft = 40.0
                                                        }
                                                        style {
                                                            fontWeight = FontWeight.NORMAL
                                                            textFill = Styles.orangeColor
                                                            fontSize = 20.px
                                                            fontFamily = "Source Sans Pro"
                                                        }
                                                    }
                                                }
                                            }
                                            stackpane {
                                                stackpaneConstraints {
                                                    paddingLeft = 30.0
                                                    paddingTop = 25.0
                                                }
                                                rectangle {
                                                    arcHeight = 60.0
                                                    arcWidth = 60.0
                                                    width = 230.0
                                                    height = 170.0
                                                    strokeWidth = 1.0
                                                    fill = Color.WHITE
                                                    opacity = 1.0
                                                }
                                                vbox {
                                                    imageview("withdrawel-icon.png") {
                                                        vboxConstraints {
                                                            marginTop = 30.0
                                                            marginLeft = 40.0
                                                        }
                                                        fitHeight = 45.0
                                                        fitWidth = 45.0
                                                        isPreserveRatio = true
                                                    }
                                                    label("210") {
                                                        vboxConstraints {
                                                            marginLeft = 40.0
                                                        }
                                                        style {
                                                            fontWeight = FontWeight.EXTRA_BOLD
                                                            textFill = Styles.orangeColor
                                                            fontSize = 40.px
                                                            fontFamily = "Source Sans Pro"
                                                        }
                                                    }
                                                    label("Total Withdrawels") {
                                                        vboxConstraints {
                                                            marginTop = -10.0
                                                            marginLeft = 40.0
                                                        }
                                                        style {
                                                            fontWeight = FontWeight.NORMAL
                                                            textFill = Styles.orangeColor
                                                            fontSize = 20.px
                                                            fontFamily = "Source Sans Pro"
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                stackpane {
                                    stackpaneConstraints {
                                        paddingLeft = 40.0
                                        paddingTop = 30.0
                                    }
                                    rectangle {
                                        arcHeight = 30.0
                                        arcWidth = 30.0
                                        width = 575.0
                                        height = 80.0
                                        strokeWidth = 1.0
                                        fill = Styles.mutedDarkBlueColor
                                        opacity = 1.0
                                    }
                                    label("Disclaimer: All payments are made into main pool fund") {
                                        vboxConstraints {
                                            alignment = Pos.CENTER
                                        }
                                        style {
                                            fontWeight = FontWeight.EXTRA_LIGHT
                                            textFill = Color.WHITE
                                            opacity = 1.0
                                            fontSize = 20.px
                                            fontFamily = "Source Sans Pro"
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            paddingAll = 50.0
        }
    }
}