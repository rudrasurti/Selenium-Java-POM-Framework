# Selenium Framework

TMB Selenium Framework 2 is a project designed and developed using Selenium with Java, Docker, Git, and Jenkins. It aims to provide a robust framework for web automation testing. Here are some key features and components of the framework:

## Selenium - Java, Git and Jenkins

The framework is built using Selenium with Java and incorporates Docker, Git, and Jenkins for seamless integration and efficient test execution.

## ExtentReports V5

The framework utilizes ExtentReports V5 for generating comprehensive test reports. The reports include various filters such as Author, Browser, and Test Type for easy analysis and customization. Screenshots are also attached in the ExtentReport in Base64 format.

## Customization Options

Users have the flexibility to customize the framework according to their requirements. Various options for customization are available, allowing users to tailor the framework to suit their specific needs.

## Email Notifications

The framework supports sending email notifications using the Java Mail API. Users can configure the email settings and recipients to receive test execution summaries and attachments.

## Other Implementations

The framework includes several additional implementations to enhance functionality and usability:

1. Custom Enums, Exceptions, and Annotations.
2. Data-driven testing using .xlsx files, with values read using a Data Supplier.
3. Icons added in ExtentReport for visual representation of test status, browser, and operating system.
4. Automatic zipping of ExtentReports directory for easy sharing.
5. Automatic opening of the report after test execution.

## How to Run the Project

To run the project on your local machine, follow these steps:

1. Clone the project and import it into your preferred IDE (Eclipse/IntelliJ).
2. Configure the `config.properties` file located in `src/test/resources/config`.
3. Run the project as a Maven test, which will initiate parallel browser testing.

Please note that the `config.properties` file contains the necessary configuration settings for the project.

This framework aims to provide a comprehensive and customizable solution for web automation testing using Selenium with Java, Docker, Git, and Jenkins.