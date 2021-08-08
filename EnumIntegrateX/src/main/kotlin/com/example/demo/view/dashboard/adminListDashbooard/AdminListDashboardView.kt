package com.example.demo.view.dashboard.adminListDashbooard

import com.example.demo.controller.dashboard.DashboardController
import com.example.demo.model.AdminStaffModel
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class AdminListDashboardView(val adminStaffModel: AdminStaffModel) : View("Admin List Dashboard View") {

    //Instance of dashboardController
    val dashboardController: DashboardController by inject()

    override val root = vbox {
        hbox {
            hboxConstraints {
                paddingTop = 10.0
            }
            imageview(adminStaffModel.image.value) {
                hboxConstraints {
                    marginTop = 20.0
                    marginLeft = 40.0
                }
                fitHeight = 65.0
                fitWidth = 65.0
                isPreserveRatio = true
            }
            vbox {
                label(adminStaffModel.role.value) {
                    vboxConstraints {
                        marginTop = 30.0
                        marginLeft = 20.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 16.px
                        fontFamily = "Source Sans Pro"
                    }
                }
                label(adminStaffModel.fullName.value) {
                    vboxConstraints {
                        marginLeft = 20.0
                    }
                    style {
                        fontWeight = FontWeight.EXTRA_BOLD
                        textFill = Color.WHITE
                        fontSize = 16.px
                        fontFamily = "Source Sans Pro"
                    }
                }
            }
        }
    }
}