package com.polymorphism;
class Parents{
	public void property() {
		System.out.println("10k property");
	}
	public void marriage() {
		System.out.println("we are trying todo arng mrg");
	}
}
public class Krishna extends Parents{
	@Override
	public void marriage() {
		System.out.println("no nono i already in luv");
	}
	public static void main(String[] args) {
		Krishna k =new Krishna();
		k.marriage();
	}
}
