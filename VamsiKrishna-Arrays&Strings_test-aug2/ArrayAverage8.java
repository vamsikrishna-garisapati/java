package com.arrays_Strings_test;

import java.util.Scanner;

public class ArrayAverage8 {
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
            sum += i;
        }
        
        double average = (double) sum / size;
        System.out.println("Average value of array elements: " + average);
    }
}
