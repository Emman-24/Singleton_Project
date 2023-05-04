# Kotlin Singleton Project: Person Management.

This project demonstrates the use of the Singleton design pattern in Kotlin to manage an in-memory database of Person objects. It uses the k-faker library to generate random person data and stores this data in a globally accessible, unique DatabaseManager object.

# Features

- Random data generation using the k-faker library.
- Storage and retrieval of 'Person' objects in an in-memory database.
- Singleton pattern implementation with the 'DatabaseManager' object.

# Singleton Pattern

The singleton design pattern is used in this project to ensure that there is only a 
single instance of 'DatabaseManager', which acts as a single point of access to the
in-memory database. By using an object in Kotlin , a single instance is automatically
created and it is ensured that no other instance of the 'DatabaseManager' class can 
be created.

# How to Use
1. Make sure you have Kotlin installed on your system.
2. Clone this repository to your local machine.
3. Add the necessary dependencies (in this case, k-faker) to your build.gradle file.
4. Run the main.kt file to generate random person data and perform storage and retrieval operations on the in-memory database.

# Project Structure

- 'main.kt':Contains the main function that generates random person data and stores and
retrieves this data in the in-memory database.
- 'DatabaseManager.kt': Singleton object that provides functions to store and retrieve
'Person' objects in the in-memory database.
- 'Person.kt': Data class that represents a person with name , last name , age , email and
working status.

# Contributions

This project is open source , and contributions are welcome. if you want to add new
features or improve the existing code , feel free to open a Pull Request.
