/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex32;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ending = ("y");
        while(ending.equals("y")) {
            int ready = 1;
            int count = 0;
            int ans = 0;
            Random rand = new Random();
            System.out.print("Let's play Guess the Number.\n" +
                    "Pick a difficulty level (1, 2, or 3): ");
            int choice = input.nextInt();
            if (choice == 1) {
                ans = rand.nextInt(10);
            } else if (choice == 2) {
                ans = rand.nextInt(100);
            } else if (choice == 3) {
                ans = rand.nextInt(1000);
            }
            System.out.print("I have my number. What's your guess?");
            String guess = input.nextLine();
            for (char c : guess.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    System.out.println("Please only use numbers.");
                    ready = 1;
                    count++;
                    break;
                }
                ready = 0;
            }
            if (ready != 1) {
                int guessAns = Integer.parseInt(guess);
                if (ans > guessAns) {
                    System.out.println("Too low.");
                    count++;
                } else if (ans < guessAns) {
                    System.out.println("Too high.");
                    count++;
                } else {
                    System.out.println("You got it in " + count + " guesses!");
                }
            }
            while (ready != 2) {
                System.out.print("Guess again: ");
                guess = input.nextLine();
                for (char c : guess.toCharArray()) {
                    if (Character.isAlphabetic(c)) {
                        System.out.println("Please only use numbers.");
                        ready = 1;
                        count++;
                        break;
                    }
                    ready = 0;
                }
                if (ready != 1) {
                    int guessAns = Integer.parseInt(guess);
                    if (ans > guessAns) {
                        System.out.println("Too low.");
                        count++;
                    } else if (ans < guessAns) {
                        System.out.println("Too high.");
                        count++;
                    } else {
                        System.out.println("You got it in " + count + " guesses!");
                        ready = 2;
                    }
                }
            }
            System.out.print("Play again? Yes(y) or No(n)");
            ending = input.nextLine();
        }
        System.out.println("Goodbye!");
    }

}

