package com.arrays_Strings_test;

import java.util.Scanner;

public class CompareToCharSequence15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the character sequence: ");
        String charSequence = sc.nextLine();
        
        int comparisonResult = str.compareTo(charSequence);
        if (comparisonResult == 0) {
            System.out.println("The string is equal to the character sequence.");
        } else if (comparisonResult > 0) {
            System.out.println("The string is greater than the character sequence.");
        } else {
            System.out.println("The string is less than the character sequence.");
        }
    }
}
