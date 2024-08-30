package com.arrays_Strings_test;

import java.util.Scanner;

public class StringToCharArray18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        char[] charArray = str.toCharArray();
        System.out.println("Character array contents:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
