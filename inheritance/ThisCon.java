package com.inheritance;
class SuperCon{
	int a=23;
	public SuperCon() {
		this(67);
		System.out.println("i am default of parent constructor"+a);
	}
	public SuperCon(int age) {
		System.out.println("i am param of parent constructor"+age);
	}
}
public class ThisCon extends SuperCon{
	int a=30;
	public ThisCon(){
		this(12);
		System.out.println("i am default constructor");
	}
	public ThisCon(int age) {
		this.ml();
		System.out.println("i am param constructor"+age);
	}
	public void ml() {
		System.out.println("i am ml method"+a);
	}
	public static void main(String[] args) {
		new ThisCon();
	}
}
