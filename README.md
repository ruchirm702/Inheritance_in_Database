# Inheritance Strategies in Database with WWE Players

This project demonstrates different inheritance strategies in Java using MySQL with WWE (World Wrestling Entertainment) players as entities. Each inheritance strategy is implemented using Hibernate and JPA.

## Project Structure

The project is organized into packages representing different inheritance strategies:
- **Mapped Superclass**: Defines common attributes in a superclass without a corresponding table.
- **Joined Table**: Maps subclasses to separate tables and uses JOINs to retrieve data.
- **Single Table Inheritance (STI)**: Stores all subclasses in a single table with a discriminator column.
- **Table per Class**: Maps each subclass to its own table without a common superclass table.

## WWE Players Used

The following WWE players are used as entities to demonstrate the inheritance strategies:
- John Cena
- Undertaker
- Triple H
- Kane
- Goldberg
- Brock Lesnar

## Setup

### Prerequisites
- Java JDK
- MySQL Server
- Maven

### Configuration
1. **Configure MySQL database settings:**
   - Navigate to `src/main/resources/application.properties`.
   - Update the following properties with your MySQL database configuration:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```
   - Save the file.

2. **Build the project using Maven:**
   Open a terminal/command prompt:
   ```bash
   cd /path/to/your/project
   mvn clean install

###Usage
Run the application to see how different inheritance strategies are implemented and interact with the MySQL database.

###Contributions
Contributions are welcome! If you have any ideas for improvements or new features, feel free to fork the repository and submit a pull request.
