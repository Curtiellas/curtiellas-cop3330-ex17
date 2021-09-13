package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner((System.in));

        //Display whether it’s legal to drive
        //by comparing the blood alcohol content to 0.08
        final double threshold = 0.08f;
        double ratio;
        double gender;
        double intake;
        double weight;
        double hours;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        gender = numericCheck();
        //gender = sc.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        intake = numericCheck();
        //intake = sc.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        weight = numericCheck();
        //weight = sc.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        hours = numericCheck();
        //hours = sc.nextDouble();

        //men
        if (gender == 1)
            ratio = 0.73;

        //women
        else
            ratio = 0.66;

        //calculate
        double BAC = (intake * 5.14 / weight * ratio) - .015 * hours;

        //output
        System.out.printf("Your BAC is %.6f\n", BAC);

        //compare to threshold
        if (BAC < threshold)
            System.out.println("It is legal for you to drive");

        else
            System.out.println("It is not legal for you to drive");
    }

    public static double numericCheck ()
    {
        Scanner sc = new Scanner((System.in));
        double theNumber;

        while (true)
        {
            try {
                theNumber = Double.parseDouble(sc.next());
                return theNumber;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Try again. ");
            }
        }
    }
}
