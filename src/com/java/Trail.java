package com.java;



public class Trail {
	
 public static void main(String[] args) { 
	  int tables[][] = {{10,20,30},{40,50,60,70},{90,80,100},{110,120}}; // Literal  
	  System.out.println(tables[3][1]); 
	  
	  int row = tables.length;  //4 
	  System.out.println("Size of the column: "+tables[0].length); 
	 
	   
	  for(int i=0;i<row;i++){  // i=0 1 2 3 4 
	   for(int j = 0;j<tables[i].length;j++) {  //j 0 1 2 3  
	    System.out.print(tables[i][j]); 
	    System.out.print(" ");
	   } 
	   System.out.println(""); 
	  } 
	 } 
	}


