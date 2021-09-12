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

        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        int gender = sc.nextInt();

        System.out.println("How many ounces of alcohol did you have? ");
        double intake = sc.nextDouble();

        System.out.println("What is your weight, in pounds? ");
        double weight = sc.nextDouble();

        System.out.println("How many hours has it been since your last drink? ");
        int hours = sc.nextInt();

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
}
