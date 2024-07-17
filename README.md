# BDD Framework with Rest Assured, Cucumber, and Extent Reports

## Overview

This project showcases a Behavior-Driven Development (BDD) approach using Rest Assured with Java, integrating Extent Reports for comprehensive test reporting.

## Key Features

- **Cucumber:** Employs Gherkin syntax for feature file creation, promoting readability and collaboration.
- **Rest Assured:** Facilitates efficient API testing through a fluent interface for RESTful APIs.
- **Java:** Utilizes Java for implementing step definitions and test logic.
- **Maven:** Manages dependencies and automates build processes.
- **Extent Reports:** Generates detailed HTML-based reports for transparent test execution results, with support for JSON and PDF formats.

## Prerequisites

Ensure the following dependencies are installed:

- Java Development Kit (JDK)
- Maven
- Rest Assured
- Cucumber

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/ratnakarDubey203/FanCodeAPI.git
   cd FanCodeAPI
   ```

2. **Install dependencies:**
   ```bash
   mvn clean install
   ```

3. **Run tests:**
   ```bash
   mvn test
   ```

## Project Structure

- **Reports:** Reports are generated in this directory.
- **src/main/java:** Contains main application code, including API resources and utility classes.
  - **API:** Houses API resources and endpoints.
  - **Methods:** Implements methods for API response handling and validation.
  - **Utilities:** Includes utility classes for setting up Rest Assured and other configurations.
- **src/main/resources:** Contains configuration files and support resources.
  - **Support Files:** Includes additional support files like extent.xml.
- **src/test/java:** Contains test automation code.
  - **StepDefinitions:** Defines step implementations for Cucumber scenarios.
  - **Runners:** Executes Cucumber tests through test runners.
- **src/test:** Includes configuration files and feature files.
- **src/test/resources:** Stores feature files written in Gherkin syntax for defining test scenarios.
- **pom.xml:** Maven build configuration file for managing dependencies and build settings.

## Using Extent Reports

- Extent Reports are seamlessly integrated into the framework, providing detailed HTML reports.
- Reports are automatically generated after each test run and accessible in the `target` directory.

## Writing Tests

1. **Create feature files:** Develop .feature files under src/test/resources using Gherkin syntax to define test scenarios.

2. **Implement step definitions:** Map Gherkin steps to Java methods within StepDefinitions classes, utilizing Rest Assured for API testing.

3. **Execute tests:** Run tests using Maven or your preferred IDE for automated testing processes.

## Viewing Reports

- Post-test execution, navigate to the `Reports` directory.
- For comprehensive insights into test execution results, open the Extent Reports HTML file (FanCodeAPI.html), PDF file (FanCodeAPI.pdf), and JSON file (FanCodeAPI.json) in any web browser.

## Contributing

Contributions are encouraged! Fork the repository and submit pull requests with suggested improvements and features.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- We extend thanks to the [Cucumber](https://cucumber.io/) and [Rest Assured](https://rest-assured.io/) communities for their invaluable tools and support.
- Special appreciation to [Extent Reports](https://extentreports.com/) for their exceptional reporting capabilities.
