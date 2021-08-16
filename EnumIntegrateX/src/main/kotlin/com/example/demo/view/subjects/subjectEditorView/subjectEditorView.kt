package com.example.demo.view.students.studentEditorView

import com.example.demo.app.Styles
import com.example.demo.controller.students.StudentEditorController
import com.example.demo.controller.students.StudentsController
import com.example.demo.controller.subjects.SubjectEditorController
import com.example.demo.controller.subjects.SubjectsController
import com.example.demo.model.Student
import com.example.demo.model.StudentModel
import javafx.beans.binding.Bindings
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.geometry.Orientation
import javafx.scene.control.Alert
import javafx.scene.control.ButtonBar
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*
import java.util.*
import javax.swing.text.Style
import kotlin.random.Random

class subjectEditorView : View("Add Student View") {

    //Instance of subjectsController
    val subjectEditorController: SubjectEditorController by inject()

    override val root = vbox {
        style {
            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
        }
        setPrefSize(500.0, 500.0)
        label("Add a student") {
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
            paddingLeft = 25.0
            paddingTop = 15.0
            paddingBottom = 10.0
        }
//        form {
//            style {
//                paddingTop = 25.0
//                paddingLeft = 80.0
//                paddingRight = 80.0
//                paddingBottom = 80.0
//                fontSize = 15.px
//                fontWeight = FontWeight.NORMAL
//                fontFamily = "Source Sans Pro"
//                prefWidth = 300.px
//            }
//            fieldset() {
//                labelPosition = Orientation.VERTICAL
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    combobox(studentEditorController.selectedTitle, studentEditorController.studentTitle) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(4.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Color.WHITE)
//                        }
//                        useMaxWidth = true
//                        paddingBottom = 20.0
//                    }.promptText = "Choose student title"
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    textfield(studentEditorController.studentFullName) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(12.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Styles.mutedOrangeColor)
//                        }
//                        useMaxWidth = true
//                    }.promptText = "Enter student full name"
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    textfield(studentEditorController.studentEmail) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(12.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Styles.mutedOrangeColor)
//                        }
//                        useMaxWidth = true
//                    }.promptText = "190082@openwindow.co.za"
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    combobox(studentEditorController.selectedSubjectOne, studentEditorController.studentSubjects) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(4.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Color.WHITE)
//                        }
//                        useMaxWidth = true
//                    }.promptText = "Choose subject 1"
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    combobox(studentEditorController.selectedSubjectTwo, studentEditorController.studentSubjects) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(4.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Color.WHITE)
//                        }
//                        useMaxWidth = true
//                    }.promptText = "Choose subject 2"
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    combobox(studentEditorController.selectedSubjectThree, studentEditorController.studentSubjects) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(4.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Color.WHITE)
//                        }
//                        useMaxWidth = true
//                    }.promptText = "Choose subject 3"
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    combobox(studentEditorController.selectedSubjectFour, studentEditorController.studentSubjects) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(4.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Color.WHITE)
//                        }
//                        useMaxWidth = true
//                    }.promptText = "Choose subject 4"
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    textfield(studentEditorController.studentImage) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(12.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Styles.mutedOrangeColor)
//                        }
//                        useMaxWidth = true
//                    }
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    textfield(studentEditorController.studentIdNumber) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(12.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Styles.mutedOrangeColor)
//                        }
//                        useMaxWidth = true
//                    }.promptText = "Enter student ID number"
//                }
//                field() {
//                    vboxConstraints {
//                        paddingTop = 20.0
//                    }
//                    combobox(studentEditorController.selectedEducation, studentEditorController.studentEducation) {
//                        style {
//                            textFill = Styles.darkBlueColor
//                            backgroundColor = multi(
//                                Color.WHITE,
//                                Color.WHITE,
//                                Color.WHITE
//                            )
//                            padding = box(4.px)
//                            borderWidth += box(1.5.px)
//                            backgroundRadius += box(9.px)
//                            borderRadius += box(9.px)
//                            borderColor += box(Color.WHITE)
//                        }
//                        useMaxWidth = true
//                    }.promptText = "Choose education type"
//                }
//            }
//            button("Add Student") {
//                studentEditorController.studentId = SimpleIntegerProperty(Random.nextInt(0, 100))
//                studentEditorController.studentImage.value = "default-profile.png"
//                studentEditorController.totalStudentSubjects.bind(Bindings.concat(studentEditorController.selectedSubjectOne, ", ",
//                        studentEditorController.selectedSubjectTwo, ", ",studentEditorController.selectedSubjectThree, ", ",
//                        studentEditorController.selectedSubjectFour))
//                vboxConstraints {
//                    marginTop = 20.0
//                }
//                style {
//                    fontSize = 20.px
//                    borderWidth += box(1.5.px)
//                    backgroundRadius += box(9.px)
//                    fontFamily = "Source Sans Pro"
//                    fontWeight = FontWeight.BOLD
//                    textFill = Color.WHITE
//                    backgroundColor = multi(Styles.blueColor, Styles.blueColor, Styles.blueColor)
//                }
//                useMaxWidth = true
//                action {
//                    val newStudent = Student(
//                        studentEditorController.studentId.value,
//                        studentEditorController.selectedTitle.value,
//                        studentEditorController.studentFullName.value,
//                        studentEditorController.studentEmail.value,
//                        studentEditorController.studentImage.value,
//                        studentEditorController.studentIdNumber.value,
//                        studentEditorController.calculateCredits().value,
//                        studentEditorController.selectedEducation.value,
//                        studentEditorController.totalStudentSubjects.value,
//                        studentEditorController.calculateStudentFees().value
//                    )
//
//                    if (studentEditorController.selectedEducation.value == "Diploma") {
//                        if (studentEditorController.calculateCredits().value <= 60) {
//                            studentEditorController.studentCredits = studentEditorController.calculateCredits()
//                            studentEditorController.studentList.add(newStudent)
//                        } else {
//                            alert(
//                                type = Alert.AlertType.WARNING,
//                                header = "Diploma Students",
//                                content = "Diploma students have a maximum amount of credits of 60"
//                            )
//                        }
//                    } else {
//                        if (studentEditorController.calculateCredits().value in 61..180) {
//                            studentEditorController.studentCredits = studentEditorController.calculateCredits()
//                            studentEditorController.studentList.add(newStudent)
//                        } else {
//                            alert(
//                                type = Alert.AlertType.WARNING,
//                                header = "Degree Students",
//                                content = "Degree students have a maximum amount of credits of 180"
//                            )
//                        }
//                    }
//                }
//            }
//            paddingLeft = 30.0
//            paddingRight = 30.0
//            paddingTop = 0.0
//            paddingBottom = 30.0
//        }
    }
}