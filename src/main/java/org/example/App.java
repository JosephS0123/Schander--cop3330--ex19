/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;



import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner uInput = new Scanner(System.in);
        System.out.println( "What is your weight in pounds?" );
        float Weight = uInput.nextInt();
        System.out.println("What is your height in inches?");
        float Height = uInput.nextInt();
        float BMI = ((Weight/(Height*Height)) * 703);
        System.out.println("Your BMI is "+BMI);
        if(BMI>=25){
            System.out.println("You are overweight, you should go see your doctor.");
        }
        else if(BMI<=18.5){
            System.out.println("You are underweight, you should go see your doctor.");
        }
        else {
            System.out.println("You are within the ideal weight range.");
        }
    }
}
