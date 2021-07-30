package com.example.demo.model

import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class User {
    val usernameProperty = SimpleStringProperty()
    val passwordProperty = SimpleStringProperty()
}

class UserModel(var user: User): ViewModel() {
    val username = bind{user.usernameProperty}
    val password = bind{user.passwordProperty}
}