# Testing Automation Web Dx hotels

This project is a technical challenge with serenity BDD screenplay

Scenarios


Login with incorrect captcha code

![image](https://github.com/user-attachments/assets/2cf09eb9-d32e-4101-81ac-bd3e664a42ee)


How was it addressed?

First I did exploratory tests to get to know the platform and then I thought about the logic of how I could automate the scenario where the user writes an incorrect captcha code, I first thought about how to write the feature well and then see what locators I needed and then write the tasks


The other login scenario could not be automated since it has a captcha that cannot be automated


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

Note: I could not validate the successful reservation message, since I could not find it anywhere on the web



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





