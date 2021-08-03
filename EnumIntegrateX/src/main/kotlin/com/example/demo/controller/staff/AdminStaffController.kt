package com.example.demo.controller.staff

import com.example.demo.model.AdminStaff
import com.example.demo.model.Student
import tornadofx.*

class AdminStaffController: Controller() {
    val adminStaffList = mutableListOf(
        AdminStaff("MR","Franky Mcmanus", "academic-staff-1.png", "8505065800088", "Admin", "Diploma", 15000),
        AdminStaff("MR","Gregg Bowman", "academic-staff-2.png", "8105065800087", "Admin", "Diploma", 15000),
        AdminStaff("MRS","Lucy Livingston", "academic-staff-3.png", "7805065800083", "Admin", "Degree", 15000),
        AdminStaff("MR","Colin Craft", "academic-staff-4.png", "9906205800088", "Admin", "Diploma", 15000),
        AdminStaff("MRS","Aimie Webb", "academic-staff-5.png", "8805064800083", "Admin", "Degree", 15000),
    ).asObservable()
}