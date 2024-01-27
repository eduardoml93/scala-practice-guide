// Databricks notebook source
// MAGIC %md
// MAGIC ## Step 1: Create a DataFrame with Scala

// COMMAND ----------

case class City(rank: Long, city: String, state: String, code: String, population: Long, price: Double)

val df1 = Seq(new City(295, "South Bend", "Indiana", "IN", 101190, 112.9)).toDF

display(df1)

// COMMAND ----------

// MAGIC %md
// MAGIC ## Step 2: Load data into a DataFrame from files
// MAGIC

// COMMAND ----------

val df2 = spark.read
  .format("csv")
  .option("header", "true")
  .option("inferSchema", "true")
  .load("/databricks-datasets/samples/population-vs-price/data_geo.csv")


// COMMAND ----------

display(df2)

// COMMAND ----------


