/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double theBalance = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double theAPR = input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double theMonthlyPay = input.nextDouble();
        PaymentCalculator calculateMonthsUntilPaidOff = new PaymentCalculator();
        calculateMonthsUntilPaidOff.calculateMonthsUntilPaidOff(theBalance, theAPR,theMonthlyPay);
    }

    public static class PaymentCalculator {
        public void calculateMonthsUntilPaidOff(double balance, double APR, double monthlyPay) {
            double i = APR/(365*100);
            double temp = balance/monthlyPay;
            double temp1 = Math.pow((1+i),30);
            double temp2 = Math.log(1+i);
            double temp3 = Math.log(1 + temp *(1 - temp1));
            int n = (int)Math.ceil((-1 * temp3) / (temp2*30));

            System.out.println("It will take you " + n + " months to pay off this card.");
        }

    }
}
