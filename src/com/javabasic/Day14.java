package com.javabasic;

public class Day14 implements MultiParentone,Parenttwomulti {
	public void parenttwo() {
		
		System.out.println(a);
	}	
	public void parentone() {
	
		System.out.println(a);
	}

	

	 public static void main(String[] args) {
		 
		 Day14 h=new Day14();
		 h.parenttwo();
		 h.parentone();
		
	}

	
}
