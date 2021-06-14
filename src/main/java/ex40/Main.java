/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Member firstEmployee = new Member("John", "Johnson", "Manager", "2016-12-31");
        Member secEmployee = new Member("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Member thirdEmployee = new Member("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Member fourthEmployee = new Member("Jake", "Jacobson", "Programmer", "");
        Member fifthEmployee = new Member("Jacquelyn", "Jackson", "DBA", "");
        Member sixEmployee = new Member("Sally", "Webber", "Web Developer", "2015-12-18");
        Member[] employee = new Member[6];
        employee[0] = (firstEmployee);
        employee[1] = (secEmployee);
        employee[2] = (thirdEmployee);
        employee[3] = (fourthEmployee);
        employee[4] = (fifthEmployee);
        employee[5] = (sixEmployee);
        System.out.print("Enter a search string: ");
        String search = input.nextLine();
        System.out.println("Results:");
        Member[] searchEmployee = new Member[6];
        int spot = 0;
        for (Member value : employee) {
            int k = 0;
            int l = 0;
            for (int j = 0; j < search.length(); j++) {
                char theWord = search.charAt(j);
                char theFirst = value.firstName.charAt(j);
                char theLast = value.lastName.charAt(j);
                if (theWord == theFirst) {
                    k++;
                }
                if (theWord == theLast) {
                    l++;
                }
            }
            if (k == search.length() || l == search.length()) {
                searchEmployee[spot] = value;
                spot++;
            }
        }
        System.out.println("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");
        for (Member member : searchEmployee) {
            if (member == null) {
                break;
            }
            int hyphenCount = 19;
            int hyphenNo = member.firstName.length() + member.lastName.length();
            System.out.print(member.firstName + " " + member.lastName);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print(" ");
            hyphenCount = 19;
            hyphenNo = member.thePosition.length();
            System.out.print("|" + member.thePosition);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print(" ");
            hyphenCount = 19;
            hyphenNo = member.theDate.length();
            System.out.print("|" + member.theDate);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
