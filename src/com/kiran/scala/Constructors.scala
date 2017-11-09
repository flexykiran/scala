package com.kiran.scala

class Constructors(private val name: String, private val age: Int) {
  
  println("Message Prints EveryTime ");
  
  def this(name: String){
    this(name, 100)
  }
  
  def print(): Unit = {
    println("Name "+name +":  Age "+age)
  }
  
}

object testConstructors {
    def main(args: Array[String]): Unit = {
      
      val x = new Constructors("Kiran", 30);
      x.print()
      
      val k = new Constructors("Zamrr")
      k.print()
    }
  
}