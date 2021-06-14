/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numSpace = input.nextLine();
        String temp = "";
        int[] unSort = new int[numSpace.length()];
        int j = 0;
        for (int i = 0; i < numSpace.length(); i++)
        {
            if (numSpace.charAt(i)!=' ')
                temp += numSpace.charAt(i);
            if (numSpace.charAt(i)==' '){
                unSort[j] = Integer.parseInt(temp);

                j++;
                temp = "";
            }
            if(i == numSpace.length() - 1)
            {
                unSort[j] = Integer.parseInt(temp);

                j++;
                temp = "";
            }
        }
        int[] theSort = filterEvenNumbers(unSort);
        System.out.print("The even numbers are ");
        for (int i : theSort) {
            System.out.print(i + "");
        }
    }
    public static int[] filterEvenNumbers(int[] unSort)
    {
        int[] theSort = new int[unSort.length];
        int l = 0;
        for (int i : unSort) {
            if (i % 2 == 0 && i != 0) {
                theSort[l] = i;
                l++;
            }
        }
        int[] theSorted = new int[l];
        System.arraycopy(theSort, 0, theSorted, 0, l);
        return theSorted;
    }
}
