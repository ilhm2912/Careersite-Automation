# Careersite Automation ( Selenium Java )

## Project Description

This project automates the testing of the Careersite using Selenium and Java. It leverages various testing frameworks and tools such as JUnit, Cucumber, and WebDriverManager.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven 3.6.0 or higher
- An IDE such as IntelliJ IDEA or Eclipse

## Initialization

To create the project structure, run the following Maven command:

```
mvn archetype:generate -DgroupId=com.csite -DartifactId=careersite -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Dependencies

Add the following dependencies to your `pom.xml` file:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.28.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.21.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-core -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-core</artifactId>
    <version>7.21.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.21.1</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.9.3</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.junit.platform/junit-platform-suite -->
<dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-suite</artifactId>
    <version>1.12.0-RC2</version>
    <scope>test</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit-platform-engine -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit-platform-engine</artifactId>
    <version>7.21.1</version>
    <scope>test</scope>
</dependency>
```

## Running Tests

### Using Maven

To run the tests using Maven, execute the following command in the terminal:

```
mvn test
```

### Using Cucumber Runner

To run the tests using the Cucumber runner, click the play icon in `TestRunner.java` within your IDE.
