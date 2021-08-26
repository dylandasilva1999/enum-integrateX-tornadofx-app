package com.example.demo.model

import javafx.beans.property.SimpleDoubleProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class University(name: String, poolFund: Double, image: String, description: String) {
    val nameProperty = SimpleStringProperty(name)
    val poolFundProperty = SimpleDoubleProperty(poolFund)
    val imageProperty = SimpleStringProperty(image)
    val descriptionProperty = SimpleStringProperty(description)
}

class UniversityModel(val university: University): ViewModel() {
    val name = bind{university.nameProperty}
    val poolFund = bind{university.poolFundProperty}
    val image = bind{university.imageProperty}
    val description = bind{university.descriptionProperty}
}