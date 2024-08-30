package com.arrays_Strings_test;

import java.util.Scanner;

public class MergeArrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.print("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] mergedArray = new int[size1 + size2];
        System.arraycopy(arr1, 0, mergedArray, 0, size1);
        System.arraycopy(arr2, 0, mergedArray, size1, size2);
        
        System.out.println("Merged array:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }
}
