package com.example.demo.controller.funds

import com.example.demo.controller.staff.AcademicStaffController
import com.example.demo.controller.staff.AcademicStaffEditorController
import com.example.demo.controller.staff.AdminStaffController
import com.example.demo.controller.students.StudentsController
import com.example.demo.model.Student
import com.example.demo.model.University
import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleIntegerProperty
import tornadofx.*

class FundsController: Controller() {
    val universityList = mutableListOf(
        University("Open Window Institute",2000000.00, "university-1.png", "Open Window is an accredited private higher education provider. " +
                "It was established in 1993 as an art school. It has since expanded into an institute offering three bachelor's degrees, a postgraduate degree and " +
                "accredited certificates."),
    ).asObservable()

    fun universityPoolFundTotal(): SimpleDoubleProperty {
        var totalUniversityPoolFund = SimpleDoubleProperty()

        for (university in universityList) {
            totalUniversityPoolFund = university.poolFundProperty
        }

        return totalUniversityPoolFund
    }

    //Instance of studentsController
    val studentsController: StudentsController by inject()
    //Student List
    val studentList = studentsController.studentsList

    //Incoming
    //Get Total Student Fees
    fun getTotalStudentFees(): SimpleDoubleProperty {
        var totalStudentsFees = SimpleDoubleProperty()

        for (student in studentList) {
            totalStudentsFees += student.feesProperty.value.toDouble()
        }

        return totalStudentsFees
    }

    //Instance of academicStaffController
    val adminStaffController: AdminStaffController by inject()
    //Academic Staff List
    val adminStaffList = adminStaffController.adminStaffList

    //Outgoing
    //Get Total Admin Staff Salary
    fun getTotalAdminStaffFees(): SimpleDoubleProperty {
        var totalAdminStaffFees = SimpleDoubleProperty()

        for (adminStaff in adminStaffList) {
            totalAdminStaffFees += adminStaff.salaryProperty.value.toDouble()
        }

        return totalAdminStaffFees
    }

    //Instance of academicStaffController
    val academicStaffController: AcademicStaffController by inject()
    //Instance of academicStaffController
    val academicStaffEditorController: AcademicStaffEditorController by inject()
    //Academic Staff List
    val academicStaffList = academicStaffController.academicStaffList

    //Outgoing
    //Get Total Academic Staff Salary
    fun getTotalAcademicStaffFees(): SimpleDoubleProperty {
        var totalAcademicStaffFees = SimpleDoubleProperty()

        for (academicStaff in academicStaffList) {
            totalAcademicStaffFees += academicStaffEditorController.calculateAcademicStaffSalary().value.toDouble()
        }

        return totalAcademicStaffFees
    }

    //Total Outgoing Payments
    fun outgoingPayments(): SimpleDoubleProperty {
        var totalOutgoingPayments = SimpleDoubleProperty()
        totalOutgoingPayments += getTotalAdminStaffFees().value.toDouble() + getTotalAcademicStaffFees().value.toDouble()

        return totalOutgoingPayments
    }

    //Total Incoming Payments
    fun incomingPayments(): SimpleDoubleProperty {
        var totalIncomingPayments = SimpleDoubleProperty()
        totalIncomingPayments += getTotalStudentFees().value.toDouble()

        return totalIncomingPayments
    }

    //Settle Incoming Payments
    fun settlePayments(): SimpleDoubleProperty {
        var totalPoolFund = SimpleDoubleProperty()
        var newTotalPoolFund = SimpleDoubleProperty()

        totalPoolFund = universityPoolFundTotal()

        totalPoolFund += incomingPayments()
        totalPoolFund -= outgoingPayments()

        newTotalPoolFund = totalPoolFund

        return newTotalPoolFund
    }
}