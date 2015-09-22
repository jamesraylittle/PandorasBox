package org.jameslittle

import org.jameslittle.display.StageBuilder
import org.jameslittle.display.scenes.testBox._
import org.jameslittle.display.scenes._

import scalafx.Includes._
import scalafx.application.JFXApp
import javafx.scene.paint.{ Color => JFXColor }

import scalafx.application.JFXApp.PrimaryStage
import scalafx.stage.Stage


object Main extends JFXApp {

  stage = new SongInfo("Colt 45", "Afroman").substage
  stage = NetworkAddress.substage
}
