/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex39;


public class Main {
    public static void main(String[] args) {

        Member temp;
        Member firstEmployee = new Member("John","Johnson","Manager","2016-12-31");
        Member secEmployee = new Member("Tou","Xiong","Software Engineer","2016-10-05");
        Member thirdEmployee = new Member("Michaela","Michaelson","District Manager","2015-12-19");
        Member fourthEmployee = new Member("Jake","Jacobson","Programmer","");
        Member fifthEmployee = new Member("Jacquelyn","Jackson","DBA","");
        Member sixEmployee = new Member("Sally","Webber","Web Developer","2015-12-18");
        Member[] employees = new Member[6];
        employees[0] = (firstEmployee);
        employees[1] = (secEmployee);
        employees[2] = (thirdEmployee);
        employees[3] = (fourthEmployee);
        employees[4] = (fifthEmployee);
        employees[5] = (sixEmployee);
        for (int i = 0; i < employees.length; i++)
        {
            for (int j = i + 1; j < employees.length; j++)
            {
                if (employees[i].lastName.compareTo(employees[j].lastName) > 0)
                {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");
        for (Member theEmployee : employees) {
            int hyphenCount = 19;
            int hyphenNo = theEmployee.firstName.length() + theEmployee.lastName.length();
            System.out.print(theEmployee.firstName + " " + theEmployee.lastName);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print(" ");
            hyphenCount = 19;
            hyphenNo = theEmployee.thePosition.length();
            System.out.print("|" + theEmployee.thePosition);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print(" ");
            hyphenCount = 19;
            hyphenNo = theEmployee.theDate.length();
            System.out.print("|" + theEmployee.theDate);
            for (int j = 0; j < (hyphenCount - hyphenNo); j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
