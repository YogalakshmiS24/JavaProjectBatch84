package com.javabasic;

public class Hello  extends Abst{

	@Override
	public void method() {
		System.out.println("bye");
		
	}
	public static void main(String[] args) {
		Hello h=new Hello();
		h.a=10;
		h.dog();
		System.out.println(h.a);
		h.method();
	}

}
