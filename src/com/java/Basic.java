package com.java;

public class Basic {
	int a=9;
	byte b=127;
	double d=22.2222;
	float c=22.22f;
	boolean e=true  ;
	char f='l';
	
	public static void main(String[] args) {
		Basic bs=new Basic();
		System.out.println(" hello world") ;
		bs.methodBasic();
	}
	public void methodBasic() {
		System.out.println(" welcome") ;
	}
}
