package com.java;


public class Day9 {   
	
 public static void main(String[] args) {
	String s1="Welcome to java";
	String s2=" java";
	
	System.out.println("------------------LENGTH----------------------------");
	int length=s1.length();
	System.out.println(length);
	
	System.out.println("------------------CHARAT--------------------------");
	
	char charAt = s1.charAt(2);
	System.out.println(charAt);
	
	System.out.println("------------------EQUALS-------------------------");
	boolean equals = s1.equals("Welcome to java");
	System.out.println(equals);
	
	System.out.println("------------------EQUALSIGNORECASE--------------------------");
	boolean equalsIgnoreCase = s1.equalsIgnoreCase("WELcoMetoJava");
	System.out.println(equalsIgnoreCase);
	
	System.out.println("----------------UPPERCASE-------------------------");
	String upperCase = s1.toUpperCase();
	System.out.println(upperCase);
	
	System.out.println("------------------LOWERCASE--------------------------");
	String lowerCase = s1.toLowerCase();
	System.out.println( lowerCase);
	
	System.out.println("------------------STARTSWITH--------------------------");
	boolean startsWith = s1.startsWith("W");
	System.out.println(startsWith);
	System.out.println("-----------------ENDSWITH---------------------------");
	boolean endsWith = s1.endsWith("A");
	System.out.println(endsWith);
	System.out.println("-----------------CONTAINS---------------------------");
	boolean contains = s1.contains("jav");
	System.out.println(contains);
	
	System.out.println("----------------INDEXOF----------------------------");
	int indexOf = s1.indexOf("jav");
	System.out.println(indexOf);
	
	System.out.println("----------------LASTINDEXOF----------------------------");
	int lastIndexOf = s1.lastIndexOf("jav");
	System.out.println(lastIndexOf);
	
	System.out.println("----------------LAST INDEXOF INDEX MENTION----------------------------");
	String s9="Welcome to ejavae";
	 int indexOf2 = s9.lastIndexOf("e",13);
	System.out.println(indexOf2);
	
	System.out.println("----------------TRIM----------------------------");
	String s3="  Welcome   to  java    ";
	String trim = s3.trim();
	System.out.println(trim);
	
	System.out.println("----------------EMPTY----------------------------");
	String  s4="  ";
	boolean empty = s4.isEmpty();
	System.out.println(empty);
	
	System.out.println("----------------BLANK----------------------------");
	String  s5="  ";
	 boolean blank = s5.isBlank();
	System.out.println(blank);
	
	System.out.println("----------------Replace----------------------------");
	String s6="Welcome";
	String replace = s6.replace("Welcome", "mmm");
	System.out.println( replace);
	
	
	System.out.println("----------------SUBSTRING----------------------------");
	String s7="Welcome java";
	String substring = s7.substring(2);
	System.out.println(substring);
	
	
	System.out.println("----------------SUBSTRING2----------------------------");
	String s8="Welcometo java";
	String substring2 = s8.substring(2, 12);
	System.out.println(substring2);
	
	System.out.println("----------------SPLIT STRING----------------------------");
	String[] sp=s1.split("  ");
	for(String s:sp)
	 {
		System.out.println(s);
	 }
	
	System.out.println("----------------COMPARE----------------------------");
	String in="welDome";
	String inn="webcome"; //108-98 l-b
	System.out.println(in.compareTo(inn));
	
	
	String innn="welcome java";
	String i="welcome"; //
	System.out.println(innn.compareTo(i));
	
	String im="welDome java ";
	String imm="welbome python  "; //
	System.out.println(imm.compareTo(im));
	
	String a="welcome ";
	String b="welcome"; //
	System.out.println(a.compareTo(b));
	
	
	
}
	

}
	
	
	

