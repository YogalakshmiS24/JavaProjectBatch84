package com.java;

public class Day8 {
	public static void main(String[] args) {
	
		
		String name="Java";
		name="Ruby";
		String name1="Java";
		String name5="Java";
		String name6="Java";
		String sample="Python";
		System.out.println("Memory------"+System.identityHashCode(name));
		System.out.println("");
		System.out.println("Memory------"+System.identityHashCode(name1));
		System.out.println("");
		System.out.println("Memory------"+System.identityHashCode(name5));
		System.out.println("");
		System.out.println("Memory------"+System.identityHashCode(name6));
		System.out.println("Memory------"+System.identityHashCode(sample));
		String lit=name.concat(sample);
		
		System.out.println(lit);
		System.out.println("Memory------"+System.identityHashCode(lit));
		System.out.println(name);
		System.out.println("Memory------"+System.identityHashCode(name));
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		// Non-literal
					StringBuffer sample1=new StringBuffer("Welcome");
					StringBuffer sample2=new StringBuffer("Hello");
					StringBuffer name2=new StringBuffer("python");
					
					System.out.println("Memory------"+System.identityHashCode(sample1));
					System.out.println("Memory------"+System.identityHashCode(sample2));
					System.out.println("Memory------"+System.identityHashCode(name2));
					StringBuffer litt =new StringBuffer(sample1.append(sample2));
					System.out.println(litt);
					System.out.println("Memory------"+System.identityHashCode(litt));
					System.out.println(sample1);
					System.out.println("Memory------"+System.identityHashCode(sample1));
					
					
					
	}
	
	
	

}
