package com.kiran.scala


//SingleTon
//Object is equivalent to java static.
object Objects {
  
  def print(): Unit = {
    println("Hello Object - this is Static in Java ");
  }
  
}


object testObjects {
 
  def main(args: Array[String]): Unit = {
    Objects.print();    
  }
}