/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String heart_rate;
        String age;
        int ready = 1;
        System.out.print("Enter your heart rate: ");
        heart_rate = input.nextLine();
        for (char c : heart_rate.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.println("Please use numbers.");
                ready = 1;
                break;
            }
            ready = 0;
        }
        while(ready == 1) {
            System.out.print("Enter your heart rate: ");
            heart_rate = input.nextLine();
            for (char c : heart_rate.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    System.out.println("Please use numbers.");
                    ready = 1;
                    break;
                }
                ready = 0;
            }
        }
        System.out.print("Enter your age: ");
        age = input.nextLine();
        for (char c : age.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.println("Please use numbers.");
                ready = 1;
                break;
            }
            ready = 0;
        }
        while(ready == 1) {
            System.out.print("Enter your age: ");
            age = input.nextLine();
            for (char c : age.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    System.out.println("Please use numbers.");
                    ready = 1;
                    break;
                }
                ready = 0;
            }
        }
        double theRate = Double.parseDouble(heart_rate);
        double theAge = Double.parseDouble(age);
        double current = .55;
        double bpm;
        System.out.println("Resting pulse: " + heart_rate + "                Age: " + age);
        System.out.println("Intensity     | Rate");
        System.out.println("--------------|-------");
        for(int i = 0; i < 9; i++)
        {
            bpm = (((220 - theAge) - theRate) * current) + theRate;
            double currentCheck = current * 100;
            int currentPrint = (int) currentCheck;
            int bpmCheck = (int) bpm;
            System.out.println(currentPrint + "%           | " + bpmCheck + " bpm");
            current = current + 0.05;
        }
    }
}

