/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name:");
        String first = input.nextLine();
        System.out.print("Enter the last name:");
        String last = input.nextLine();
        System.out.print("Enter the ZIP code:");
        String ZIP = input.nextLine();
        System.out.print("Enter an employee ID:");
        String ID = input.nextLine();
        int num = validateInput(first, last, ZIP, ID);
        if(num == 1)
        {
            System.out.println("There were no errors found.");
        }
        else
        {
            return;
        }
    }

    public static int validateInput(String fName, String lName, String theZip, String theId) {
        int checkFirst = validateFirst(fName);
        int checkLast = validateLast(lName);
        int checkZip = validateZip(theZip);
        int checkId = validateID(theId);
        if (checkFirst * checkLast * checkZip * checkId != 0) {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int validateFirst(String fName) {
        if (fName.length() == 0) {
            System.out.println("The first name has to be filled in.");
            return 0;
        }
        if (fName.length() == 1) {
            System.out.println('"' + fName + '"' + " is not a valid first name. It is too short.");
            return 0;
        }
        for (int i = 0; i < fName.length(); i++) {
            char one = fName.charAt(i);
            if (!Character.isAlphabetic(one)) {
                System.out.println("The first name cannot have numbers.");
                return 0;
            }
        }
        return 1;
    }

    public static int validateLast(String lName) {
        if (lName.length() == 0) {
            System.out.println("The last name has to be filled in.");
            return 0;
        }
        if (lName.length() == 1) {
            System.out.println('"' + lName + '"' + " is not a valid last name. It is too short.");
            return 0;
        }
        for (int i = 0; i < lName.length(); i++) {
            char one = lName.charAt(i);
            if (!Character.isAlphabetic(one)) {
                System.out.println("The last name cannot have numbers.");
                return 0;
            }
        }
        return 1;
    }

    public static int validateZip(String theZip) {
        for (int i = 0; i < theZip.length(); i++) {
            char one = theZip.charAt(i);
            if (!Character.isDigit(one)) {
                System.out.println("The ZIP code must be numeric.");
                return 0;
            }
        }
        return 1;
    }

    public static int validateID(String theId) {
        for (int i = 0; i < 2; i++) {
            char one = theId.charAt(i);
            if (Character.isAlphabetic(one)) {
                if (Character.isUpperCase(one)) {
                    continue;
                } else {
                    System.out.println(theId + " is not a valid ID.");
                    return 0;
                }
            } else {
                System.out.println(theId + " is not a valid ID.");
                return 0;
            }
        }
        char three = theId.charAt(2);
        if (three != '-') {
            System.out.println(theId + " is not a valid ID.");
            return 0;
        }
        for (int i = 3; i < 7; i++) {
            char one = theId.charAt(i);
            if (Character.isDigit(one)) {
                continue;
            } else {
                System.out.println(theId + " is not a valid ID.");
                return 0;
            }
        }
        return 1;
    }
}





