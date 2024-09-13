package com.example.phinconacademy

import android.R

fun main() {
    ConfigApp.getConfigApp()
    ConfigApp.changeTheme()
    ConfigApp.changeLanguange("EN")
    ConfigApp.getConfigApp()
    println(ConfigApp.env)
}

object ConfigApp {
    private var language: String = "ID"
    private var theme: String = "Dark"
    var env: String = "Prod"
        private set

    fun getConfigApp() {
        println("Setting saved: bahasa = $language, env = $env, tema = $theme")
    }

    fun changeTheme() {
        theme = if (theme == "Dark") "Light" else "Dark"
    }

    fun changeEnv(env: String) {
        this.env = env
    }

    fun changeLanguange(Language: String) {
        this.language = language
    }

}