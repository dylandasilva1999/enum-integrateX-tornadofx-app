package com.example.demo.model

import com.example.demo.controller.students.StudentsController
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class Student(title: String, fullName: String, image: String, idNumber: String, credits: Int, education: String, subjects: String, fees: Int) {
    val titleProperty = SimpleStringProperty(title)
    val fullNameProperty = SimpleStringProperty(fullName)
    val imageProperty = SimpleStringProperty(image)
    val idNumberProperty = SimpleStringProperty(idNumber)
    val creditsProperty = SimpleIntegerProperty(credits)
    val educationProperty = SimpleStringProperty(education)
    val subjectsProperty = SimpleStringProperty(subjects)
    val feesProperty = SimpleIntegerProperty(fees)
}

class StudentModel(val student: Student): ViewModel() {
    val title = bind{student.titleProperty}
    val fullName = bind{student.fullNameProperty}
    val image = bind{student.imageProperty}
    val idNumber = bind{student.idNumberProperty}
    val credits = bind{student.creditsProperty}
    val education = bind{student.educationProperty}
    val subjects = bind{student.subjectsProperty}
    val fees = bind{student.feesProperty}
}