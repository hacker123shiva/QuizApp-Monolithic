# Quiz Application

## Overview

This project is a Spring Boot application designed to manage quizzes, allowing users to submit answers and retrieve quiz questions.

## Prerequisites

- **Java 17** (or compatible)
- **Maven**
- **MySQL/PostgreSQL** (for the database)

## Setup Instructions

### Step 1: Create the Database

1. Open your MySQL shell or MySQL Workbench.
2. Execute the following SQL command to create a new database:
   ```sql
   CREATE DATABASE questiondb;
   ```

### Step 2: Configure Spring Boot Application

1. Clone the repository or download the project files.
2. Open `application.properties` (or `application.yml`) in your Spring Boot project.
3. Configure your MySQL connection settings:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/questiondb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

### Step 3: Run the Spring Boot Application

1. Navigate to the project directory in your terminal.
2. Use the following command to run the application:
   ```bash
   mvn spring-boot:run
   ```
3. Once the application starts, it will be accessible at `http://localhost:8080`.

### Step 4: Insert Initial Data

1. Create a file named `Question.sql` in the project directory with your question data in SQL format.
2. Open your MySQL shell.
3. Use the following command to select the database:
   ```sql
   USE questiondb;
   ```
4. Copy the SQL queries from `Question.sql` and paste them into the MySQL shell to insert the data into the `question` table.

### Step 5: Work with Postman

After setting up the database and running the application, you can test the endpoints using Postman.

1. Import the Postman collection from the following link:
   [Postman Collection]()
2. You can use the collection to test various endpoints such as:
   - Submit Quiz Answers
   - Retrieve Quiz Questions

## API Endpoints

- `GET /question/allQuestions`: Get all questions.
- `GET /quiz/get/{id}`: Get quiz by ID.
- `POST /quiz/submit/{quizId}`: Submit quiz answers.
- `GET /question/category/{category}`: Get questions by category.
- `POST /question/add`: Add a new question.
- `POST /quiz/create?category={category}&numQ={numQ}&title={title}`: Create a new quiz.
