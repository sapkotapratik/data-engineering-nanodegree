Data Warehouse Complete Tutorial (SQL+ SSIS +SSAS + Power BI)



# **Topics**

1. Introduction
2. DW Architecture
3. DW Terminologies
	1) ETL VS ELT
	2) OLTP vs OLAP
	3) Staging vs ODS
4. Business Case Study
	Adventure Works
5. Designing DW
	1) Staging Layer
	2) Dimensional Modelling
	(Design Star Schema)
	a) Identify Fact
	b) Identify Dimension and Type

6. DW Implementation
	1) Creating DW Database
	2) Creating Database Objects
7. SSIS
	1) ETL (SSIS) Load Source to Staging
	2) ETL (SSIS) Load Staging to DW
	3) Control Packages
8. SSAS
	1) Create Tabular Model
	2) Calculation using DAX
9. Scheduling Jobs
	1) Datawarehouse
	2) Power Bl
10. Summary



**Definition**

- DWs are central repositories of integrated data from one or more disparate
sources
- It is a system used for reporting and data analysis and is considered a core
component of business intelligence


**What is Business Intelligence**

• It is the strategies and technologies used by enterprises for the data
analysis of information
• To implement Bl Solution You need a Data warehouse




**Why we need Data warehouse**

• You need to integrate many different sources of data
• Avoid Users are running reports directly against operational systems
• Having single version of the truth
• You have tons of historical data that you need to gather in one easily
accessible place even if the source transaction systems doesn't
• There is a risk that report users might misuse or corrupt the
transaction data
• Allows users to create their own reports without having to get IT
involved. Leading to "Self Service BI"
• A convenient place to create and store metadata and Business logics
• Improve data quality by cleaning up data as it is imported into the
data warehouse
• Proven Technology


# **Architecture**

![image.png](/.attachments/image-865214bf-4815-4e8e-bd60-3f8fad52e524.png)

# **Modern DataWarehouse Architecture**

![image.png](/.attachments/image-bc9a146f-6f63-4ea7-99bc-6f2d98e578e8.png)

# **Terminologies**

**ETL vs ELT**

• Extract Transform Load (ETL)
Used in On premise Bl / data warehouse Solution
• Extract Load Transform (ELT)
Used In Cloud Technologies. Data lakes


![image.png](/.attachments/image-d6959c5c-105b-4038-8928-e08631e76dda.png)

![image.png](/.attachments/image-a3d91728-2c51-4d15-a628-c4e237f8d040.png)




# **Staging VS ODS**

**Staging**
	- A landing zone, is an intermediate storage area used for data
processing during the extract, transform and load (ETL) process.
	The data staging area sits between the data source(s) and the data
	target(s), which are often data warehouses, data marts, or other
	data repositories.
	
	
**ODS — Operational Data Store**
• An operational data store (ODS) is a central Database that provides a snapshot of the latest data from multiple transactional systems for operational reporting.
• It is used for operational reporting and as a source of data for
the Enterprise Data Warehouse (EDW)
• It is a complementary element to an EDW in a decision support
landscape
• An ODS contains up-to-date information integrated from operational sources, and supports business intelligence (Bl) tools that aid in tactical decision-making

![image.png](/.attachments/image-d9cefaed-d829-495e-b9d4-88f6f027e139.png)


**OLTP** : Online transaction processing (OLTP) captures, stores, and
processes data from transactions in real time.

**OLAP** : Online analytical processing (OLAP) uses complex queries to analyze aggregated historical data from OLTP systems.


![image.png](/.attachments/image-6c187dde-8634-4f67-af0f-5364e38f5709.png)


![image.png](/.attachments/image-6892f323-cb56-43cb-9856-e77055e6c1f8.png)

**Fact vs Dimension**

**Fact :** What you want to analyze
Fact table Contains Measures along with Foreign Key reference of
Dimension Tables.
Usually Transaction tables from OLTP System

**Dimensions :** By Which you want to analyze
A dimension is a Business entity and have it's own attributes and this table is related to fact.Usually Reference/Lookup tables in OLTP System




**Star SChema vs Snow Flake Schema**

![image](https://user-images.githubusercontent.com/24469318/205491340-9cceb365-f79d-49d6-8acb-69ae53791399.png)

**Star**
![image](https://user-images.githubusercontent.com/24469318/205491354-f7cb705f-5483-4f09-a4dc-cda37e171bc8.png)


![image](https://user-images.githubusercontent.com/24469318/205620085-d8645904-9740-4748-a45d-e5fd628af66a.png)

For examples: 
**100 product * 1000 customers * 3 promotions * 10 locations * 1080 dates**

These possible of combinations are pre-aggregated and can be stored in cube format.

Inorder for cube work properly you need to have proper Star-Schema.

**SnowFlake**

Fact table is indirectly connected to a dimension table.

For eg. DIM brand is connected through is DIM Product.
There are some design requirements where you have brand description is more on DIM_Brand and have lot of products on DIM_Products.

Like 10K products and brands is 3-4 only the keeps on repeating so inorder to avoid such a thing we can go for Snowflake schema.

![image](https://user-images.githubusercontent.com/24469318/205491546-88d93cc1-293d-4a59-81ad-7f99c8c8b7c9.png)

**Types of Dimensions**

	- Confirmed Dimension
	- Role-playing Dimension
	- Junk Dimension
	- Degenerate Dimension
	- Slowly Changing Dimension
+ Surrogate Key
+ Granularity ( Least level you need to maintain data transaction on )
+ Cardinality (eg. 100 product * 1000 customers * 3 promotions * 10 locations * 1080 dates)


** Business Scenario : Adventure Works **


![image](https://user-images.githubusercontent.com/24469318/205622742-a248e609-deff-4d50-8c4c-d25199135a75.png)



• Multinational manufacturing company
• Territory
	- 3 Group 6 Region 10 Territory
• Product
	- 4 Category 30+ Sub Category 500+ Products
• Customers
	- 15k+
• Department
	- Purchase and Production
	- Human Resource
	- Sales


