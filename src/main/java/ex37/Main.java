/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex37;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[] specChar = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
        int specLen = specChar.length;
        System.out.print("What's the minimum length?");
        int min = input.nextInt();
        System.out.print("How many special characters?");
        int specCount = input.nextInt();
        System.out.print("How many numbers? ");
        int count = input.nextInt();
        List<String> thePassword = new ArrayList<>();
        for (int i = 0; i < min; i++) {
            if (count != 0 && i % 3 == 1) {
                int newNum = rand.nextInt(10);
                String theNum = String.valueOf(newNum);
                thePassword.add(theNum);
                count--;
            } else if (specCount != 0 && i % 3 == 0) {
                int newSpec = rand.nextInt(specLen);
                String theSpec = specChar[newSpec];
                thePassword.add(theSpec);
                specCount--;
            } else {
                int newLetter = rand.nextInt(26);
                char c = (char) (newLetter + 'a');
                String theLetter = ("" + c);
                thePassword.add(theLetter);
            }
        }
        System.out.print("Your password is ");
        String array[] = new String[min];
        for(int j =0;j<min;j++)
        {
            array[j] = thePassword.get(j);
            System.out.print(array[j]);
        }
    }
}

