package com.polymorphism;
class ParentFinal{ //final classes cant extend
	int age = 77; //final variable we cant change it
	public void getAge(int age) {
		this.age = ++age;
		System.out.println("my parent age is "+age);
	}
}
public class ThisFinal extends ParentFinal{
	@Override
	public void getAge(int age) {
		this.age = --age;
		System.out.println("my age is : "+this.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisFinal tf=new ThisFinal();
		tf.getAge(24);

	}

}
