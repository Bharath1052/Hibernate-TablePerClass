# Hibernate-TablePerClass(Inheritance)

This project demonstrates the use of the Table-Per-Class strategy in Hibernate. This strategy involves creating separate database tables for each class in an inheritance hierarchy. This example covers the basics of setting up and using Hibernate with the Table-Per-Class inheritance mapping.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- Java Development Kit (JDK) 8 or higher
- Maven
- An SQL database (H2, MySQL, PostgreSQL, etc.)

## Project Structure

The project has the following structure:


## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/Hibernate-TablePerClass.git
    cd Hibernate-TablePerClass
    ```

2. **Configure Database:**

    Update the `hibernate.cfg.xml` file in the `src/main/resources/` directory with your database configuration.

    ```xml
    <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_database</property>
    <property name="hibernate.connection.username">your_username</property>
    <property name="hibernate.connection.password">your_password</property>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
    ```

3. **Build the project:**

    ```bash
    mvn clean install
    ```

## Running the Application

To run the application, execute the main method in the `Main` class located in `src/main/java/com/example`.

```java
public class Main {
    public static void main(String[] args) {
         //Your code to initialize Hibernate and perform operations
    }
}
## Usage

This project includes basic CRUD operations using the Table-Per-Class strategy. You can extend the models and repository classes to fit your needs.
