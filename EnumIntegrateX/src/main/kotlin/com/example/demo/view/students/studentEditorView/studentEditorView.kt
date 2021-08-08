package com.example.demo.view.students.studentEditorView

import com.example.demo.controller.students.StudentsController
import com.example.demo.model.Student
import com.example.demo.model.StudentModel
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import tornadofx.*

class studentEditorView : View("Add Student View") {

    //Values for inputs in form
    val studentTitle = FXCollections.observableArrayList("MR", "MRS")
    val studentFullName = SimpleStringProperty()
    val studentImage = SimpleStringProperty()
    val studentIdNumber = SimpleStringProperty()
    var studentCredits = SimpleIntegerProperty()
    val studentEducation = FXCollections.observableArrayList("Diploma", "Degree")
    var studentSubjects = SimpleStringProperty()
    var studentFees = SimpleIntegerProperty()

    //Selected Education Value In Combo List
    val selectedEducation = SimpleStringProperty()

    //Selected Education Value In Combo List
    val selectedTitle = SimpleStringProperty()

    //Instance of studentsController
    val studentsController: StudentsController by inject()
    //Student List
    val studentList = studentsController.studentsList

    override val root = vbox {
        form {
            fieldset("Add a student") {
                field("Student Title") {
                    combobox(selectedTitle, studentTitle)
                }
                field("Full Name") {
                    textfield(studentFullName)
                }
                field("Image") {
                    textfield(studentImage)
                }
                field("ID Number") {
                    textfield(studentIdNumber)
                }
                field("Education Type") {
                    combobox(selectedEducation, studentEducation)
                }
            }
            button("Add Student") {
                studentCredits = SimpleIntegerProperty(0)
                studentSubjects = SimpleStringProperty("")
                studentFees = SimpleIntegerProperty(0)

                action {
                    val newStudent = Student(
                        selectedTitle.value,
                        studentFullName.value,
                        studentImage.value,
                        studentIdNumber.value,
                        studentCredits.value,
                        selectedEducation.value,
                        studentSubjects.value,
                        studentFees.value
                    )
                    studentList.add(newStudent)
                    for (student in studentList) {
                        println(student.fullNameProperty.value)
                    }

                    selectedTitle.value = ""
                    studentFullName.value = ""
                    studentImage.value = ""
                    studentIdNumber.value = ""
                    studentCredits.value = 0
                    selectedEducation.value = ""
                    studentSubjects.value = ""
                    studentFees.value = 0
                }
            }
        }
    }
}