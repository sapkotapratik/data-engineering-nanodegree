// Databricks notebook source
display(
  dbutils.fs.ls("/mnt/datalake")
)

// COMMAND ----------

dbutils.fs.head("/mnt/datalake/TaxiZones.csv")

// COMMAND ----------

display(
  dbutils.fs.ls("/mnt/storage")
)

// COMMAND ----------

