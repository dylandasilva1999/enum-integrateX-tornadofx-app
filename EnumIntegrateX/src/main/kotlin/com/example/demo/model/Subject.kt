package com.example.demo.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class Subject(name: String, code: String, image: String, lecturer: String, credits: Int, hoursPerWeek: Int, pricePerMonth: Int, students: Int) {
    val nameProperty = SimpleStringProperty(name)
    val codeProperty = SimpleStringProperty(code)
    val imageProperty = SimpleStringProperty(image)
    val lecturerProperty = SimpleStringProperty(lecturer)
    val creditsProperty = SimpleIntegerProperty(credits)
    val hoursPerWeekProperty = SimpleIntegerProperty(hoursPerWeek)
    val pricePerMonthProperty = SimpleIntegerProperty(pricePerMonth)
    val studentsProperty = SimpleIntegerProperty(students)
}

class SubjectModel(val subject: Subject): ViewModel() {
    val name = bind{subject.nameProperty}
    val code = bind{subject.codeProperty}
    val image = bind{subject.imageProperty}
    val lecturer = bind{subject.lecturerProperty}
    val credits = bind{subject.creditsProperty}
    val hoursPerWeek = bind{subject.hoursPerWeekProperty}
    val pricePerMonth = bind{subject.pricePerMonthProperty}
    val students = bind{subject.studentsProperty}
}