package com.abstraction;
interface DemoInterf{
	final int age=90;
	public abstract void m1();
	abstract void m2();
	void m3();
}

public class Demo1 implements DemoInterf{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("i am m1 method");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("i am m2 method");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("i am m3 method");
		
	}

}
