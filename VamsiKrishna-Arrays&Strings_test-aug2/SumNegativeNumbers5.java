package com.arrays_Strings_test;

import java.util.Scanner;

public class SumNegativeNumbers5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                sum += i;
            }
        }
        
        System.out.println("Sum of negative numbers: " + sum);
    }
}
