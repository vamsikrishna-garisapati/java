package com.methods;

import java.util.Scanner;

public class Area_of_Circle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double area_of_circle = area(radius);
		System.out.println("Area of Circle :"+area_of_circle);
		sc.close();
	}

	private static double area(double radius) {
		
		return (radius*radius);
	}
}
