package com.kiran.scala

//Case classess are like POJO's or Entity classes which represent a database table.
//default methods - toString, equals, hashcode, copy
case class CaseClass(empId: Int, empName: String, empEmail: String)

object Test {
  
  def main(args: Array[String]): Unit = {
    
    val x = new CaseClass(100, "Kiran", "07860129905");
    val y = new CaseClass(101, "Flexy", "07860129906");
    println(x.toString())
    println(x==y)
    
    //Full Copy
    val z = x.copy()
    println(x==z)
    
    //Partial Copy
    val w = x.copy(empId = 400)
    println(x==w)
    println(w.toString())
    
    
    println(x.hashCode())
    println(y.hashCode())
    println(z.hashCode())
    
    println(x.hashCode() == z.hashCode())
  }
}
