package com.example.demo.controller.subjects

import com.example.demo.controller.staff.AcademicStaffController
import com.example.demo.controller.students.StudentsController
import com.example.demo.controller.subjects.SubjectsController
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import tornadofx.*

class SubjectEditorController: Controller() {
    //Instance of subjectsController
    val subjectsController: SubjectsController by inject()
    //Subjects List
    val subjectsList = subjectsController.subjectsList

    //Instance of academicStaffController
    val academicStaffController: AcademicStaffController by inject()
    //Academic Staff List
    val academicStaffList = academicStaffController.academicStaffList

    //Instance of studentsController
    val studentsController: StudentsController by inject()
    //Student List
    val studentList = studentsController.studentsList

    //Values for inputs in form
    val subjectName = SimpleStringProperty()
    val subjectCode = SimpleStringProperty()
    val subjectImage = SimpleStringProperty()
    val subjectLecturer = FXCollections.observableArrayList(academicStaffList[0].fullNameProperty.value,
        academicStaffList[1].fullNameProperty.value, academicStaffList[2].fullNameProperty.value)
    val subjectCredits = FXCollections.observableArrayList(30, 40, 60)
    val subjectHoursPerWeek = SimpleIntegerProperty()
    val subjectPricePerMonth = SimpleIntegerProperty()
    var subjectStudentsTotal = SimpleIntegerProperty()
    val subjectDescription = SimpleStringProperty()

    //Selected Lecturer Value In Combo List
    val selectedLecturer = SimpleStringProperty()

    //Selected Subject Credits Value In Combo List
    val selectedCredits = SimpleIntegerProperty()

    //Function to get the amount of GD students
    fun getTotalSubjectStudents(): SimpleIntegerProperty {
        //Total diploma students initializer
        var totalSubjectStudents = SimpleIntegerProperty()

        for (student in studentsController.studentsList) {
            if (student.subjectsProperty.value.contains(subjectCode.value)) {
                totalSubjectStudents.value++
            }
        }
        subjectStudentsTotal = totalSubjectStudents
        return subjectStudentsTotal
    }
}