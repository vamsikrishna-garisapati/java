package com.arrays_Strings_test;

import java.util.Scanner;

public class MaxBetweenStrings19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        String maxStr = (str1.compareTo(str2) > 0) ? str1 : str2;
        System.out.println("The maximum string is: " + maxStr);
    }
}
