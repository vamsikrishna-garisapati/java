package com.polymorphism;

public class ProductSearch {
	public void search(int pid) {
		System.out.println("product search by id"+pid);
	}
	public void search(String name) {
		System.out.println("product search by name"+name);
	}
	public void search(int pid,String name) {
		System.out.println("searching prod by "+name+"name & id" +pid);
	}
public static void main(String[] args) {
	ProductSearch pd=new ProductSearch();
	pd.search(96);
}
}
