// Databricks notebook source
class Calculadora {
 def soma(a: Int, b: Int): Int = a + b
 def subtracao(a: Int, b: Int): Int = a - b
 def multiplicacao(a: Int, b: Int): Int = a * b
 def divisao(a: Int, b: Int): Double = a.toDouble / b
}

object Main extends App {
 val calc = new Calculadora
 println(calc.soma(5, 3)) // Imprime 8
 println(calc.subtracao(5, 3)) // Imprime 2
 println(calc.multiplicacao(5, 3)) // Imprime 15
 println(calc.divisao(5, 3)) // Imprime 1.6666666666666667
}

Main.main(Array())

// COMMAND ----------

mainobj.main(Array())
