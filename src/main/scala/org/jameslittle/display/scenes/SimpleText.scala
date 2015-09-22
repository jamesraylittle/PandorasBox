package org.jameslittle.display.scenes


import org.jameslittle.display.StageBuilder


import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.geometry.Insets
import scalafx.scene.control.Label
import scalafx.scene.layout.VBox

object SimpleText extends StageBuilder {

  def title = "Simple Text Example"

  def scene = new Scene {
    root = {
      new VBox {
        padding = Insets(20)
        children = new Label {
          text = "Label styled as a bar"
          id = "label1"
        }
      }
    }
  }

}
