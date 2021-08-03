package com.example.demo.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class AdminStaff(title: String, fullName: String, image: String, idNumber: String, role: String, email: String, salary: Int) {
    val titleProperty = SimpleStringProperty(title)
    val fullNameProperty = SimpleStringProperty(fullName)
    val imageProperty = SimpleStringProperty(image)
    val idNumberProperty = SimpleStringProperty(idNumber)
    val roleProperty = SimpleStringProperty(role)
    val emailProperty = SimpleStringProperty(email)
    val salaryProperty = SimpleIntegerProperty(salary)
}

class AdminStaffModel(val adminStaff: AdminStaff): ViewModel() {
    val title = bind{adminStaff.titleProperty}
    val fullName = bind{adminStaff.fullNameProperty}
    val image = bind{adminStaff.imageProperty}
    val idNumber = bind{adminStaff.idNumberProperty}
    val role = bind{adminStaff.roleProperty}
    val email = bind{adminStaff.emailProperty}
    val salary = bind{adminStaff.salaryProperty}
}