package com.arrays_Strings_test;

import java.util.Scanner;

public class CanonicalRepresentation11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String canonicalStr = str.intern();
        System.out.println("Canonical representation: " + canonicalStr);
    }
}
