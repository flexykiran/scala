package com.kiran.scala

class TraitSpeedoImpl(var speed: Float) extends TraitSpeedoMeter{
 
  def showSpeed: Float = speed
    
  def accelerate(rate: Float) = {
    println(f"Accelerating @ Rate $rate")
  }
}

class TraitGerericSpeedoImpl[T] (var speed: T) extends TraitGenericSpeedoMeter[T]{
  
  def showSpeed: T = speed
    
  def accelerate(rate: T) = {
    println(f"Accelerating @ Rate $rate")
  }
}



object TestTraitSpeedoImpl {
  
  def main(args: Array[String]): Unit = {
    var x: TraitSpeedoImpl = new TraitSpeedoImpl(19.9f)
    println(x.showSpeed)
    println(x.accelerate(3.9f))
    
    var y: TraitGerericSpeedoImpl[Double] = new TraitGerericSpeedoImpl(50.9)
    println(y.showSpeed)
    println(y.accelerate(39.3))
  }
}