package com.pack1;

class Parent{
	public void m1() {
		System.out.println("i am from parent");
	}
	
}
public class Employee extends Parent {
	protected void m2() {
		System.out.println("i am from private");
	}
	public static void main(String[] args) {
//		Parent p = new Parent();
		Employee e = new Employee();
		e.m1();
		e.m2(); 
	}
}
