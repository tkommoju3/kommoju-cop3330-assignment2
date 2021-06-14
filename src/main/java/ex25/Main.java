/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex25;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a new password. ");
        String password = input.nextLine();
        int rating = passwordValidator(password);
        String passRate = "";
        if(rating == 0)
        {
            passRate = ("very weak");
        }
        else if(rating == 1)
        {
            passRate = ("weak");
        }
        else if(rating == 2)
        {
            passRate = ("strong");
        }
        else if(rating == 3)
        {
            passRate = ("very strong");
        }
        System.out.println("The password '" + password + "' is a " + passRate + " password.");
    }

    public static int passwordValidator(String thePassword)
    {
        int rating;
        int charCount = 0;
        int letterCount = 0;
        int numCount = 0;
        int specCount = 0;
        for(int i = 0; i < thePassword.length(); i++)
        {
            char theOne = thePassword.charAt(i);
            if(Character.isAlphabetic(theOne))
            {
                letterCount++;
            }
            else if(Character.isDigit(theOne))
            {
                numCount++;
            }
            else
            {
                specCount++;
            }
            charCount++;
        }
        if(charCount >= 8)
        {
            if (numCount == 0)
            {
             
                rating = 1;
            }
            else if(specCount == 0)
            {
              
                rating = 2;
            }
            else
            {
                
                rating = 3;
            }
        }
        else
        {
            if(letterCount == 0)
            {

                rating = 0;
            }
            else
            {

                rating = 1;
            }
        }
        return rating;
    }
}
