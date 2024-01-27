// Databricks notebook source
// hello world
val hello = "Hello, world"

// COMMAND ----------

Array(1,2,3,4).foreach(println)
println("HELLO MUNDO")
Array("Java","Scala","Python","R","Spark").foreach(println)

// COMMAND ----------

// assign a function to variable
val inc = (x : Int) => x + 1
inc(7)

// COMMAND ----------

// passing a function as parameter
(1 to 5) map (inc)

// COMMAND ----------

// take even number, multiply each value by 2 and sum them up
(1 to 7) filter (_ % 2 == 0 ) map (_ * 2) reduce (_ + _)

// COMMAND ----------

// Scala
val name = "scala"
val hasUpperCase = name.exists(_.isUpper)

// COMMAND ----------

var i = 5
loopWhile(i > 0) {
  println(i)
  i -= 1
}
def loopWhile(cond: => Boolean)(f: => Unit) : Unit = {
  if (cond) {
    f
    loopWhile(cond)(f)
  }
}

// COMMAND ----------

// mutable variables
var counter:Int = 10
var d = 0.0
var f = 0.3f

// immutable variables
val msg = "Hello Scala"
println(msg)
s"Greeting: $msg"

val ? = scala.math.Pi
println(?)

// COMMAND ----------

// string interpolation
val course = "Spark With Scala"
println(s"I am taking course $course.")
// support arbitrary expressions
println(s"2 + 2 = ${2 + 2}")
val year = 2017
println(s"Next year is ${year + 1}")

// COMMAND ----------

// looping constructs
var i = 0
do {
  println(s"Hello, world #$i")
  i = i + 1
} while (i <= 5)
println()

for (j<- 1 to 5) {
  println(s"Hello, world #$j")
}
println()

// what will be printed?
for (i <- 1 to 3) {
  var i = 2
  println(i)
}

// COMMAND ----------

// defining functions
def hello(name:String) : String = { "Hello " + name }

def hello1() = { "Hi there!" }
def hello2() = "Hi there!"
def hello3 = "Hi there!"

def max(a:Int, b:Int) : Int = if (a > b) a else b
max(4,6)
max(8,3)

// COMMAND ----------

// function literals
(x: Int, y: Int) => x + y
val sum = (x: Int, y: Int) => x + y
val prod = (x: Int, y: Int) => x * y

def doIt(msg:String, x:Int, y:Int, f: (Int, Int) => Int) = {
  println(msg + f(x,y))
}
doIt("sum: ", 1, 80, sum)
doIt("prod: ", 2, 33, prod)

// COMMAND ----------

// tuple
val pair1 = ("Scala", 1)
println(pair1._1)
println(pair1._2)
val pair2 = ("Scala", 1, 2017)
println(pair2._3)

// COMMAND ----------

// class

// constructor with two private instance variables
class Movie(name:String, year:Int)

// With two getter methods
class Movie1(val name:String, val year:Int)
val m1 = new Movie1("Star Wars", 1977)
println(m1.name + " " + m1.year)

// With two getter and setter methods
class Movie2(var name:String, var year:Int, var rating:String)
val m2 = new Movie2("Alien", 1979, "R")
m2.name = "Alien: Director's Edition"
println(m2.name + " Released: " + m2.year + " Rated: " + m2.rating)

// COMMAND ----------

// case class
case class Movie(name:String, year:Int)
val m = Movie("Avatar", 2009)
m.toString
println(m.name + " " + m.year)

// COMMAND ----------

// pattern matching with case class
abstract class Shape
case class Rectangle(h:Int, w:Int) extends Shape
case class Circle(r:Int) extends Shape

def area(s:Shape) = s match {
  case Rectangle(h,w) => h * w
  case Circle(r) => r * r * 3.14
}

println(area(Rectangle(4,5)))
println(area(Circle(5)))

// COMMAND ----------

