package com.example.demo.controller.staff

import com.example.demo.controller.subjects.SubjectsController
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import tornadofx.*

class AdminStaffEditorController: Controller() {
    //Instance of subjectsController
    val subjectsController: SubjectsController by inject()
    //Subjects List
    val subjectsList = subjectsController.subjectsList

    //Instance of academicStaffController
    val adminStaffController: AdminStaffController by inject()
    //Academic Staff List
    val adminStaffList = adminStaffController.adminStaffList

    //Selected Title Value In Combo List
    val selectedAdminTitle = SimpleStringProperty()

    //Values for inputs in form
    val adminStaffTitle = FXCollections.observableArrayList("MR", "MRS")
    val adminStaffFullName = SimpleStringProperty()
    val adminStaffImage = SimpleStringProperty()
    var adminStaffEmail = SimpleStringProperty()
    val adminStaffIdNumber = SimpleStringProperty()
    var adminStaffRole = SimpleStringProperty()
    var adminStaffSalary = SimpleIntegerProperty()
}