package com.arrays_Strings_test;

import java.util.Scanner;

public class UnicodeCodePoints14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the start index: ");
        int startIndex = sc.nextInt();
        
        System.out.print("Enter the end index: ");
        int endIndex = sc.nextInt();
        
        int count = str.codePointCount(startIndex, endIndex);
        System.out.println("Number of Unicode code points in the specified range: " + count);
    }
}
