package org.jameslittle.python

import org.python.core.PyString
import org.python.util.PythonInterpreter



object Python {
  val interpreter = new PythonInterpreter()
  val pythonDir = "src/main/python/"

  def run(fileName: String, filePath: String = pythonDir) = {
    if(fileName.endsWith(".py")) interpreter.execfile(pythonDir + fileName)
    else interpreter.execfile(pythonDir + fileName + ".py")
  }

  def string(s: String) : PyString = new PyString(s)

}
