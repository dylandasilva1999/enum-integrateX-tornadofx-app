package com.example.demo.controller.staff

import com.example.demo.model.AcademicStaff
import com.example.demo.model.AdminStaff
import com.example.demo.model.Student
import tornadofx.*

class AcademicStaffController: Controller() {
    val academicStaffList = mutableListOf(
        AcademicStaff("MR","Wade Rodgers", "academic-staff-4.png", "8910185800085", "Lecturer", "CC, ID", 120, 32000),
        AcademicStaff("MRS","Agatha Dickinson", "academic-staff-3.png", "9602084800089", "Lecturer", "3DD, IL", 120, 32000),
        AcademicStaff("MRS","Lucy Livingston", "academic-staff-5.png", "8402084800085", "Lecturer", "MD, PG", 120, 32000),
    ).asObservable()
}