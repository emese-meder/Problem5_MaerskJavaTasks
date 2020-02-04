package com.spartaglobal.em.engineering50;

import java.util.Arrays;

/*
Problem 5: Armstrong number
A number is called an Armstrong number if it is equal to the cube of its every digit.
For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
You need to write a program to check if the given number is Armstrong number or not.
Please write the unit tests for your solution using any of the unit testing framework.
 */
public class App 
{
    public static void main( String[] args ) {
        CubeOfDigits cubeOfDigits = new CubeOfDigits();
        System.out.println(cubeOfDigits.getDigitsCubed(138));
    }
}
