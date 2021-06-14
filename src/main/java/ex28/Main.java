/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex28;

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        Scanner input = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int number;
        while(count <6){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            sum += number;
            count++;
        }
        System.out.println("The total is " + sum);
    }
}

