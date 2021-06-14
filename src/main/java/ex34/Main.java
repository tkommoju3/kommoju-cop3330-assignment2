/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

package ex34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] employees = {"John Smith","Jackie Jackson","Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
        int len = employees.length;
        System.out.println("There are " + len + " employees:");
        for (String employee : employees) {
            System.out.println(employee);
        }
        System.out.print("Enter an employee name to remove: ");
        String theRemove = input.nextLine();
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i].equals(theRemove))
            {
                employees[i] = null;
                len--;
                break;

            }
        }
        System.out.println("There are " + len + " employees:");
        for (String employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}

