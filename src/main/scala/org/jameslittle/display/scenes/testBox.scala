package org.jameslittle.display.scenes

import org.jameslittle.display.StageBuilder

import scalafx.stage.Stage

import com.sun.javafx.stage.StageHelper

import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.effect.DropShadow
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint.{Stops, LinearGradient}
import scalafx.scene.text.Text

object testBox extends StageBuilder {


    def title = "My Test Box"
    def scene = new Scene {
      fill = Green
      content = new HBox {
        children = Seq(
          new Text {
            text = "Hello"
          }
        )
      }
    }

}
