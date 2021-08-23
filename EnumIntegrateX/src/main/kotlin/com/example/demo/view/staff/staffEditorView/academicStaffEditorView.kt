package com.example.demo.view.students.studentEditorView

import com.example.demo.app.Styles
import com.example.demo.controller.staff.AcademicStaffController
import com.example.demo.controller.staff.AcademicStaffEditorController
import com.example.demo.controller.staff.AdminStaffController
import com.example.demo.controller.students.StudentEditorController
import com.example.demo.controller.students.StudentsController
import com.example.demo.controller.subjects.SubjectsController
import com.example.demo.model.AcademicStaff
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

class academicStaffEditorView : View("Add Academic Staff View") {

    //Instance of academicStaffController
    val academicStaffEditorController: AcademicStaffEditorController by inject()

    override val root = vbox {
        style {
            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
        }
        setPrefSize(500.0, 500.0)
        label("Add academic staff") {
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
                    combobox(academicStaffEditorController.selectedAcademicTitle, academicStaffEditorController.academicStaffTitle) {
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
                        paddingBottom = 20.0
                    }.promptText = "Choose staff title"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(academicStaffEditorController.academicStaffFullName) {
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
                    }.promptText = "Enter staff full name"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(academicStaffEditorController.academicStaffEmail) {
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
                    }.promptText = "adam@staff.co.za"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    combobox(academicStaffEditorController.selectedSubjectOne, academicStaffEditorController.academicStaffSubjects) {
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
                    }.promptText = "Choose subject 1 to teach"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    combobox(academicStaffEditorController.selectedSubjectTwo, academicStaffEditorController.academicStaffSubjects) {
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
                    }.promptText = "Choose subject 2 to teach"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    combobox(academicStaffEditorController.selectedSubjectThree, academicStaffEditorController.academicStaffSubjects) {
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
                    }.promptText = "Choose subject 3 to teach"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(academicStaffEditorController.academicStaffImage) {
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
                    textfield(academicStaffEditorController.academicStaffIdNumber) {
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
                    }.promptText = "Enter staff ID number"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(academicStaffEditorController.academicStaffHours) {
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
                    }.promptText = "Enter hours to work per week"
                }
            }
            button("Add Academic Staff") {
                academicStaffEditorController.academicStaffImage.value = "default-profile.png"
                academicStaffEditorController.academicStaffRole.value = "Lecturer"
                academicStaffEditorController.totalTeachSubjects.bind(Bindings.concat(academicStaffEditorController.selectedSubjectOne, ", ",
                    academicStaffEditorController.selectedSubjectTwo, ", ",academicStaffEditorController.selectedSubjectThree))

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
                    val newAcademicStaff = AcademicStaff(
                        academicStaffEditorController.selectedAcademicTitle.value,
                        academicStaffEditorController.academicStaffFullName.value,
                        academicStaffEditorController.academicStaffImage.value,
                        academicStaffEditorController.academicStaffIdNumber.value,
                        academicStaffEditorController.academicStaffEmail.value,
                        academicStaffEditorController.academicStaffRole.value,
                        academicStaffEditorController.totalTeachSubjects.value,
                        academicStaffEditorController.academicStaffHours.value,
                        academicStaffEditorController.calculateAcademicStaffSalary().value
                    )

                    academicStaffEditorController.academicStaffList.add(newAcademicStaff)
                }
            }
            paddingLeft = 30.0
            paddingRight = 30.0
            paddingTop = 0.0
            paddingBottom = 30.0
        }
    }
}