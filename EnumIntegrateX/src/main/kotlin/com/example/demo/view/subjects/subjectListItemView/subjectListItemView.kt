package com.example.demo.view.students.studentListItemView

import com.example.demo.app.Styles
import com.example.demo.controller.students.StudentsController
import com.example.demo.controller.subjects.SubjectsController
import com.example.demo.model.Student
import com.example.demo.model.StudentModel
import com.example.demo.model.Subject
import com.example.demo.model.SubjectModel
import com.example.demo.view.students.studentDetailsView.subjectDetailsView
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class subjectListItemView(val subjectModel: SubjectModel) : View("Student List Item View") {

    //Instance of subjectsController
    val subjectsController: SubjectsController by inject()
    //Subjects List
    val subjectList = subjectsController.subjectsList

    fun getSubject(): Subject {
        val selectedSubject = Subject(
            subjectModel.name.value,
            subjectModel.code.value,
            subjectModel.image.value,
            subjectModel.lecturer.value,
            subjectModel.credits.value,
            subjectModel.hoursPerWeek.value,
            subjectModel.pricePerMonth.value,
            subjectModel.students.value
        )
        return selectedSubject
    }

    override val root = vbox {

        val subjectModel = SubjectModel(getSubject())

        val fragmentScope = Scope()
        setInScope(subjectModel, fragmentScope)

        fun changeView() {
            this += find<subjectDetailsView>(fragmentScope)
        }

        stackpane {
            stackpaneConstraints {
                paddingTop = 20.0
            }
            rectangle {
                arcHeight = 60.0
                arcWidth = 60.0
                width = 1460.0
                height = 110.0
                strokeWidth = 1.0
                fill = Styles.darkBlueColor
                opacity = 1.0
            }
            hbox {
                imageview(subjectModel.image) {
                    hboxConstraints {
                        marginTop = 24.0
                        marginLeft = 28.0
                    }
                    fitHeight = 65.0
                    fitWidth = 65.0
                    isPreserveRatio = true
                }
                label(subjectModel.name) {
                    hboxConstraints {
                        marginTop = 42.0
                        marginLeft = 30.0
                    }
                    style {
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        fontSize = 20.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 200.0
                }
                label(subjectModel.code) {
                    hboxConstraints {
                        marginTop = 42.0
                        marginLeft = 50.0
                    }
                    style {
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        fontSize = 20.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 50.0
                }
                label(subjectModel.lecturer) {
                    hboxConstraints {
                        marginTop = 42.0
                        marginLeft = 30.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 20.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 240.0
                }
                label(subjectModel.credits) {
                    hboxConstraints {
                        marginTop = 42.0
                        marginLeft = 50.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 20.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 50.0
                }
                label(subjectModel.hoursPerWeek) {
                    hboxConstraints {
                        marginTop = 42.0
                        marginLeft = 50.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 20.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 50.0
                }
                label("R${subjectModel.pricePerMonth.value}") {
                    hboxConstraints {
                        marginTop = 42.0
                        marginLeft = 50.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 20.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 80.0
                }
                label(subjectModel.students) {
                    hboxConstraints {
                        marginTop = 42.0
                        marginLeft = 50.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 20.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 20.0
                }
                button("View Subject Details") {
                    hboxConstraints {
                        marginTop = 30.0
                        marginLeft = 70.0
                    }
                    action {
                        getSubject()
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
//                button("Remove") {
//                    hboxConstraints {
//                        marginTop = 30.0
//                        marginLeft = 20.0
//                    }
//                    action {
//                    }
//                    style {
//                        fontSize = 20.px
//                        borderWidth += box(2.5.px)
//                        borderColor += box(Styles.yellowColor)
//                        borderRadius += box(9.px)
//                        fontFamily = "Source Sans Pro"
//                        fontWeight = FontWeight.BOLD
//                        textFill = Color.WHITE
//                        backgroundColor = multi(Color.TRANSPARENT, Color.TRANSPARENT, Color.TRANSPARENT)
//                    }
//                    useMaxWidth = true
//                    paddingAll = 10.0
//                    paddingLeft = 30.0
//                    paddingRight = 30.0
//                }
            }
        }
    }
}