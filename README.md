# Problem 5 - Armstrong Numbers

* Number Five of the six java coding challenges for beginners by Maersk for Sparta Global Academy.

A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check if the given number is Armstrong number or not.

Please write the unit tests for your solution using any of the unit testing framework.

## Instructions to build and run the code

    1. Open the project in Intellij
    2. Navigate to the App.java file in the project explorer
    3. Run the main method

* Note: App.java can be found in Problem5_MaerskJavaTasks\ArmstrongNumbers\src\main\java\com\spartaglobal\em\engineering50\App.java

* In main, the isArmstrongNumber() method accepts an integer as an input and returns True is the integer is an Armstrong number and False otherwise.

## Platform limitations

* No notable limitations for Intellij.

## Dependencies

* JUnit 5.6.0 https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api 

## Assumptions

* Assumed that negative integers are not Armstrong numbers.

## Highlights

* Code Coverage on ArmstrongNumber class: methods: 100% lines: 100%.

* Code Coverage on CubeOfDigits class: methods: 100% lines: 87%.

## Improvements

* getting the cubes of the digits and and getting the sum of these could be separated into two classes to better follow the SOLID principles .



