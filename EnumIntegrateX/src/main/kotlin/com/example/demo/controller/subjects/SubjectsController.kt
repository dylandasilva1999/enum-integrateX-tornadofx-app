package com.example.demo.controller.subjects

import com.example.demo.controller.students.StudentsController
import com.example.demo.model.Subject
import com.example.demo.model.User
import com.sun.xml.internal.fastinfoset.util.StringArray
import javafx.beans.binding.Bindings
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class SubjectsController: Controller() {

    //Instance of studentsController
    private val studentsController: StudentsController by inject()

    //Function to get the amount of CC students
    fun getTotalCCStudents(): Int {
        //Total diploma students initializer
        var totalCCStudents = SimpleIntegerProperty()

        for (student in studentsController.studentsList) {
            if (student.subjectsProperty.value.contains("CC")) {
                totalCCStudents.value++
            }
        }
        return totalCCStudents.value
    }

    //Function to get the amount of ID students
    fun getTotalIDStudents(): Int {
        //Total diploma students initializer
        var totalIDStudents = SimpleIntegerProperty()

        for (student in studentsController.studentsList) {
            if (student.subjectsProperty.value.contains("ID")) {
                totalIDStudents.value++
            }
        }
        return totalIDStudents.value
    }

    //Function to get the amount of 3DD students
    fun getTotal3DDStudents(): Int {
        //Total diploma students initializer
        var total3DDStudents = SimpleIntegerProperty()

        for (student in studentsController.studentsList) {
            if (student.subjectsProperty.value.contains("3DD")) {
                total3DDStudents.value++
            }
        }
        return total3DDStudents.value
    }

    //Function to get the amount of IL students
    fun getTotalILStudents(): Int {
        //Total diploma students initializer
        var totalILStudents = SimpleIntegerProperty()

        for (student in studentsController.studentsList) {
            if (student.subjectsProperty.value.contains("IL")) {
                totalILStudents.value++
            }
        }
        return totalILStudents.value
    }

    //Function to get the amount of MD students
    fun getTotalMDStudents(): Int {
        //Total diploma students initializer
        var totalMDStudents = SimpleIntegerProperty()

        for (student in studentsController.studentsList) {
            if (student.subjectsProperty.value.contains("MD")) {
                totalMDStudents.value++
            }
        }
        return totalMDStudents.value
    }

    //Function to get the amount of PG students
    fun getTotalPGStudents(): Int {
        //Total diploma students initializer
        var totalPGStudents = SimpleIntegerProperty()

        for (student in studentsController.studentsList) {
            if (student.subjectsProperty.value.contains("PG")) {
                totalPGStudents.value++
            }
        }
        return totalPGStudents.value
    }


    //Function to get the amount of GD students
    fun getTotalGDStudents(): Int {
        //Total diploma students initializer
        var totalGDStudents = SimpleIntegerProperty()

        for (student in studentsController.studentsList) {
            if (student.subjectsProperty.value.contains("PG")) {
                totalGDStudents.value++
            }
        }
        return totalGDStudents.value
    }

    val subjectsList = mutableListOf(
        Subject("Creative Computing","CC", "cc-icon.png", "Wade Rodgers", 20, 45, 2500, getTotalCCStudents(), "Creative computing refers to a meta-technology to coalesce knowledge in computing and other disciplines."),
        Subject("Interaction Design","ID", "id-icon.png", "Agatha Dickinson", 40, 45, 2200, getTotalIDStudents(), "Interaction Design (IxD) is the design of interactive products and services in which a designer’s focus goes beyond the item in development to include the way users will interact with it."),
        Subject("3D Design","3DD", "3dd-icon.png", "Lucy Livingston", 30, 45, 2300, getTotal3DDStudents(), "3D design is the process of using computer-modeling software to create an object within a three-dimensional space."),
        Subject("Illustration","IL", "il-icon.png", "Agatha Dickinson", 50, 45, 2200, getTotalILStudents(), "The study of illustration focuses on the areas of drawing, image making, narrative and creative problem solving, all to communicate something to a range of target audiences."),
        Subject("Motion Design","MD", "md-icon.png", "Agatha Dickinson", 30, 45, 2400, getTotalMDStudents(), "Essentially, motion design is a discipline that applies graphic design principles to filmmaking and video production through use of animation and visual effects."),
        Subject("Photography","PG", "pg-icon.png", "Lucy Livingston", 30, 45, 2600, getTotalPGStudents(), "Photography is the art, application, and practice of creating durable images by recording light, either electronically by means of an image sensor."),
        Subject("Game Design","GD", "gd-icon.png", "Lucy Livingston", 30, 45, 2600, getTotalGDStudents(), "Game designers create the rules, characters, settings, stories, and props for new games, and use computer programming languages to write the required code."),
    ).asObservable()
}   