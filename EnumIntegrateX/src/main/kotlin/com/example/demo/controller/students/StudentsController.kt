package com.example.demo.controller.students

import com.example.demo.model.Student
import tornadofx.*

class StudentsController: Controller() {
    val studentsList = mutableListOf(
        Student("MR","Dylan da Silva", "student-1.png", "9801015800081", 50, "Diploma", "CC, ID, MD", 22000),
        Student("MR","Trent Wright", "student-2.png", "9806015800080", 50, "Diploma", "CC, ID, MD", 23000),
        Student("MRS","Katey Cairns", "student-3.png", "9806014800081", 50, "Degree", "CC, ID, MD", 45000),
    ).asObservable()
}