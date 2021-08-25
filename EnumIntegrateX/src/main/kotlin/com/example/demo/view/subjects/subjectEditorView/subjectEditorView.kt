package com.example.demo.view.students.studentEditorView

import com.example.demo.app.Styles
import com.example.demo.controller.students.StudentEditorController
import com.example.demo.controller.students.StudentsController
import com.example.demo.controller.subjects.SubjectEditorController
import com.example.demo.controller.subjects.SubjectsController
import com.example.demo.model.Student
import com.example.demo.model.StudentModel
import com.example.demo.model.Subject
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
        label("Add a subject") {
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
        form {
            style {
                paddingTop = 25.0
                paddingLeft = 80.0
                paddingRight = 80.0
                paddingBottom = 80.0
                fontSize = 15.px
                fontWeight = FontWeight.NORMAL
                fontFamily = "Source Sans Pro"
                prefWidth = 300.px
            }
            fieldset() {
                labelPosition = Orientation.VERTICAL
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(subjectEditorController.subjectName) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }.promptText = "Enter the subject name"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(subjectEditorController.subjectCode) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }.promptText = "Enter subject code"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(subjectEditorController.subjectImage) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    combobox(subjectEditorController.selectedLecturer, subjectEditorController.subjectLecturer) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(4.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Color.WHITE)
                        }
                        useMaxWidth = true
                    }.promptText = "Assign a lecturer"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    label {
                        text = "Select the subject credits"
                        style {
                            textFill = Color.WHITE
                        }
                        maxWidth = 180.0
                    }
                    combobox(subjectEditorController.selectedCredits, subjectEditorController.subjectCredits) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(4.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Color.WHITE)
                        }
                        useMaxWidth = true
                        promptText = "Select the subject credits"
                    }
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    label {
                        text = "Enter hours per week"
                        style {
                            textFill = Color.WHITE
                        }
                        maxWidth = 180.0
                    }
                    textfield(subjectEditorController.subjectHoursPerWeek) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                        promptText = "Enter hours per week"
                    }
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    label {
                        text = "Enter price per month"
                        style {
                            textFill = Color.WHITE
                        }
                        maxWidth = 180.0
                    }
                    textfield(subjectEditorController.subjectPricePerMonth) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }.promptText = "Enter price per month"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textarea(subjectEditorController.subjectDescription) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }.promptText = "Enter subject description"
                }
            }
            button("Add Subject") {
                subjectEditorController.subjectImage.value = "default-subject.png"

                vboxConstraints {
                    marginTop = 20.0
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
                action {
                    val newSubject = Subject(
                        subjectEditorController.subjectName.value,
                        subjectEditorController.subjectCode.value,
                        subjectEditorController.subjectImage.value,
                        subjectEditorController.selectedLecturer.value,
                        subjectEditorController.selectedCredits.value,
                        subjectEditorController.subjectHoursPerWeek.value,
                        subjectEditorController.subjectPricePerMonth.value,
                        subjectEditorController.getTotalSubjectStudents().value,
                        subjectEditorController.subjectDescription.value
                    )

                    subjectEditorController.subjectsList.add(newSubject)
                }
            }
            paddingLeft = 30.0
            paddingRight = 30.0
            paddingTop = 0.0
            paddingBottom = 30.0
        }
    }
}