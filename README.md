# Hospital-Management-System
🚀 Features

User Roles

👨‍💼 Admin – Add/Delete Doctors & Patients

👨‍⚕️ Doctor can view and manage all patients

🧑‍🤝‍🧑 Patient – Login & view details

Authentication & Security

Spring Security based Login/Logout

Password encryption

Database (MySQL + JPA)

Doctors & Patients stored in relational database

Admin can manage (Add/Delete) records

UI (Spring MVC + Thymeleaf + Bootstrap)

Simple and responsive interface

Admin Dashboard, Doctor List, Patient List, Login Page

🛠 Tech Stack

Backend: Java, Spring Boot, Spring MVC, Spring Security, Spring Data JPA

Frontend: Thymeleaf, HTML, CSS, Bootstrap

Database: MySQL

Build Tool: Maven 

IDE: IntelliJIdea

📂 Project Structure

com.example.hospital
 ┣ config/              # Security configuration
 ┣ controller/          # MVC Controllers (Admin, Auth)
 ┣ model/               # Entities (Doctor, Patient)
 ┣ repository/          # Spring Data JPA repositories
 ┣ service/             # Business logic
 ┗ resources/
    ┣ static/           # CSS, JS
    ┣ templates/        # Thymeleaf pages (login, dashboard, doctors, patients)
    ┗ application.properties

1. ⚙️ Setup & Installation

Clone the repository

git clone https://github.com/username/hospital-management-system.git
cd hospital-management-system

2. Configure MySQL Database
Create database:

CREATE DATABASE hospital_db;

3. Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect


4. Run the application

mvn spring-boot:run


Access the app
Open browser → http://localhost:8080/login
Admin name= admin
Admin password =admin123
