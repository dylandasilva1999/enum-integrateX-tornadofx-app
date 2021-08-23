package com.example.demo.view.students.studentListItemView

import com.example.demo.app.Styles
import com.example.demo.controller.staff.AcademicStaffController
import com.example.demo.controller.staff.AdminStaffController
import com.example.demo.controller.students.StudentsController
import com.example.demo.model.*
import com.example.demo.view.students.studentDetailsView.academicStaffDetailsView
import com.example.demo.view.students.studentDetailsView.adminStaffDetailsView
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class adminStaffListItemView(val adminStaff: AdminStaffModel) : View("Admin Staff List Item View") {
    //Instance of adminStaffController
    val adminStaffController: AdminStaffController by inject()
    //Admin Staff List
    val adminStaffList = adminStaffController.adminStaffList

    fun getAdminStaff(): AdminStaff {
        val selectedAdminStaff = AdminStaff(
            adminStaff.title.value,
            adminStaff.fullName.value,
            adminStaff.image.value,
            adminStaff.idNumber.value,
            adminStaff.role.value,
            adminStaff.email.value,
            adminStaff.salary.value
        )
        return selectedAdminStaff
    }

    override val root = vbox {

        val adminStaffModel = AdminStaffModel(getAdminStaff())

        val fragmentScope = Scope()
        setInScope(adminStaffModel, fragmentScope)

        fun changeView() {
            this += find<adminStaffDetailsView>(fragmentScope)
        }

        stackpane {
            stackpaneConstraints {
                paddingTop = 20.0
            }
            rectangle {
                arcHeight = 60.0
                arcWidth = 60.0
                width = 1460.0
                height = 110.0
                strokeWidth = 1.0
                fill = Styles.darkBlueColor
                opacity = 1.0
            }
            hbox {
                imageview(adminStaff.image) {
                    hboxConstraints {
                        marginTop = 18.0
                        marginLeft = 20.0
                    }
                    fitHeight = 75.0
                    fitWidth = 75.0
                    isPreserveRatio = true
                }
                label(adminStaff.title) {
                    hboxConstraints {
                        marginTop = 40.0
                        marginLeft = 40.0
                    }
                    style {
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        fontSize = 22.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 50.0
                }
                label(adminStaff.fullName) {
                    hboxConstraints {
                        marginTop = 40.0
                        marginLeft = 80.0
                    }
                    style {
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        fontSize = 22.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 320.0
                }
                label(adminStaff.idNumber) {
                    hboxConstraints {
                        marginTop = 40.0
                        marginLeft = 50.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 22.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 150.0
                }
                label(adminStaff.role) {
                    hboxConstraints {
                        marginTop = 40.0
                        marginLeft = 140.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 22.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 80.0
                }
                button("View Staff Details") {
                    hboxConstraints {
                        marginTop = 30.0
                        marginLeft = 200.0
                    }
                    action {
                        getAdminStaff()
                        changeView()
                    }
                    style {
                        fontSize = 20.px
                        borderWidth += box(1.5.px)
                        backgroundRadius += box(9.px)
                        fontFamily = "Source Sans Pro"
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        backgroundColor = multi(Styles.orangeColor, Styles.orangeColor, Styles.orangeColor)
                    }
                    useMaxWidth = true
                    paddingAll = 12.0
                    paddingLeft = 30.0
                    paddingRight = 30.0
                }
            }
        }
    }
}