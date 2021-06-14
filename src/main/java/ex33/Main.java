/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex33;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("What's your question?");
        String question = input.nextLine();
        int ans = rand.nextInt(4);
        if(ans == 0)
        {
            System.out.println("Yes");
        }
        else if(ans == 1)
        {
            System.out.println("No");
        }
        else if(ans == 2)
        {
            System.out.println("Maybe");
        }
        else
        {
            System.out.println("Ask again later.");
        }
    }
}

