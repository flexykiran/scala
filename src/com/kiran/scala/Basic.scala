package com.kiran.scala

class Basic {
 
  def print(): Unit = {
    println("Priniting Hello World..")
  }
} 

object testBasic {
  
  def main(args: Array[String]): Unit = {
    val b = new Basic()
    b.print()
  }
}