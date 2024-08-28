package com.methods;

import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principal amount: ");
		double principal =sc.nextDouble();
		System.out.print("Enter rate: ");
		double rate=sc.nextDouble();
		System.out.print("Enter time: ");
		int time=sc.nextInt();
		double intrst=simpl_intrst(principal,rate,time);
		System.out.println("Simple Interest is: "+intrst);
		sc.close();
	}

	private static double simpl_intrst(double principal, double rate, int time) {
		// TODO Auto-generated method stub
		return (principal*rate*time)/100;
	}
}
