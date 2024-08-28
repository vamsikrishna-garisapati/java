package com.methods;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Average is: "+avg(a,b,c));
		sc.close();
	}

	private static int avg(int a, int b, int c) {
		// TODO Auto-generated method stub
		return (a+b+c)/3;
	}

}
