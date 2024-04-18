package com.javabasic;

public class Overriding2 extends Overriding{
	
	public void dog(String name,int age) {
		System.out.println("Cat-----------"+name+age);
	}
	
	
	public static void main(String[] args) {
		Overriding r=new Overriding2();
		r.dog("hello");
  }
	
	
	
}


