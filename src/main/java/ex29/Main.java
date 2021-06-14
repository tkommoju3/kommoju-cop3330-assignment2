/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the rate of return? ");
        String returnRate = input.nextLine();
        for (int i = 0; i < returnRate.length(); i++) {
            char value = returnRate.charAt(i);
            if(value == '0' && i == 0)
            {
                System.out.println("Sorry. That's not a valid input.");
                return;
            }
            if (Character.isAlphabetic(value)) {
                System.out.println("Sorry. That's not a valid input.");
                return;
            }
        }
        int rate = Integer.parseInt(returnRate);
        rate = 72/rate;

        System.out.println("It will take " + rate + " years to double your initial investment.");
    }
}
