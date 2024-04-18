package com.java;

import java.util.Arrays;

public class ArrayDay61D {
	public static void main(String[] args) {
		String a ="aa";
		  System.out.println(a);
		  
		String[] studentName=new String[5];
		studentName[0]="Java";
		studentName[1]="C";
		studentName[2]="Python";
		studentName[3]="Ruby";
		studentName[4]="Perl";
	    System.out.println("values=="+studentName[4]);
	    
	    System.out.println("ARRAY LENGTH=="+studentName.length);
	    
	    System.out.println("ALL VALUES=="+Arrays.toString(studentName)); //to print every values of array in []
	    
	    for(int i=0;i<studentName.length;i++) {
			System.out.println("get values  "+ i +" index " +studentName[i]);
			
		}
	    
	    
	    //advanced for loop
	    
	    for(String ns: studentName) {
			System.out.println("GET VALUES " +ns );
			
		}
	    
	     int[] s=new int[5];
			s[0]=1;
			s[1]=2;
			s[2]=3;
			s[3]=4;
			s[4]=5;
		    System.out.println("values=="+s[4]);
		    
		    
		    char[] ss=new char[2];
			ss[0]='h';
			ss[1]='l';
		    System.out.println("values=="+ss[0]);
	    
	  
	
	}

}
