/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex16;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App mainApp = new App();

        int age = mainApp.getAge();

        String outputString = genOutputString(age);
        System.out.println(outputString);


    }

    public Integer getAge()
    {
        System.out.println("How old are you?");

        // Read and return an integer.
        return in.nextInt();
    }
    public static String genOutputString(int age)
    {
        int legalDrivingAge = 16;
        
        // We have to use a ternary operator, which is: condition ? exprIfTrue : exprIfFalse
       return(age >= legalDrivingAge ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}