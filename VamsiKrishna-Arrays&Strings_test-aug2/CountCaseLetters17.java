package com.arrays_Strings_test;

import java.util.Scanner;

public class CountCaseLetters17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }
        
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
    }
}
