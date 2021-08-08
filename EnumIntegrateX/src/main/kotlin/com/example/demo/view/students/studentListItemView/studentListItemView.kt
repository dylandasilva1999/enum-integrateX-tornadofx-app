package com.example.demo.view.students.studentListItemView

import com.example.demo.app.Styles
import com.example.demo.controller.students.StudentsController
import com.example.demo.model.StudentModel
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class studentListItemView(val studentModel: StudentModel) : View("Student List Item View") {

    //Instance of studentsController
    val studentsController: StudentsController by inject()

    override val root = vbox {
        stackpane {
            stackpaneConstraints {
                paddingTop = 20.0
            }
            rectangle {
                arcHeight = 60.0
                arcWidth = 60.0
                width = 1460.0
                height = 120.0
                strokeWidth = 1.0
                fill = Styles.darkBlueColor
                opacity = 1.0
            }
            hbox {
                imageview(studentModel.image) {
                    hboxConstraints {
                        marginTop = 15.0
                        marginLeft = 28.0
                    }
                    fitHeight = 90.0
                    fitWidth = 90.0
                    isPreserveRatio = true
                }
                label(studentModel.title) {
                    hboxConstraints {
                        marginTop = 45.0
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
                label(studentModel.fullName) {
                    hboxConstraints {
                        marginTop = 45.0
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
                label(studentModel.idNumber) {
                    hboxConstraints {
                        marginTop = 45.0
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
                label(studentModel.education) {
                    hboxConstraints {
                        marginTop = 45.0
                        marginLeft = 80.0
                    }
                    style {
                        fontWeight = FontWeight.NORMAL
                        textFill = Color.WHITE
                        fontSize = 22.px
                        fontFamily = "Source Sans Pro"
                    }
                    minWidth = 80.0
                }
                button("View Student Details") {
                    hboxConstraints {
                        marginTop = 35.0
                        marginLeft = 70.0
                    }
                    action {
                        //Action here
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
                button("Remove") {
                    hboxConstraints {
                        marginTop = 35.0
                        marginLeft = 20.0
                    }
                    action {
                        //Action here
                    }
                    style {
                        fontSize = 20.px
                        borderWidth += box(2.5.px)
                        borderColor += box(Styles.yellowColor)
                        borderRadius += box(9.px)
                        fontFamily = "Source Sans Pro"
                        fontWeight = FontWeight.BOLD
                        textFill = Color.WHITE
                        backgroundColor = multi(Color.TRANSPARENT, Color.TRANSPARENT, Color.TRANSPARENT)
                    }
                    useMaxWidth = true
                    paddingAll = 10.0
                    paddingLeft = 30.0
                    paddingRight = 30.0
                }
            }
        }
    }

}