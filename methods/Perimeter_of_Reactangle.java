package com.methods;

import java.util.Scanner;

public class Perimeter_of_Reactangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		int length=sc.nextInt();
		System.out.println("Enter width:");
		int width=sc.nextInt();
		System.out.println("Perimeter of Rectangle is: "+perimeter(length,width));
		sc.close();
	}

	private static int perimeter(int length, int width) {
		// TODO Auto-generated method stub
		return (2*(length+width));
	}
}
