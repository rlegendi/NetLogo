// (C) 2011 Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.nvm

trait GeneratorInterface {
  def generate(): Array[Command]
}
