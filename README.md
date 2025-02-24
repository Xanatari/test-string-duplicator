# Test String Duplicator Local

A simple Java application that removes duplicate characters from a given string using a functional approach, preserving the order of the first occurrences.

## Overview

This project showcases a functional-style deduplication of characters in a string using Java Streams. The application also presents a menu-based console interface, allowing the user to enter strings repeatedly or exit.

## Features
* Functional deduplication using Java Streams (distinct())
* Preserves order of first occurrences of characters
* Menu-based console for user interaction
* JUnit 5 tests to ensure correctness

## Project Structure

```.
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               ├── Deduplicator.java
    │               ├── FunctionalStringDeduplicator.java
    │               └── App.java
    └── test
        └── java
            └── com
                └── example
                    └── FunctionalStringDeduplicatorTest.java
```

## Key Files:

1. `Deduplicator.java`: An interface specifying the removeDuplicates(String) method.
2. `FunctionalStringDeduplicator.java` : Implementation using Java Streams to remove duplicate characters.
3. `App.java` : Main application with a menu-based console for user interaction.
4. `FunctionalStringDeduplicatorTest.java` : JUnit 5 test class verifying the deduplication logic.
## Requirements
1. ### Java 21 or higher
    Confirm with `java -version`
2. ### Maven 3.8+
    Confirm with `mvn -version`

## Setup and Build
1. Clone or download this repository.
2. Navigate to the project root (where pom.xml is located).
3. Build the project and run tests by executing:
```
   mvn clean package
```

This command will compile the code, execute all tests, and package the application into a JAR file under the target directory.


## Running the Application
After building the project, you can run the application in one of the following ways:

1. Using Java directly:

```
java -cp target/test-string-duplicator-local-1.0-SNAPSHOT.jar com.example.App
```
(Ensure that the JAR file name matches the one generated in your target folder.)

2. Using the Maven Exec Plugin (if configured):

```
mvn compile exec:java -Dexec.mainClass="com.example.App"
```

## Testing
To run the JUnit 5 tests, execute:

```
mvn test
```
The Maven Surefire Plugin will detect and run all tests in the src/test/java directory.

## Usage Example
When you run the application, a menu similar to the following will appear:

```
=== Deduplicator Menu ===
1) Enter a string to remove duplicates
2) Exit
   Choose an option:
   Option 1: Prompts you to enter a string. The application then displays the string with duplicate characters removed (preserving the first occurrences).
   Option 2: Exits the application.
   Sample Session:

```
## Sample Session:
```
=== Deduplicator Menu ===
1) Enter a string to remove duplicates
2) Exit
   Choose an option: 1
   Enter a string: AABBCCD112233
   Output without duplicates: ABCD123

=== Deduplicator Menu ===
1) Enter a string to remove duplicates
2) Exit
   Choose an option: 2
   Exiting the application...

```