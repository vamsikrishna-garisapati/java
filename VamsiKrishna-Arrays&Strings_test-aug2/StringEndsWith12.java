package com.arrays_Strings_test;

import java.util.Scanner;

public class StringEndsWith12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();
        
        System.out.print("Enter the substring: ");
        String subStr = sc.nextLine();
        
        boolean endsWith = mainStr.endsWith(subStr);
        System.out.println("Does the main string end with the substring? " + endsWith);
    }
}
