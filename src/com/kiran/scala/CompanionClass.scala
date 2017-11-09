package com.kiran.scala

// Rule: Object and Class should be of same name and should be in same source file.
// Class and Object can access their private variables.
// it has instance and non-instance (static) methods.
// instances -> class level & non-instance -> object level.
class CompanionClass {
  
  CompanionClass.count +=1
}

object CompanionClass {
  
  //static variable
  var count = 0
  //static method
  def showCount(): Unit = {
    println("Count is "+count)
  }
}

object MainObj {
  
  def main(args: Array[String]): Unit = {
    
    for(i <- 1 to 4){
      new CompanionClass()
    }
    
    CompanionClass.showCount()
  }
}