// array
val myArray = Array(1,2,3,4,5);
myArray.foreach(a => print(a + " "))
println
myArray.foreach(println)

// COMMAND ----------

// list
val l = List(1,2,3,4);
l.foreach(println)
println()

println(l.head) //==> 1
println(l.tail) //==> List(2,3,4)
println(l.last) //==> 4
println(l.init) //==> List(1,2,3)
println()

val table: List[List[Int]] = List (
  List(1,0,0),
  List(0,1,0),
  List(0,0,1)
)

// COMMAND ----------

// working with lists
val list = List(2,3,4);

// cons operator – prepend a new element to the beginning
val m = 1::list

// appending
val n = list :+ 5

// to find out whether a list is empty or not
println("empty list? " + m.isEmpty)

// take the first n elements
list.take(2) //==> List(2,3)

// drop the first n elements
list.drop(2) //==> List(4)

// COMMAND ----------

// high order list methods
val n = List(1,2,3,4)
val s = List("LNKD", "GOOG", "AAPL")
val p = List(265.69, 511.78, 108.49)
var product = 1;
n.foreach(product *= _) //==> 24
n.filter(_ % 2 != 0)    //==> List(1,3)
n.partition(_ % 2 != 0) //==> (List(1,3), List(2,4))
n.find(_ % 2 != 0)      //==> Some(1)
n.find(_ < 0)           //==> None
p.takeWhile(_ > 200.00) //==> List(265.69, 511.78)
p.dropWhile(_ > 200.00) //==> List(108.49)
val p2 = List(265.69, 50.11, 511.78, 108.49)
p2.span(_ > 200.00)     //==> (List(265.69),List(50.11, 511.78,108.49))

// COMMAND ----------

// high order list methods
val n = List(1,2,3,4)
val s = List("LNKD", "GOOG", "AAPL")
n.map(_ + 1)                 //==> List(2,3,4,5)
s.flatMap(_.toList)          //==> List(L,N,K,D,G,O,O,G,A,A,P,L)
n.reduce((a,b) => { a + b} ) //==> 10
n.contains(3)                //==> true

// COMMAND ----------

// pattern matching with lists
val n = List(1,2,3,4)
val s = List("LNKD", "GOOG", "AAPL")
def sum(xs: List[Int]) : Int = xs match {
  case Nil => 0
  case x :: ys => x + sum(ys)
}

val dups = List(1,2,3,4,6,3,2,7,9,4)

// COMMAND ----------

object Test {
   def main(args: Array[String]) {
      println("Hello\tWorld\n\n" );
   }
} 

Test.main(Array())

// COMMAND ----------

// Creating object 
object Geeks { 

 // Main method 
 def main(args: Array[String]) { 
       
    // prints Hello, Geeks! 
    println("Hello, World!") 
 } 
}  

// Call the main method
Geeks.main(Array())



// COMMAND ----------

// Scala program to demonstrate 
// the Operators

// Creating object
object Geeks 
{ 
	
	// Main method
	def main(args: Array[String]) 
	{ 
	
		
		// Operands 
		var a = 10; 
		var b = 4; 
		var c = true;
		var d = false;
		var result = 0;
			
		// using arithmetic operators 
		println ("Addition is: "+ (a + b) ); 
		println ("Subtraction is: "+ (a - b) ) ; 
		
		// using Relational Operators 
		if (a == b) 
		{ 
		println ("Equal To Operator is True"); 
		} 
		else
		{ 
		println ("Equal To Operator is False"); 
		} 
		
		// using Logical Operator 'OR'
		println("Logical Or of a || b = " + (c || d)); 
		
		// using Bitwise AND Operator 
		result = a & b; 
		println ("Bitwise AND: " + result ); 
		
		// using Assignment Operators 
		println ("Addition Assignment Operator: " + (a += b) ); 
		
	} 
} 

// Call the main method
Geeks.main(Array())

// COMMAND ----------


