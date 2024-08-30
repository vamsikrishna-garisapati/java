package com.arrays_Strings_test;

import java.util.Scanner;

public class SearchElement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
