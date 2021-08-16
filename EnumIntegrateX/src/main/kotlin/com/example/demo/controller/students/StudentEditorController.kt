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

    //Calculate Student Credits
    fun calculateCredits(): SimpleIntegerProperty {
        var totalStudentCredits = SimpleIntegerProperty()

        for (subject in subjectsList) {
            if (subject.codeProperty.value == selectedSubjectOne.value) {
                totalStudentCredits += subject.creditsProperty.value
            } else if (subject.codeProperty.value == selectedSubjectTwo.value) {
                totalStudentCredits += subject.creditsProperty.value
            } else if (subject.codeProperty.value == selectedSubjectThree.value) {
                totalStudentCredits += subject.creditsProperty.value
            } else if(subject.codeProperty.value == selectedSubjectFour.value) {
                totalStudentCredits += subject.creditsProperty.value
            }
        }

        studentCredits = totalStudentCredits
        return studentCredits
    }

    //Calculate Student Fees
    fun calculateStudentFees(): SimpleIntegerProperty {
        var totalStudentFees = SimpleIntegerProperty()

        for (subject in subjectsList) {
            if (subject.codeProperty.value == selectedSubjectOne.value) {
                totalStudentFees += subject.pricePerMonthProperty.value
            } else if (subject.codeProperty.value == selectedSubjectTwo.value) {
                totalStudentFees += subject.pricePerMonthProperty.value
            } else if (subject.codeProperty.value == selectedSubjectThree.value) {
                totalStudentFees += subject.pricePerMonthProperty.value
            } else if(subject.codeProperty.value == selectedSubjectFour.value) {
                totalStudentFees += subject.pricePerMonthProperty.value
            }
        }

        studentFees = totalStudentFees
        return studentFees
    }
}