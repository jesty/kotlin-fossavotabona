package app

import react.*
import react.dom.*
import logo.*
import ticker.*
import contact.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            key = "header"
            logo()
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p("App-intro") {
            key = "intro"
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            key = "ticker"
            ticker()
        }
        div("App-contact") {
            key = "contact"
            contactList("Davide")
        }
    }
}

fun RBuilder.app() = child(App::class) {}
