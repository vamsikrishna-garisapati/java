package com.inheritance;
class Vehicle{
	String model;
	int year;
	public Vehicle(String model, int year) {
		// TODO Auto-generated constructor stub
		this.model=model;
		this.year=year;
		
	}
	public void displayInfo() {
		System.out.println("model"+model);
		System.out.println("year"+year);
	}
	
}
class Car extends Vehicle{
	int cardoors;
	
	public Car(String model,int year,int cardoors) {
		super(model,year);
		this.cardoors = cardoors;
	}

	public void displayInfo(){
		super.displayInfo();
		System.out.println("cardoors"+cardoors);
	}
}
class Truck extends Vehicle{
	int payloadcapcity;

	public Truck(String model,int year,int payloadcapcity) {
		super(model,year);
		this.payloadcapcity = payloadcapcity;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("payloadcapacity"+payloadcapcity);
	}
	
}
public class vehicledetails {
	public static void main(String[] args) {
		Truck t=new Truck("swaraj",2020,1000);
		t.displayInfo();
	}
}
