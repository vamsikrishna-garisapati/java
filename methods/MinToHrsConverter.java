package com.methods;

import java.util.Scanner;

public class MinToHrsConverter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int minutes=sc.nextInt();
		System.out.println(min_to_hour(minutes));
		sc.close();
	}

	private static String min_to_hour(int minutes) {
		// TODO Auto-generated method stub
		int hrs=minutes/60;
		int mins=minutes%60;
		return hrs+" hours and "+mins+" minutes.";
	}
}
