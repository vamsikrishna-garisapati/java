package com.arrays_Strings_test;

import java.util.Scanner;

public class CopyArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        
        // Copying elements
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }
        
        System.out.println("Elements of the second array:");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
