package com.example.demo.controller.login

import com.example.demo.model.User
import tornadofx.*

class LoginController: Controller() {

    //Login Check Function
    fun loginCheck(user: User): Boolean {
        return (user.usernameProperty.value == "dylan" && user.passwordProperty.value == "1234")
    }
}