# Employee CRUD Application with Spring Boot, Thymeleaf, and MySQL

## Overview

This is a simple Employee Data CRUD (Create, Read, Update, Delete) application built using the Spring Boot framework, Thymeleaf templating engine, and MySQL database. The application allows you to manage employee records, performing basic CRUD operations.

## Features

- **Create Employee:** Add new employee records to the system.
- **Read Employee:** View a list of all employees with details.
- **Update Employee:** Modify existing employee information.
- **Delete Employee:** Remove an employee from the database.

## Technologies Used

- **Spring Boot:** A framework for building Java-based enterprise applications.
- **Thymeleaf:** A server-side Java template engine for web and standalone environments.
- **MySQL:** A relational database management system.

## Setup and Installation

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/your-username/employee-crud-app.git
    cd employee-crud-app
    ```

2. **Database Configuration:**

    - Create a MySQL database and configure the connection details in `src/main/resources/application.properties`.

3. **Build and Run:**

    ```bash
    ./mvnw spring-boot:run
    ```

    The application will be accessible at `http://localhost:8080`.

## Project Structure

- `src/main/java/com/example/employee`: Java source code for the application.
- `src/main/resources`: Configuration files and Thymeleaf templates.
- `src/test`: Test cases for the application.

## Screenshots

Include screenshots of your application to showcase its functionality.

## Contributing

Feel free to contribute to the project by opening issues or creating pull requests.

**Note:** Replace `your-username` and `employee-crud-app` with your GitHub username and the actual repository name.
