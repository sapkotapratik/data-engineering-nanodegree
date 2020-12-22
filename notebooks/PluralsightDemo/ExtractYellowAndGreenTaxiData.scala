// Databricks notebook source
display(
  dbutils.fs.ls("/mnt/datalake")
)

// COMMAND ----------

//This magic command works similar to upper command
%fs ls /mnt/datalake

// COMMAND ----------

// MAGIC %fs head /mnt/datalake/YellowTaxiTripData_201812.csv

// COMMAND ----------

var yellowTaxiTripDataDF = spark
  .read
  .option("header","true")
  .csv("dbfs:/mnt/datalake/YellowTaxiTripData_201812.csv")

// COMMAND ----------

display(
    yellowTaxiTripDataDF
)

// COMMAND ----------

// tsv file so delimiter is tab
var greenTaxiTripDataDF = spark
  .read
  .option("header","true")
  .option("delimiter","\t")
  .csv("dbfs:/mnt/datalake/GreenTaxiTripData_201812.csv")

// COMMAND ----------

// MAGIC %fs head /mnt/datalake/PaymentTypes.json|

// COMMAND ----------

var paymentTypesDF = spark
  .read
  .json("/mnt/datalake/PaymentTypes.json")

display(paymentTypesDF)

// COMMAND ----------

