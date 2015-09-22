package org.jameslittle


import scalafx.geometry.Insets
import scalafx.scene.control.Label
import scalafx.scene.layout._
import scalafx.scene.paint.Paint
import scalafx.scene.shape.Polygon
import scalafx.scene.text.Font
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.{Node, Scene}
import scalafx.scene.paint.Color._
import scalafx.Includes._


package object display {

  case class TitleText(value: String) extends Label {
    text = value
    font = new Font("Ariel", 20)
    textFill = WhiteSmoke
  }
  case class SubText(value: String) extends Label {
    text = value
    font = new Font("Ariel", 15)
    textFill = WhiteSmoke
  }

  case class Display(items: Seq[Node]) extends GridPane {
    gridLinesVisible = false
    style = "-fx-background-color: #235a83"
    columnConstraints = Seq(
      new ColumnConstraints {
        percentWidth = 100
        padding = Insets(0, 3, 0, 3)
      }
    )
    rowConstraints = Seq(
      new RowConstraints {
        //padding = Insets(1, 1, 1, 1)
      }
    )
    for(i <- items.indices) {
      add(items(i), 0, i+1)
    }
  }


  trait StageValues { this: StageBuilder =>
    def title : String
    def scene : Scene
    val _height = 128
    val _width = 128

  }

  trait StageBuilder extends StageValues {

    val substage = new PrimaryStage

    substage.title = title
    substage.scene = scene
    substage.maxHeight = _height
    substage.maxWidth = _width
    substage.minHeight = _height
    substage.minWidth = _width


    def display() = substage.show()
    def close() = substage.close()

  }

}
