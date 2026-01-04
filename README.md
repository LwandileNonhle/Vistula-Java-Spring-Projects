**Spring Framework Projects - Java & Spring Boot**

**Project Overview**
This repository contains two Java applications built using the Spring Framework as part of the Vistula University curriculum.

Task 1 – Basic Spring Boot application with controller and view
Task 2 – REST API application with CRUD operations, Swagger, exception handling, and database support

**Technologies Used**:

* Java 
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Swagger / OpenAPI
* Maven


Task 1 – Spring Boot MVC Application
Description

Task 1 is a simple Spring Boot application that demonstrates:

* creating a Spring project from scratch,
* using a controller
* handling HTTP GET requests
* returning text and HTML views.

**How It Works**

* The application runs on localhost:8080
* A controller handles browser requests
* One endpoint returns a simple text response
* Another endpoint returns an HTML page using Thymeleaf

**How to Run**

Open the project in IntelliJ
Run the main Spring Boot class
Open your browser and go to:
 http://localhost:8080

**Screenshots – Task 1**

Application started successfully (console output): ![Task 1 Console](screenshots/task1-console.png)

GET request result in browser:

HTML / Thymeleaf view rendered: ![Task 1 HTML View](screenshots/task1-html-view.png)


TASK 2 – REST API Application
Description

Task 2 is a REST API backend application that manages products.
It supports full CRUD operations and follows a layered architecture.

Application Startup

Spring Boot application running successfully:



API Documentation (Swagger)

Swagger UI is used to document and test the REST API.

Swagger UI:

http://localhost:8080/swagger-ui/index.html

Swagger UI showing available endpoints:



REST API Endpoints
Create Product (POST)

Endpoint:

POST /api/v1/products

Example Request Body:

{
"name": "Laptop"
}

Result: Product is created with status 201 Created

Screenshot – Create Product: ![Create Product](screenshots/post-create-product.png)




Get Product by ID (GET)

Endpoint:

GET /api/v1/products/{id}

Result: Returns product with status 200 OK

Screenshot – Get Product by ID: ![Get Product by ID](screenshots/get-product-by-id.png)




Get All Products (GET)

Endpoint:

GET /api/v1/products

Result: Returns list of all products

Screenshot – Get All Products: ![Get All Products](screenshots/get-all-products.png)




Update Product (PUT)

Endpoint:

PUT /api/v1/products/{id}

Example Request Body:

{
"name": "Updated Laptop"
}

Result: Product is updated successfully

Screenshot – Update Product: ![Update Product](screenshots/put-update-product.png)




Delete Product (DELETE)

Endpoint:

DELETE /api/v1/products/{id}

Result: Product is deleted with status 204 No Content

Screenshot – Delete Product: ![Delete Product](screenshots/delete-product.png)




Database (H2)

The application uses an H2 in-memory database.

H2 Console:
http://localhost:8080/console

JDBC URL:

jdbc:h2:mem:testdb

H2 Console Login Screen:![H2 Console Login](screenshots/h2-console-login.png)




Product Table with Data: ![H2 Database Table](screenshots/h2-database-table.png)




**Exception Handling**

The application includes custom exception handling for cases where a product is not found.

Example:

GET /api/v1/products/999

Result: Returns 404 Not Found with error message

Screenshot – Product Not Found: ![Product Not Found](screenshots/product-not-found.png)




**Project Structure**

The project follows a layered architecture:

Controller – handles HTTP requests

Service – business logic

Repository – database access

Domain – entity classes

Support – mappers and exception handling
