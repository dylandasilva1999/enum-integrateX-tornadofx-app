package com.example.demo.controller.staff

import com.example.demo.model.AdminStaff
import com.example.demo.model.Student
import tornadofx.*

class AdminStaffController: Controller() {
    val adminStaffList = mutableListOf(
        AdminStaff("MR","Franky Mcmanus", "admin-staff-1.png", "8505065800088", "Admin", "franky@gmail.com", 15000),
        AdminStaff("MR","Gregg Bowman", "admin-staff-2.png", "8105065800087", "Admin", "gregg@gmail.com", 15000),
        AdminStaff("MRS","Josephine Osborne", "admin-staff-3.png", "9503174800080", "Admin", "gregg@gmail.com", 15000),
        AdminStaff("MRS","Bella Novel", "admin-staff-3.png", "9503174800321", "Admin", "bella@gmail.com", 15000),
    ).asObservable()
}