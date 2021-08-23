package com.example.demo.view.students.studentEditorView

import com.example.demo.app.Styles
import com.example.demo.controller.staff.AcademicStaffController
import com.example.demo.controller.staff.AdminStaffController
import com.example.demo.controller.staff.AdminStaffEditorController
import com.example.demo.controller.students.StudentEditorController
import com.example.demo.controller.students.StudentsController
import com.example.demo.controller.subjects.SubjectsController
import com.example.demo.model.AdminStaff
import com.example.demo.model.Student
import com.example.demo.model.StudentModel
import javafx.beans.binding.Bindings
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.geometry.Orientation
import javafx.scene.control.Alert
import javafx.scene.control.ButtonBar
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*
import java.util.*
import javax.swing.text.Style
import kotlin.random.Random

class adminStaffEditorView : View("Add Admin Staff View") {

    //Instance of adminStaffEditorController
    val adminStaffEditorController: AdminStaffEditorController by inject()

    override val root = vbox {
        style {
            backgroundColor = multi(Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor, Styles.mutedDarkBlueColor)
        }
        setPrefSize(500.0, 500.0)
        label("Add admin staff") {
            vboxConstraints {
                marginTop = 0.0
                marginLeft = 12.0
            }
            style {
                fontWeight = FontWeight.BOLD
                textFill = Color.WHITE
                fontSize = 36.px
                fontFamily = "Source Sans Pro"
            }
            paddingLeft = 25.0
            paddingTop = 15.0
            paddingBottom = 10.0
        }
        form {
            style {
                paddingTop = 25.0
                paddingLeft = 80.0
                paddingRight = 80.0
                paddingBottom = 80.0
                fontSize = 15.px
                fontWeight = FontWeight.NORMAL
                fontFamily = "Source Sans Pro"
                prefWidth = 300.px
            }
            fieldset() {
                labelPosition = Orientation.VERTICAL
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    combobox(adminStaffEditorController.selectedAdminTitle, adminStaffEditorController.adminStaffTitle) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(4.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Color.WHITE)
                        }
                        useMaxWidth = true
                        paddingBottom = 20.0
                    }.promptText = "Choose staff title"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(adminStaffEditorController.adminStaffFullName) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }.promptText = "Enter staff full name"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(adminStaffEditorController.adminStaffEmail) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }.promptText = "gregg@staff.co.za"
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(adminStaffEditorController.adminStaffImage) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }
                }
                field() {
                    vboxConstraints {
                        paddingTop = 20.0
                    }
                    textfield(adminStaffEditorController.adminStaffIdNumber) {
                        style {
                            textFill = Styles.darkBlueColor
                            backgroundColor = multi(
                                Color.WHITE,
                                Color.WHITE,
                                Color.WHITE
                            )
                            padding = box(12.px)
                            borderWidth += box(1.5.px)
                            backgroundRadius += box(9.px)
                            borderRadius += box(9.px)
                            borderColor += box(Styles.mutedOrangeColor)
                        }
                        useMaxWidth = true
                    }.promptText = "Enter staff ID number"
                }
            }
            button("Add Admin Staff") {
                adminStaffEditorController.adminStaffImage.value = "default-profile.png"
                adminStaffEditorController.adminStaffRole.value = "Admin"
                adminStaffEditorController.adminStaffSalary.value = 15000

                vboxConstraints {
                    marginTop = 20.0
                }
                style {
                    fontSize = 20.px
                    borderWidth += box(1.5.px)
                    backgroundRadius += box(9.px)
                    fontFamily = "Source Sans Pro"
                    fontWeight = FontWeight.BOLD
                    textFill = Color.WHITE
                    backgroundColor = multi(Styles.blueColor, Styles.blueColor, Styles.blueColor)
                }
                useMaxWidth = true
                action {
                    val newAdminStaff = AdminStaff(
                        adminStaffEditorController.selectedAdminTitle.value,
                        adminStaffEditorController.adminStaffFullName.value,
                        adminStaffEditorController.adminStaffImage.value,
                        adminStaffEditorController.adminStaffIdNumber.value,
                        adminStaffEditorController.adminStaffRole.value,
                        adminStaffEditorController.adminStaffEmail.value,
                        adminStaffEditorController.adminStaffSalary.value
                    )

                    adminStaffEditorController.adminStaffList.add(newAdminStaff)
                }
            }
            paddingLeft = 30.0
            paddingRight = 30.0
            paddingTop = 0.0
            paddingBottom = 30.0
        }
    }
}