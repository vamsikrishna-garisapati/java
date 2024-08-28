package com.polymorphism;

public class ShapeArea {
public double area(double side) {
	return side*side;
}
public double area(double length,double width) {
	return length*width;
}
public double area(double radius,boolean isCircle) {
	return Math.PI*(radius*radius);
}
public static void main(String[] args) {
	ShapeArea sa=new ShapeArea();
	System.out.println(sa.area(35));
	System.out.println(sa.area(35,true));
	
}
}
