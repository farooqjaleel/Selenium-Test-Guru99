
# Selenium Test Guru99

This repository contains test scripts for automating the telecom application available at the [Guru99 Telecom](https://demo.guru99.com/telecom/index.html) website using Selenium.

## Project Description

The primary goal of this project is to demonstrate how Selenium can be used to perform automated testing on a web application. The test scripts interact with the Guru99 Telecom website to verify functionalities such as user registration, plan subscription, and more.

## Features

- Automated testing for the Guru99 Telecom website
- Test cases for:
  - User registration
  - Plan subscription
  - Error handling and validation

## Tools & Technologies Used

- Selenium WebDriver
- Java
- TestNG (if applicable)
- Maven (if applicable)

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/farooqjaleel/Selenium-Test-Guru99.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Selenium-Test-Guru99
   ```

3. If using Maven, install dependencies:
   ```bash
   mvn install
   ```

4. If you are using an IDE (such as IntelliJ IDEA, Eclipse), follow these steps:
   - Open the IDE.
   - Select "Open Project" and choose the project directory.
   - Allow the IDE to index the project.

5. Run the tests using your preferred IDE or the following command:
   ```bash
   mvn test
   ```

   Alternatively, you can run individual test scripts from the IDE's interface by right-clicking the desired test and selecting "Run."

## How to Run

1. Once the project is set up, open your IDE.
2. To run all the tests:
   - In Maven-based projects, run:
     ```bash
     mvn test
     ```
   - In other environments, click on the "Run" button for the test suite.

3. You can also run individual test cases by selecting the desired test case file and executing it.

## Expected Results

- The test cases will open the Guru99 Telecom website.
- The tests will simulate user actions such as registration, plan selection, and submission.
- Test results will be shown in the console or test report (if applicable).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## ID

Repository ID: `Selenium-Test-Guru99`
