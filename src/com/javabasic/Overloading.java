package com.javabasic;

public class Overloading {
	public static void main(String[] args) {
		Overloading ov=new Overloading(); 
		ov.shapes("circle",1);
		ov.shapes("Rectangle",10, 30);
		ov.shapes(50,"sQuare", 440);
	}
	
	public void shapes(String geometry,int radius) {
		if(geometry.equalsIgnoreCase("circle"))  {
			System.out.println("CIRCLE----"+radius);
		}
	}
	
	public void shapes(String geometry,int length,int width) {
		if(geometry.equalsIgnoreCase("rectangle"))  {
			System.out.println("RECTANGLE----"+length+","+width);
		}
	}
	public void shapes( int length,String geometry,int width) {
		if(geometry.equalsIgnoreCase("square"))  {
			System.out.println("SQUARE----"+length+","+width);
		}
	}
	
}
