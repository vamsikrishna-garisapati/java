package com.inheritance;
class SuperDemo {
	int salary=5000;
	public void getSalary(int salary) {
		salary=5000;
		System.out.println("my parent salary"+salary);
	}
}
public class ThisDemo1 extends SuperDemo{
	int salary=4000;
	public void getSalary(int salary) {
		salary=3000;
		System.out.println("my salay is"+salary);
		System.out.println("my global salary"+this.salary);
		System.out.println("object is:"+this);
		super.getSalary(7000);
		System.out.println("my parent global salary is"+super.salary);
}
public static void main(String[] args) {
	ThisDemo1 td=new ThisDemo1();
	td.getSalary(2000);
}
}
