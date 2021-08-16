package com.example.demo.view.students.studentEditorView

import com.example.demo.controller.students.StudentEditorController
import com.example.demo.controller.students.StudentsController
import com.example.demo.controller.subjects.SubjectsController
import com.example.demo.model.Student
import com.example.demo.model.StudentModel
import javafx.beans.binding.Bindings
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.scene.control.Alert
import javafx.scene.control.ButtonBar
import tornadofx.*
import java.util.*
import kotlin.random.Random

class studentEditorView : View("Add Student View") {

    //Instance of subjectsController
    val studentEditorController: StudentEditorController by inject()

    override val root = vbox {
        form {
            fieldset("Add a student") {
                field("Student Title") {
                    combobox(studentEditorController.selectedTitle, studentEditorController.studentTitle)
                }
                field("Full Name") {
                    textfield(studentEditorController.studentFullName)
                }
                field("Student Email") {
                    textfield(studentEditorController.studentEmail).promptText = "190082@openwindow.co.za"
                }
                field("Subject 1") {
                    combobox(studentEditorController.selectedSubjectOne, studentEditorController.studentSubjects)
                }
                field("Subject 2") {
                    combobox(studentEditorController.selectedSubjectTwo, studentEditorController.studentSubjects)
                }
                field("Subject 3") {
                    combobox(studentEditorController.selectedSubjectThree, studentEditorController.studentSubjects)
                }
                field("Subject 4") {
                    combobox(studentEditorController.selectedSubjectFour, studentEditorController.studentSubjects)
                }
                field("Image") {
                    textfield(studentEditorController.studentImage).promptText = ("default-profile.png")
                }
                field("ID Number") {
                    textfield(studentEditorController.studentIdNumber)
                }
                field("Education Type") {
                    combobox(studentEditorController.selectedEducation, studentEditorController.studentEducation)
                }
            }
            button("Add Student") {
                studentEditorController.studentId = SimpleIntegerProperty(Random.nextInt(0, 100))

                studentEditorController.totalStudentSubjects.bind(Bindings.concat(studentEditorController.selectedSubjectOne, ", ",
                        studentEditorController.selectedSubjectTwo, ", ",studentEditorController.selectedSubjectThree, ", ",
                        studentEditorController.selectedSubjectFour))

                action {
                    val newStudent = Student(
                        studentEditorController.studentId.value,
                        studentEditorController.selectedTitle.value,
                        studentEditorController.studentFullName.value,
                        studentEditorController.studentEmail.value,
                        studentEditorController.studentImage.value,
                        studentEditorController.studentIdNumber.value,
                        studentEditorController.calculateCredits().value,
                        studentEditorController.selectedEducation.value,
                        studentEditorController.totalStudentSubjects.value,
                        studentEditorController.calculateStudentFees().value
                    )

                    if (studentEditorController.selectedEducation.value == "Diploma") {
                        if (studentEditorController.calculateCredits().value <= 60) {
                            studentEditorController.studentCredits = studentEditorController.calculateCredits()
                            studentEditorController.studentList.add(newStudent)
                        } else {
                            alert(
                                type = Alert.AlertType.WARNING,
                                header = "Diploma Students",
                                content = "Diploma students have a maximum amount of credits of 60"
                            )
                        }
                    } else {
                        if (studentEditorController.calculateCredits().value in 61..180) {
                            studentEditorController.studentCredits = studentEditorController.calculateCredits()
                            studentEditorController.studentList.add(newStudent)
                        } else {
                            alert(
                                type = Alert.AlertType.WARNING,
                                header = "Degree Students",
                                content = "Degree students have a maximum amount of credits of 180"
                            )
                        }
                    }

                    studentEditorController.selectedTitle.value = ""
                    studentEditorController.studentFullName.value = ""
                    studentEditorController.studentImage.value = ""
                    studentEditorController.studentEmail.value = ""
                    studentEditorController.studentIdNumber.value = ""
                    studentEditorController.selectedSubjectOne.value = ""
                    studentEditorController.selectedSubjectTwo.value = ""
                    studentEditorController.selectedSubjectThree.value = ""
                    studentEditorController.selectedSubjectFour.value = ""
                    studentEditorController.studentCredits.value = 0
                    studentEditorController.selectedEducation.value = ""
                    studentEditorController.studentFees.value = 0
                }
            }
        }
    }
}