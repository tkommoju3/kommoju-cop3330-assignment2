/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tanushka Kommoju
 */
package ex24;

import java.util.Scanner;
public class Anagram
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Strings and I'll tell you if they are anagrams:");
        System.out.print("enter the first string: ");
        String a = input.next();
        System.out.print("enter the second string: ");
        String b = input.next();
        if(isAnagram(a,b))
            System.out.println(a+" and "+b+" are anagrams");
        else
            System.out.println(a +" and "+ b +" are not anagrams");

    }
    public static boolean isAnagram(String s1,String s2){

        if(s1.length()!=s2.length()) return false;
        int [] freq = new int[26];
        for(int i=0 ; i< s1.length(); i++){

            freq[s1.charAt(i)-'a']++;

            freq[s2.charAt(i)-'a']--;
        }
        for(int x : freq){
            if(x!=0) return false;
        }
        return true;
    }
}