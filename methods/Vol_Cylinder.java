package com.methods;

import java.util.Scanner;

public class Vol_Cylinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius=sc.nextDouble();
		System.out.println("Enter height: ");
		Double height=sc.nextDouble();
		System.out.println("Volume is "+volume(radius,height));
		sc.close();
	}

	private static double volume(double radius, double height) {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2)*height;
	}
}
