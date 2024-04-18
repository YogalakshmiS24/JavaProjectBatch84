package com.java;

import java.util.Arrays;

public class Day7Array2D {
	
	public static void main(String[] args) {
		//non literal form
		int[][] s=new int[3][3];
		s[0][0]=100;
		s[0][1]=200;
		s[0][2]=300;
		s[1][0]=400;
		s[1][1]=500;
		s[1][2]=600;
		s[2][0]=700;
		s[2][1]=800;
		s[2][2]=900;
	
		 System.out.println("values=="+s[2][2]);
		    
		    System.out.println("ARRAY LENGTH=="+s.length); // row
		    
		    System.out.println("ARRAYcolumn LENGTH=="+s[1].length);// column
		    
		    int row=s.length;
		    System.out.println("ALL VALUES=="+Arrays.toString(s)); // full value inside []
		    System.out.println("");
		    System.out.println("");
		    
		    for(int i=0;i<row;i++) {
		    	for(int j=0;j<s[i].length;j++) {
				System.out.print(s[i][j]);
				System.out.print(" ");
				
		    	 }
		    	System.out.println("");
		    	}
		    
			System.out.println("");
			System.out.println("");
			System.out.println("");
		
	
		//literal form
		    int ss[][]= { {10,20,30} ,{40,50}, {60,70,80}};
			
		
			    
			    int roww=ss.length;
			  
			    for(int i=0;i<roww;i++) {
			    	for(int j=0;j<ss[i].length;j++) {
					System.out.print(ss[i][j]);
					System.out.print(" ");
					
			    	 }
			    	System.out.println("");
			    	}
			    System.out.println("");
			    System.out.println("");
			    
			    
			    // object class-for non similar data
			    
			Object[] n=new Object[4];
			n[0]='a';
			n[1]=1;
			n[2]=0.9;
			n[3]="yyy";
			
			 System.out.println("values==" +n[2]);    
			   System.out.println("ALL VALUES=="+Arrays.toString(n));
			   System.out.println("");
			   for(Object nn:n) {
				   System.out.println(nn); 
			   }
		    
	}
	
}
