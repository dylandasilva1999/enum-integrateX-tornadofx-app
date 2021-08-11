package com.example.demo.controller.students

import com.example.demo.model.Student
import tornadofx.*

class StudentsController: Controller() {
    val studentsList = mutableListOf(
        Student(1,"MR","Dylan da Silva","1800123@openwindow.co.za", "student-1.png", "9801015800081", 50, "Diploma", "CC, ID, MD", 22000),
        Student(2,"MR","Trent Wright", "1800123@openwindow.co.za","student-2.png", "9806015800080", 50, "Diploma", "CC, ID, MD", 23000),
        Student(3,"MRS","Katey Cairns", "1800123@openwindow.co.za","student-3.png", "9806014800081", 50, "Degree", "CC, ID, MD", 45000),
        Student(4,"MR","Jerome Meyers", "1900123@openwindow.co.za","student-4.png", "9906205800088", 50, "Diploma", "CC, ID, MD", 22000),
        Student(5,"MRS","Kayley Combs","1900123@openwindow.co.za", "student-5.png", "9906204800089", 50, "Degree", "CC, ID, MD", 30000),
        Student(6,"MRS","Alyssia Cole","1700123@openwindow.co.za", "student-6.png", "9624015600812", 50, "Degree", "CC, ID, MD", 45000),
        Student(7,"MR","Tom Talbot","1800123@openwindow.co.za", "student-7.png", "9706225823088", 50, "Diploma", "CC, ID, MD", 22000),
    ).asObservable()
}