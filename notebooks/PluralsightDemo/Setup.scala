// Databricks notebook source
val configs = Map(
  "dfs.adls.oauth2.access.token.provider.type" -> "ClientCredential",
  "dfs.adls.oauth2.client.id" -> "7d2c26b2-3360-45eb-a41d-e746e9ba640a",
  "dfs.adls.oauth2.credential" -> "V2.L4LVh.LJ34Krt8OnPQG1.xExK7PS.QI",
  "dfs.adls.oauth2.refresh.url" -> "https://login.microsoftonline.com/84c31ca0-ac3b-4eae-ad11-519d80233e6f/oauth2/token")
dbutils.fs.mount(
  source = "adl://pratikdatabricks.azuredatalakestore.net",
  mountPoint = "/mnt/datalake",
  extraConfigs = configs
)

// COMMAND ----------

val configs = Map(
  "fs.azure.account.key.pratikazuredatabricks.blob.core.windows.net" ->
  "I1KHtVPbbcDdCMKBfNTIKQlI7VEpjX+RQ1ast8dNszoEfQumMuSeEHz1HMZmdXI4lMOIdLwcV9BUi/dMF992ZQ=="
)
dbutils.fs.mount(
  source = "wasbs://taxisource@pratikazuredatabricks.blob.core.windows.net/",
  mountPoint = "/mnt/storage",
  extraConfigs = configs
)

// COMMAND ----------

