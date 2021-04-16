# JavaRestfulApi
Spring Boot CRUD Api for employees

This project is based on the spring boot and uses these packages :
- Maven
- Spring Data (Hibernate & MySQL)
- Spring MVC 
- Thymleaf(Front end)

## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

## Database configuration 
Create a MySQL database with the name `emp` and add the credentials to `/resources/application.properties`.  
The default ones are :

- spring.datasource.url=jdbc:mysql://localhost:3306/emp
- spring.datasource.username=root
- spring.datasource.password=nandu
- spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
- spring.jpa.hibernate.ddl-auto = update
- logging.level.org.hibernate.SQL=DEBUG
- logging.level.org.hibernate.type=TRACE
## DDL commands:
- CREATE DATABASE emp;
- use emp;
## Usage 
Run the project through the IDE and head out to [http://localhost:8080](http://localhost:8080)

