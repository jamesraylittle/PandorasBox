package org.jameslittle.display.scenes

import java.net.InetAddress

import org.jameslittle.display.{SubText, TitleText, Display, StageBuilder}

import scalafx.scene.Scene

object NetworkAddress extends StageBuilder {
  def title = "Network Address"

  def ip = InetAddress.getLocalHost.getHostAddress.toString

  def scene = new Scene {
    root = Display(Seq(
      TitleText("IP Address"),
      SubText(ip)
    ))
  }

}
