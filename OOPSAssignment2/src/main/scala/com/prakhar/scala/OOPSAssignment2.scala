package com.prakhar.scala

object OOPSAssignment2 {
  def main(args: Array[String]): Unit =
  {
    val person1 =Person("Test",25)
    val person2 =Person("Test",20)

    if(person1.name.equals(person2.name))
    {
      val comparison=person1.compare(person2)
      if(comparison<0)
        println("FALSE | Name is same and Person1 is younger in age")
      else if(comparison>0)
        println("FALSE | Name is same and Person1 is greater in age")
      else
        println("TRUE | Name is same and Both are of same age")
    }
    else
    {
      if(person1.name.length >person2.name.length)
        println("FALSE | Name is different and Person1 has greater name length")
      else if(person2.name.length > person1.name.length)
        println("FALSE | Name is different and Person2 has greater name length")
      else
        println("TRUE | Name is different and Both are of same length")
    }
  }
}
