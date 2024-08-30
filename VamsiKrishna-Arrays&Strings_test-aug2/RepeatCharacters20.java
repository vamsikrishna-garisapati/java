package com.arrays_Strings_test;

import java.util.Scanner;

public class RepeatCharacters20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch).append(ch);
        }
        
        System.out.println("New string with repeated characters: " + sb.toString());
    }
}
