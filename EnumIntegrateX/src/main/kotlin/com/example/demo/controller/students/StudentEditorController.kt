package com.example.demo.controller.students

import com.example.demo.controller.subjects.SubjectsController
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import tornadofx.*

class StudentEditorController: Controller() {
    //Instance of subjectsController
    val subjectsController: SubjectsController by inject()
    //Subjects List
    val subjectsList = subjectsController.subjectsList

    //Selected Education Value In Combo List
    val selectedEducation = SimpleStringProperty()

    //Selected Title Value In Combo List
    val selectedTitle = SimpleStringProperty()

    //Instance of studentsController
    val studentsController: StudentsController by inject()
    //Student List
    val studentList = studentsController.studentsList

    //Values for inputs in form
    var studentId = SimpleIntegerProperty()
    val studentTitle = FXCollections.observableArrayList("MR", "MRS")
    val studentFullName = SimpleStringProperty()
    var studentEmail = SimpleStringProperty()
    val studentImage = SimpleStringProperty()
    val studentIdNumber = SimpleStringProperty()
    var studentCredits = SimpleIntegerProperty()
    val studentEducation = FXCollections.observableArrayList("Diploma", "Degree")
    var studentSubjects = FXCollections.observableArrayList(subjectsList[0].codeProperty.value,
        subjectsList[1].codeProperty.value, subjectsList[2].codeProperty.value,
        subjectsList[3].codeProperty.value, subjectsList[4].codeProperty.value,
        subjectsList[5].codeProperty.value)
    var studentFees = SimpleIntegerProperty()

    var totalStudentSubjects = SimpleStringProperty()

    //Selected Subject One Value In Combo List
    val selectedSubjectOne = SimpleStringProperty()
    val selectedSubjectTwo = SimpleStringProperty()
    val selectedSubjectThree = SimpleStringProperty()
    val selectedSubjectFour = SimpleStringProperty()
}