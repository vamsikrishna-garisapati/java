package com.methods;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter celsius value: ");
		double celsius=sc.nextDouble();
		double fahrenheit = celsiusToFahrenheit(celsius);
		System.out.println(celsius+"°C is equivalent to "+fahrenheit+"°F"); // Alt + "0176" for °
		sc.close();
	}
	private static double celsiusToFahrenheit(double celsius) {
		return (celsius*9/5)+32;
	}
}
