package com.abstraction;
abstract class TestAbstract{
	public void m1() {
		System.out.println("i am m1 method");
	}
	protected abstract void sleep();
	public TestAbstract() {
		System.out.println("i am abstract class constructor");
	}
}
public class Demo extends TestAbstract {

	@Override
	protected void sleep() {
		// TODO Auto-generated method stub
		System.out.println("i am sleeping");
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		d.sleep();
	}

}
