package com.inheritance;
class Parent{
	int v=3;
}
public class ChildEx extends Parent{
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("value"+p.v);
	}
}
