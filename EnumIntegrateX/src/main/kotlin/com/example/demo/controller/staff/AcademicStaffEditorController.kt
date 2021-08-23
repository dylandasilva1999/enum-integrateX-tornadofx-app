package com.example.demo.controller.staff

import com.example.demo.controller.subjects.SubjectsController
import com.example.demo.model.AcademicStaff
import com.example.demo.model.AcademicStaffModel
import com.example.demo.model.AdminStaffModel
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import tornadofx.*

class AcademicStaffEditorController: Controller() {

    //Instance of subjectsController
    val subjectsController: SubjectsController by inject()
    //Subjects List
    val subjectsList = subjectsController.subjectsList

    //Instance of academicStaffController
    val academicStaffController: AcademicStaffController by inject()
    //Academic Staff List
    val academicStaffList = academicStaffController.academicStaffList

    //Selected Title Value In Combo List
    val selectedAcademicTitle = SimpleStringProperty()

    //Selected Role Value In Combo List
    val selectedRole = SimpleStringProperty()

    //All subject to teach
    var totalTeachSubjects = SimpleStringProperty()

    //Values for inputs in form
    val academicStaffTitle = FXCollections.observableArrayList("MR", "MRS")
    val academicStaffFullName = SimpleStringProperty()
    val academicStaffImage = SimpleStringProperty()
    var academicStaffEmail = SimpleStringProperty()
    val academicStaffIdNumber = SimpleStringProperty()
    var academicStaffRole = SimpleStringProperty()
    var academicStaffSubjects = FXCollections.observableArrayList(subjectsList[0].codeProperty.value,
        subjectsList[1].codeProperty.value, subjectsList[2].codeProperty.value,
        subjectsList[3].codeProperty.value, subjectsList[4].codeProperty.value,
        subjectsList[5].codeProperty.value, subjectsList[6].codeProperty.value)
    val academicStaffHours = SimpleIntegerProperty()
    var academicStaffSalary = SimpleIntegerProperty()

    //Selected Subject To Teach Value In Combo List
    val selectedSubjectOne = SimpleStringProperty()
    val selectedSubjectTwo = SimpleStringProperty()
    val selectedSubjectThree = SimpleStringProperty()

    //Calculate Student Fees
    fun calculateAcademicStaffSalary(): SimpleIntegerProperty {
        var totalSalary = SimpleIntegerProperty()
        totalSalary += academicStaffHours * 400

        academicStaffSalary = totalSalary
        return academicStaffSalary
    }
}