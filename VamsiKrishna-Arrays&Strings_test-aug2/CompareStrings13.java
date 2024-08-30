package com.arrays_Strings_test;

import java.util.Scanner;

public class CompareStrings13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        boolean isEqual = str1.equals(str2);
        System.out.println("string1 == striing2: " + isEqual);
    }
}
