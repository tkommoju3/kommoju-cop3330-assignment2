/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex35;


import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String guess = input.nextLine();
        int i = 1;
        String array[] = new String[100000];
        array[0] = guess;
        while (!guess.equals("")) {
            System.out.print("Enter a name: ");
            guess = input.nextLine();
            array[i] = guess;
            i++;
        }
        Random rand = new Random();
        int ans = rand.nextInt(i);

            System.out.println("The winner is... " + array[ans] + ".");

    }
}

