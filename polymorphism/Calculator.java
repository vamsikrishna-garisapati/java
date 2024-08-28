package com.polymorphism;

public class Calculator {
	public void addition(int a ,int b) {
		System.out.println("addition of two int values"+(a+b));
	}
	public void addition(int a,int b,int c) {
		System.out.println("addition of three"+(a+b+c));
	}
	public void addition(int a,float b) {
		System.out.println("addition of int float values"+(a+b));
	}
	public void addition(double a,double b) {
		System.out.println("addition of doubles"+(a+b));
	}
	public static void main(String[] args) {
		Calculator ct=new Calculator();
		ct.addition(2, 3);
		ct.addition(23.56, 45.67);
		ct.addition(45,67f);
	}

}
