package com.kiran.scala.functions


//Passing function as variable.
class Function {
  
  def add(i: Int, j: Int): Int = (i + j)
  
  def multiply(i: Int, j: Int): Int = (i * j)
  //Any function with the definition f: (Int, Int) => Int Taking two Int inputs and return Int
  //Passing the operands op1: Int, op2: Int
  //Returns : Int  by calling the function passed as f(op1, op2)
  def operation(f: (Int, Int) => Int, op1: Int, op2: Int): Int = f(op1, op2)
  
  //Generic function Operation
  def genericFunction[T <: Any](f: (T, T) => T, op1: T, op2: T): T = f(op1, op2)
  
}

object Test {
  def main(args: Array[String]): Unit = {
    val x = new Function()
    println(x.operation(x.add,1, 2))
    println(x.operation(x.multiply, 2, 3)) 
    
    //Anonymous functions - lambda expressions: no need to declare functions like add, multiple define in the function itself.
     println(x.operation((a, b) => a - b, 8, 7))
     println(x.operation((a, b) => a / b, 8, 7))
     
     println(x.genericFunction((a: Int , b: Int) => a * b, 8, 7))
     println(x.genericFunction[Float]((a , b) => a * b, 8.1f, 7.1f))
  }
}