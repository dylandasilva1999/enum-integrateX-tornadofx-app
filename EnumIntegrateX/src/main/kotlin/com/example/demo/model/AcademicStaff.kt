package com.example.demo.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class AcademicStaff(title: String, fullName: String, image: String, idNumber: String, email: String, role: String, subjectsTeaching: String, hoursWorked: Int, salary: Int) {
    val titleProperty = SimpleStringProperty(title)
    val fullNameProperty = SimpleStringProperty(fullName)
    val imageProperty = SimpleStringProperty(image)
    val idNumberProperty = SimpleStringProperty(idNumber)
    val emailProperty = SimpleStringProperty(email)
    val roleProperty = SimpleStringProperty(role)
    val subjectsTeachingProperty = SimpleStringProperty(subjectsTeaching)
    val hoursWorkedProperty = SimpleIntegerProperty(hoursWorked)
    val salaryProperty = SimpleIntegerProperty(salary)
}

class AcademicStaffModel(val academicStaff: AcademicStaff): ViewModel() {
    val title = bind{academicStaff.titleProperty}
    val fullName = bind{academicStaff.fullNameProperty}
    val image = bind{academicStaff.imageProperty}
    val idNumber = bind{academicStaff.idNumberProperty}
    val email = bind{academicStaff.emailProperty}
    val role = bind{academicStaff.roleProperty}
    val subjectsTeaching = bind{academicStaff.subjectsTeachingProperty}
    val hoursWorked = bind{academicStaff.hoursWorkedProperty}
    val salary = bind{academicStaff.salaryProperty}
}