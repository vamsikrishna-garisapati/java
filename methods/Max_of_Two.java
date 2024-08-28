package com.methods;

import java.util.Scanner;

public class Max_of_Two {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(max_num(a,b)+" is max number");
		sc.close();
	}

	private static int max_num(int a, int b) {
		
		return (a>b?a:b);
	}
}
