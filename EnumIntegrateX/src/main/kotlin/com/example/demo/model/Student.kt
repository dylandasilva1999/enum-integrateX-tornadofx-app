package com.example.demo.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class Student(id: Int, title: String, fullName: String, email: String, image: String, idNumber: String, credits: Int, education: String, subjects: String, fees: Int) {
    val idProperty = SimpleIntegerProperty(id)
    val titleProperty = SimpleStringProperty(title)
    val fullNameProperty = SimpleStringProperty(fullName)
    val emailProperty = SimpleStringProperty(email)
    val imageProperty = SimpleStringProperty(image)
    val idNumberProperty = SimpleStringProperty(idNumber)
    val creditsProperty = SimpleIntegerProperty(credits)
    val educationProperty = SimpleStringProperty(education)
    val subjectsProperty = SimpleStringProperty(subjects)
    val feesProperty = SimpleIntegerProperty(fees)
}

class StudentModel(val student: Student): ViewModel() {
    val id = bind{student.idProperty}
    val title = bind{student.titleProperty}
    val fullName = bind{student.fullNameProperty}
    val email = bind{student.emailProperty}
    val image = bind{student.imageProperty}
    val idNumber = bind{student.idNumberProperty}
    val credits = bind{student.creditsProperty}
    val education = bind{student.educationProperty}
    val subjects = bind{student.subjectsProperty}
    val fees = bind{student.feesProperty}
}