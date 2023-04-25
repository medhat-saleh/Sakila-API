# sakila-API

## Overview
This API provides access to Sakila Sample Database MYSQL, allowing users to use this endpoint to retrive information about films actors and other data stored in the database, this  API is provide the endpoint in tow techenology: Representational State Transfer (REST) and Simple Object Access Protocol (SOAP). It uses JAX-RS and JAX-WS to create the web services, JPA to interact with MySQL database, and Maven to manage the project and Tomcat for deployment.


## Technologies Used

- JAX-RS
- JAX-WS
- JPA
- Maven
- MapStruct
- Tomcat
## Getting Started


### Requirements

- Java 17 [her](https://www.oracle.com/eg/java/technologies/downloads/#java17)
- Maven  [her](https://maven.apache.org/download.cgi)
- Tomcat  [her](https://tomcat.apache.org/download-10.cgi)
- MySQL Server  [her]( https://dev.mysql.com/downloads/installer/)
- Sakila sample Database  [her](https://dev.mysql.com/doc/sakila/en/sakila-installation.html)


### Installation

To get started with this api, you will have to clone this repository onto your local machine:

- You should ensuere you have all the abouve requirements 
- Configure the soapandrestful/src/main/resources/META-INF/persistence.xml file with your DB credentials.
- Configure the tomcat plguin in the soapandrestful/pom.xml file with your tomcat credentials.


### Deployment

To deploy this project run

```bash
  cd soapandrestful
  mvn clean install tomcat7:deploy
```


## Usage

 After Deploying the Sakila API you can access the two methodology endpoint SOAP and REST to perform the CRUD operation on the Sakila Sample  database
 
 To access the SOAP endpoint, you can use any SOAP client, such as SoapUI. The WSDL file for the Sakila API can be found at /ws/resourceName?wsdl.

To access the REST endpoint, you can use any HTTP client, such as Postman. The API supports the following HTTP methods:
- GET for retrieve a resource
- POST for create a new resource
- PUT for update an existing resource
- DELETE  for delete a resource

[REST Document](https://documenter.getpostman.com/view/26745921/2s93Y6rePp)

