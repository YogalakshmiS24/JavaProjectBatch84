package com.javabasic;

public class DAY15 {
	String name;
	int milage;
	static int wheel=4;
	
	public void method(String n,int r) {
		this.name=n;
		this.milage=r;
	}
	public static void main(String[] args) {
		 DAY15 d=new  DAY15();
		 d.method("HONDA", 12);
		 d.method1();
		 DAY15 e=new  DAY15();
		 d.method("swift", 12);
		 d.method1();
		
	}
	public void method1() {
		
		System.out.println("Brand--------"+name);
		System.out.println("Milege--------"+milage);
		System.out.println(wheel);
		
	}

}
