package com.kiran.scala

class Utility {
  var list = (1 to 20).toList
  var string = "FLEXY_KIRAN"
  val arry = Array("Hi How are you" ,"I am good", "Had breakfast?")
}
 
object TestUtil {
  
  def main(args: Array[String]): Unit = {
      var x = new Utility();
      println(x.list)
      println("---------MAP Functions---------")
      //MAP Function:
      println(x.string.map(c => c.toLower))
      
      println(x.list.map(c => c * 20))
      
      //wildcard - every element will be substituted
      println(x.list.map(_ * 2))
      
      println("---------FILTERS Functions---------")
      println(x.list.filter(c => c % 2 !=0))
      
      println(x.list.filter(_ % 2 !=0))
      
      println("---------REDUCE Functions---------")
      println(x.list.reduce(_ + _))
      
      println(x.list.reduce((acc, n) => acc + n*2))
      
      println("---------Function Chaining---------")
      println("---------Filter Out Odd Numbers, Squares them and find the Sum---------")
      
      println(x.list.filter(_ % 2 != 0).map(c => c * c).reduce(_ + _))
      
      
      println("---------FLAT MAP Functions---------")
      println(x.arry.toList)
      println(x.arry.map(_.split(" ").toList).toList)

      println((x.arry.flatMap(_.split(" ").toList).toList).map(c => c.toLowerCase()))
    }
}