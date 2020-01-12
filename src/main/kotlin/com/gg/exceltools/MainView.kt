package com.gg.exceltools

import javafx.collections.FXCollections
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.StageStyle
import tornadofx.*
import tornadofx.Stylesheet.Companion.buttonsHbox
import tornadofx.Stylesheet.Companion.label
import java.time.LocalDate


class MainView : View() {
    override val root = vbox {
        button("Go to MyView2") {
            action {
                replaceWith(MyView2::class)
            }
        }
    }
}

class MyView2 : View() {
    override val root = vbox {
        button("Go to MyView1") {
            action {
                replaceWith(MainView::class, ViewTransition.Slide(0.3.seconds, ViewTransition.Direction.LEFT))
            }
        }
    }
}
