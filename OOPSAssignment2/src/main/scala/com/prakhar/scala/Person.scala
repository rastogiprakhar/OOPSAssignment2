package com.prakhar.scala

case class Person (name:String,age:Int) extends Ordered[Person]{
  override def compare(that: Person): Int = {
    this.age-that.age;
  }
}
