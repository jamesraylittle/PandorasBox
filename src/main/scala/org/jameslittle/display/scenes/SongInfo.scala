package org.jameslittle.display.scenes

import org.jameslittle.display._

import scalafx.scene.Scene
import scalafx.scene.control.ProgressBar
import scalafx.scene.layout._
import scalafx.scene.paint.Color._
import scalafx.Includes._
import scalafx.scene.shape.Polygon


class SongInfo(songTitle: String, songArtist: String) extends StageBuilder {

  def title = "Song Info"

  def scene = new Scene {
    root = Display(Seq(
        TitleText(songTitle),
        SubText(s"by $songArtist"),
        new ProgressBar { progress = 0.25; maxWidth = _width; }

      ))
  }

}
