# Student_Management

** Student Management System using Spring Boot, Spring Data JPA, and MySQL**
✨ Project Overview
This project is a simple REST API that lets you manage student records (add, view, update, delete) stored in a MySQL database.
It teaches you the basics of:

Building REST APIs with Spring Boot

Working with databases using Spring Data JPA

Connecting Spring Boot with MySQL

🚀 Features
Add a new student
View all students
View a single student by ID
Update student details
Delete a student from the database

All operations are done through HTTP requests (using Postman).

🏛️ Technologies Used
Spring Boot (Java Framework)
Spring Web (for creating REST APIs)
Spring Data JPA (for database operations)
MySQL Database
Postman (for testing API)

🛠️ How it Works
1. Student Entity
A Student class marked with @Entity is mapped to a database table.
Fields: id, name, email.

2. Student Repository
StudentRepository extends JpaRepository<Student, Long>.
It automatically provides methods like save(), findById(), findAll(), deleteById().

3. Student Service
A service layer where the business logic is written.
Calls methods from the repository.

4. Student Controller
A REST Controller with API endpoints:

![Screenshot 2025-04-26 134454](https://github.com/user-attachments/assets/ffa5f125-3d25-431d-8614-4c6cf9fdb15b)

GET /students → Get all students
![Screenshot 2025-04-26 134621](https://github.com/user-attachments/assets/4738531b-c4b7-426c-b0b6-84d6e9023462)


GET /students/{id} → Get student by ID
![Screenshot 2025-04-26 134643](https://github.com/user-attachments/assets/0dc8fad0-b8c2-4080-935e-e496e10ab56f)


POST /students → Add a new student
![Screenshot 2025-04-26 134552](https://github.com/user-attachments/assets/974e24ed-a52b-4eb1-9645-e01972305be0)


PUT /students/{id} → Update existing student
![Screenshot 2025-04-26 134735](https://github.com/user-attachments/assets/ec6fc83d-f8bf-47e9-b4f1-deb9cf5e6195)


DELETE /students/{id} → Delete a student

![Screenshot 2025-04-26 134759](https://github.com/user-attachments/assets/97c970ad-435d-4b68-9a4e-4f9d1503c48b)

after upadting

![Screenshot 2025-04-26 134824](https://github.com/user-attachments/assets/8f69494a-ba8f-4857-9296-9376007cbf27)


