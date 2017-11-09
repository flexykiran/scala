package com.kiran.scala

trait TraitSpeedoMeter {
  
  protected var speed: Float
  def showSpeed: Float
  def accelerate(rate: Float)
  
}


//Generic speedometer which take any Type - T
trait TraitGenericSpeedoMeter[T] {
  
  protected var speed: T
  def showSpeed: T
  def accelerate(rate: T)
}