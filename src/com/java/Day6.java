package com.java;
import java.util.Scanner;

public class Day6 {
public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the age ");
	int personAge=ss.nextInt();
	System.out.println("Entered value =" +personAge);
	
	switch(personAge) {
		case(18):
	System.out.println("Candidate can vote");
	break;
	
		case(19):
			System.out.println("Candidate can vote");
			break;
			
		case(20):
			System.out.println("Candidate can vote");
			break;
			
		default:
			System.out.println("Welcome");
			break;
			
   }
 }
}
