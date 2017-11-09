package com.kiran.scala


abstract class MyAbstractFile {
  def open(fileName: String): Unit 
  def save(fileName: String): Unit
}

class MyFile extends MyAbstractFile {
  
  override def open(fileName: String): Unit = {
    println("Open fileName "+fileName)
  }
  override def save(fileName: String): Unit = {
    println("Saving fileName "+fileName)
  }
}

class MyCompressedFile extends MyFile {
  
  override def save(fileName: String): Unit = {
    println("Compressing file "+fileName)
    super.save(fileName)
  }
}

object TestFiles {
  
  def main(args: Array[String]): Unit = {
   val file = "Art of reading"
   val file1 = "Art of schooling"
   
   println("**** Testing MyFile ****")
   var x:MyAbstractFile = new MyFile()
   x.open(file)
   x.save(file)
   
   println("**** Testing MyCompressedFile ****")
   x = new MyCompressedFile()
   x.open(file1)
   x.save(file1)
    
  }
}