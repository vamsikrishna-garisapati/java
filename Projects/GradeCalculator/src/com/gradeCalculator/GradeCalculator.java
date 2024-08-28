package com.gradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Age : ");
		int age=sc.nextInt();
		double[] grades = new double[3];
		System.out.println("Enter marks for Maths :");
		grades[0] = sc.nextDouble();
		System.out.println("Enter marks for Science : ");
		grades[1]=sc.nextDouble();
		System.out.println("Enter marks for English : ");
		grades[2]=sc.nextDouble();
		double average = (grades[0] + grades[1] + grades[2])/3;
		String classification = "";
		if (average>=80)
			classification = "First class";
		else if (average<80 && average>=60)
			classification = "Second Class";
		else if(average>=40 && average<60)
			classification = "Third Class";
		else
			classification = "Fail";
		System.out.println("Student Name :"+name);
		System.out.println("Student Age :"+age);
		System.out.println("Maths: " + grades[0]);
        System.out.println("Science: " + grades[1]);
        System.out.println("English: " + grades[2]);
        System.out.println("Average: " + average);
        System.out.println("Classification: " + classification);
		sc.close();
	}
}
