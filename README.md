# Testing Automation Web Dx hotels

This project is a technical challenge with serenity BDD screenplay

Scenarios


Login with incorrect captcha code

![image](https://github.com/user-attachments/assets/2cf09eb9-d32e-4101-81ac-bd3e664a42ee)

Login successful:

# IMPORTANT

# technical limitations:

When implementing automated login tests, I encountered a limitation related to the presence of a CAPTCHA on the authentication screen. CAPTCHAs are specifically designed to prevent automated scripts from interacting with them, as their main purpose is to differentiate between human users and bots.

Since the CAPTCHA used in this authentication flow generates a dynamic and unique image with each login attempt, it is not possible to reliably automate the resolution of this challenge without introducing additional tools or methods that may compromise the security of the system, such as the use of External. Services to solve CAPTCHA.

For this reason, I decided not to include this step in the automated tests and focused on the other aspects of the authentication process. For a future implementation, a possible alternative would be to request a test environment that allows you to temporarily disable the CAPTCHA or use an alternative authentication method that does not involve this type of verification.


# Observations about hotel reservation:

While implementing the automated tests for the hotel booking scenario, I successfully advanced to the penultimate step, which was to select the cheapest hotel available. However, upon completing this step, no reservation confirmation message was displayed in the user flow. The full booking action, including message confirmation, may only be available once the user has successfully logged in.

Since the authentication flow includes a CAPTCHA, it was not possible to automate the entire login process, which prevented us from continuing with the reservation and validating the reservation confirmation message. This CAPTCHA is a security measure designed to prevent automated interaction with the system, limiting the ability to perform E2E testing in its entirety without additional interventions.


How was it addressed?

First I did exploratory tests to get to know the platform and then I thought about the logic of how I could automate the scenario where the user writes an incorrect captcha code, I first thought about how to write the feature well and then see what locators I needed and then write the tasks


defects found:

Error messages do not appear

![image](https://github.com/user-attachments/assets/ce7cbd0b-217e-4227-93f2-8354fbb03b46)

You can log in to Gmail that had never been created on the page

Before logging in
![image](https://github.com/user-attachments/assets/8bae75b0-c553-4df9-9049-68dca6fe66ef)

After logging in

![image](https://github.com/user-attachments/assets/7693d2e4-3412-4c98-a1c8-d98e5065b946)



Scenario: book a hotel


Step 1: Search Hotel

![image](https://github.com/user-attachments/assets/955be1c9-f121-4914-ac21-f8b1dc73dbd2)


Step 3: filter the hotel by at least 3 stars and a value greater than 200 dollars

![image](https://github.com/user-attachments/assets/314be3dd-6b2a-4477-80f2-ea1a5898a9a2)

Steo 4: select the cheapest hotel


![image](https://github.com/user-attachments/assets/89498aa6-f4e5-45c0-937b-9cdc73dfb986)



## Tabla de Contenidos
- [Introduction](#Introduction)
- [Prerequisites to install the project](#Prerequisites-to-install-the-project)
- [How to run the tests locally](#How-to-run-the-tests-locally)


# Introduction

This project is about a hotel booking website called DX HOTELS, the serenity bdd testing framework was used with the screenplay design pattern, cucumber to document our tests applying BDD and gradle for our dependency manager

The url of the project that was automated was the following:


## URL:
https://demos.devexpress.com/rwa/dxhotels/Default.aspx

## Prerequisites to install the project


The project is developed in Java with Gradle so it will install the following software:


## JDK 17, download link:


https://download.oracle.com/java/17/archive/jdk-17_windows-x64_bin.zip

## Gradle:, download link:

https://gradle.org/


## Your favorite IDE, including :
Intellij IDEA: To run features or scenarios tests it will configure:


## How to run the tests locally?

To run the tests, enter your preferred ide, I highly recommend IntelliJ IDEA, go to your terminal and enter the following command:

./gradlew clean test





