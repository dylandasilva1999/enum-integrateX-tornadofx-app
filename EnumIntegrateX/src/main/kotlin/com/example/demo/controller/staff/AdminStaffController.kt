package com.example.demo.controller.staff

import com.example.demo.model.AdminStaff
import com.example.demo.model.Student
import tornadofx.*

class AdminStaffController: Controller() {
    val adminStaffList = mutableListOf(
        AdminStaff("MR","Franky Mcmanus", "academic-staff-1.png", "8505065800088", "Admin", "franky@gmail.com", 15000),
        AdminStaff("MR","Gregg Bowman", "academic-staff-2.png", "8105065800087", "Admin", "gregg@gmail.com", 15000),
    ).asObservable()
}