package com.kiran.scala.functions

object FOR {
  val x = for(i<- 1 to 20 if 1%2 ==0)  yield(i)
  print(x)
}