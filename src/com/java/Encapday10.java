package com.java;

public class Encapday10 {
	private int age;
	private String name;
	
	public void name(String a) {
		this.name=a;
		
	}
	public String helloname() {
		return name;
	}
	public int getage() {
		return age;
	}
	
	public void setage(int n) {
		this.age=n;
	}
	
	
	public static void main(String[] args) {
		Encapday10 e=new Encapday10();
		e.name("java");
		System.out.println(e.helloname());
		
	}

}
