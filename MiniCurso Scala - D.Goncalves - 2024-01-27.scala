// Databricks notebook source
var name = "Dundun"

// COMMAND ----------

val nome = "Dundun"

// COMMAND ----------

val valor: Int = 1

// COMMAND ----------

val valor: Double = 1

// COMMAND ----------

val valor = 1.0

// COMMAND ----------

def multiplosDeDois(valor: Int): Boolean = valor % 2 == 0

// COMMAND ----------

multiplosDeDois(2)

// COMMAND ----------

multiplosDeDois(3)

// COMMAND ----------

def multiplosDeDois(valor: Int) = valor % 2 == 0

// COMMAND ----------

object Hello {
 def main(args: Array[String]) = {
  val nome = "Dundun"
  println(s"Meu nome é $nome")
  println("Olar Mundo")

 }

}

// COMMAND ----------

Hello.main(Array())

// COMMAND ----------

// ele esta usando o InteliJ

def ehPar(x: Int): Boolean = x % 2 == 0

// COMMAND ----------

ehPar(10)

// COMMAND ----------

ehPar(9)

// COMMAND ----------

def ehImpar(x: Int): Boolean = !ehPar(x)

// COMMAND ----------

ehImpar(3)

// COMMAND ----------

ehImpar(4)

// COMMAND ----------

val lista = List(1,2,3,4,5,6)

val listaPares = lista.filter(ehPar(_))

// COMMAND ----------


val listaPares = lista.filter(x=> ehPar(x))

// COMMAND ----------

val listaImpares = lista.filterNot(x=> ehPar(x))

// COMMAND ----------

lista.map(x => x*2)

// COMMAND ----------

val listaMultPorDois = lista.map(x => x*2)

// COMMAND ----------

val listaMultPorUmPontoUm = lista.map(x => x*1.1)

// COMMAND ----------

lista.reverse

// COMMAND ----------

class Calculadora {
 def soma(x:Int, y:Int): Int = x + y

 def sub(x:Int, y:Int): Int = x - y
}

// COMMAND ----------

object TesteCalc {
 
 def main(args: Array[String]): Unit = {

  val calc = new Calculadora()
  val resultado = calc.soma(10,20)
  println(s"O resultado eh $resultado")
 }
}

// COMMAND ----------

TesteCalc.main(Array())

// COMMAND ----------

object Calculadora {
 def soma(x:Int, y:Int): Int = x + y

 def sub(x:Int, y:Int): Int = x - y
}


// COMMAND ----------

object TesteCalc {
 
 def main(args: Array[String]): Unit = {
  val resultado = Calculadora.soma(10,20)
  println(s"O resultado eh $resultado")
 }
}

// COMMAND ----------

TesteCalc.main(Array())

// COMMAND ----------

class Calculadora {
 def soma(x:Int, y:Int): Int = x + y

 def sub(x:Int, y:Int): Int = x - y

 def multiplicacao(x:Int, y:Int): Int = x * y

 def divisao(x:Int, y:Int): Double = (x/y)
}

// COMMAND ----------

object TesteCalc {
 
 def main(args: Array[String]): Unit = {

  val calc = new Calculadora()
  val soma = calc.soma(10,20)
  val sub = calc.sub(10,20)
  val multiplicacao = calc.multiplicacao(10,20)
  val divisao = calc.divisao(10,20)
  println(s"O resultado soma eh $soma")
  println(s"O resultado sub eh $sub")
  println(s"O resultado multiplicacao eh $multiplicacao")
  println(s"O resultado divisao eh $divisao")
 }
}

// COMMAND ----------

TesteCalc.main(Array())

// COMMAND ----------


