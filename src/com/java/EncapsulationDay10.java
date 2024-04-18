package com.java;

public class EncapsulationDay10 {
	private int a=14;
	
	private void add() {
		System.out.println("Welcome ");
		
	}
	
	
	public static void main(String[] args) {
		EncapsulationDay10 e =new EncapsulationDay10();
		System.out.println(e.a);
	    e.add();
		
		addtwonum(10, 20);
		
				//---------------------------encap 2
		
		Encapday10 ec = new Encapday10 ();
		ec.name("java");
		System.out.println("Get the name from other class: "+ec.helloname());
		ec.setage(16);
		System.out.println("Get the age from other class: "+ec.getage());
	}
		
	
	
	public static void addtwonum(int num1,int num2) {
		int c =num1+num2;
		System.out.println(c);
	}

}
