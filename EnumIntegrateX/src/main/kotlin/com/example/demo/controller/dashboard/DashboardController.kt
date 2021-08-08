package com.example.demo.controller.dashboard

import com.example.demo.controller.staff.AcademicStaffController
import com.example.demo.controller.staff.AdminStaffController
import com.example.demo.controller.students.StudentsController
import tornadofx.*

class DashboardController: Controller() {

    //Instance of studentsController
    private val studentsController: StudentsController by inject()

    //Instance of academicStaffController & adminStaffController
    private val academicStaffController: AcademicStaffController by inject()
    private val adminStaffController: AdminStaffController by inject()

    //Instance of adminStaffList
    val adminStaffList = adminStaffController.adminStaffList

    //Function to get the amount of diploma students
    fun getTotalDiplomaStudents(): String {

        //Total diploma students initializer
        var totalDiplomaStudents = 0

        for (student in studentsController.studentsList) {
            if (student.educationProperty.value == "Diploma") {
                totalDiplomaStudents++
            }
        }
        return totalDiplomaStudents.toString()
    }

    //Function to get the amount of degree students
    fun getTotalDegreeStudents(): String {

        //Total degree students initializer
        var totalDegreeStudents = 0

        for (student in studentsController.studentsList) {
            if (student.educationProperty.value == "Degree") {
                totalDegreeStudents++
            }
        }
        return totalDegreeStudents.toString()
    }

    //Function to get the amount of admin staff
    fun getTotalAdminStaff(): String {

        //Total admin staff initializer
        var totalAdminStaff = 0

        for (staff in adminStaffController.adminStaffList) {
            if (staff.roleProperty.value == "Admin") {
                totalAdminStaff++
            }
        }
        return totalAdminStaff.toString()
    }

    //Function to get the amount of academic staff
    fun getTotalAcademicStaff(): String {

        //Total academic staff initializer
        var totalAcademicStaff = 0

        for (staff in academicStaffController.academicStaffList) {
            if (staff.roleProperty.value == "Lecturer") {
                totalAcademicStaff++
            }
        }
        return totalAcademicStaff.toString()
    }
}