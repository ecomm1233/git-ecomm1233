package com.springex;

public class A implements Printable{

	public void print() {
		System.out.println("Hello A");
		
	}
	
	
	/*B b;
	private static final A obj=new A();
	A(){
		System.out.println("A is created");
	}
	
	public A(B b) {
		super();
		System.out.println("A is created");
		this.b = b;
	}

	public static A getA(){
		System.out.println("Factory method");
		return obj;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	void print(){
		System.out.println("Hello A");
	}
	void display(){
		print();
		b.print();
	}*/
}
