package com.example.demo.view.students

import com.example.demo.app.Styles
import com.example.demo.controller.students.StudentsController
import com.example.demo.model.StudentModel
import com.example.demo.view.subjects.SubjectsView
import com.example.demo.view.dashboard.DashboardView
import com.example.demo.view.funds.FundsView
import com.example.demo.view.login.LoginView
import com.example.demo.view.searchbar.SearchBarViewStudents
import com.example.demo.view.staff.StaffView
import com.example.demo.view.students.studentEditorView.studentEditorView
import com.example.demo.view.students.studentListItemView.adminStaffListItemView
import com.example.demo.view.students.studentListItemView.studentListItemView
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class StudentsView : View("Students View") {

    //Instance of studentsController
    val studentsController: StudentsController by inject()
    //Student List
    val studentList = studentsController.studentsList
    //Students
    val student: StudentModel by inject()

    //SearchBarView
    val searchBarViewStudents: SearchBarViewStudents by inject()

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
                            find(StudentsView::class).replaceWith(
                                DashboardView::class,
                                sizeToScene = true,
                                centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds)
                            )
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
                            find(StudentsView::class).refreshable
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
                            backgroundColor =
                                multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
                        }
                        paddingAll = 12.0
                        paddingLeft = 34.0
                    }
                    button("Subjects") {
                        action {
                            find(StudentsView::class).replaceWith(
                                SubjectsView::class,
                                sizeToScene = true,
                                centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds)
                            )
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
                            find(StudentsView::class).replaceWith(
                                StaffView::class,
                                sizeToScene = true,
                                centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds)

                            )
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
                            find(StudentsView::class).replaceWith(
                                FundsView::class,
                                sizeToScene = true,
                                centerOnScreen = true, transition = ViewTransition.Fade(0.2.seconds)
                            )
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
                                find(StudentsView::class).replaceWith(LoginView::class, sizeToScene = true, centerOnScreen = true, transition = ViewTransition.Slide(0.5.seconds))
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
                add(searchBarViewStudents)
                button("+ Add a student") {
                    hboxConstraints {
                        marginLeft = 15.0
                        marginBottom = 15.0
                    }
                    action {
                        openInternalWindow<studentEditorView>()
                    }
                    style {
                        fontSize = 20.px
                        borderWidth += box(1.5.px)
                        backgroundRadius += box(9.px)
                        fontFamily = "Source Sans Pro"
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        backgroundColor = multi(Styles.blueColor, Styles.blueColor, Styles.blueColor)
                    }
                    useMaxWidth = true
                    paddingAll = 15.0
                }
            }
            vboxConstraints {
                alignment = Pos.CENTER_LEFT
            }
            useMaxHeight = true
            useMaxWidth = true
            stackpane {
                rectangle {
                    width = 1480.0
                    height = 840.0
                    strokeWidth = 1.0
                    fill = Color.TRANSPARENT
                    opacity = 1.0
                }
                vbox {
                    label("Students") {
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
                    scrollpane {
                        style {
                            baseColor = Styles.mutedDarkBlueColor
                            focusColor = Color.TRANSPARENT
                            edgeToEdge = true
                            pannable = true
                        }
                        borderpane {
                            style {
                                backgroundColor += Styles.mutedDarkBlueColor
                            }
                            center = vbox {
                                vboxConstraints {
                                    paddingLeft = 5.0
                                }
                                for (student in studentList) {
                                    add(studentListItemView(StudentModel(student)))
                                }
                            }
                        }
                        prefHeight = 840.0
                    }
                }
                studentList.onChange {
                    // Clear View
                    this.clear()
                    vbox {
                        label("Students") {
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
                        scrollpane {
                            style {
                                baseColor = Styles.mutedDarkBlueColor
                                focusColor = Color.TRANSPARENT
                                edgeToEdge = true
                                pannable = true
                            }
                            borderpane {
                                style {
                                    backgroundColor += Styles.mutedDarkBlueColor
                                }
                                center = vbox {
                                    vboxConstraints {
                                        paddingLeft = 5.0
                                    }
                                    for (student in studentList) {
                                        add(studentListItemView(StudentModel(student)))
                                    }
                                }
                            }
                            prefHeight = 840.0
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