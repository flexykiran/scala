package com.kiran.scala.functions

object Area {
 
  val pi: Float = 3.21f
  
  def areaOfRect(l: Int, b: Int): Unit = {
    print(l * b)
  }
  
  def areaOfCircle(r: Int): Unit = {
    print(2 * pi * r)
  }
  
}