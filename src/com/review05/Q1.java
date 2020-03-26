package com.review05;

public class Q1 {
	
	public static void main(String[] args) {
	//Write a program to swap 2 numbers without a temporary variable? 
	//Swap  2 strings without a temporary variable?
		
		
	int one=20;
	int two=40;
	
	one=one+two;
	two=one-two;
	one=one-two;
	
	System.out.println(one);
	System.out.println(two);
	
	String str="Roll";
	String str1="Out";
	
	str=str+str1;
	str1=str.substring(0, (str.length())- str1.length());
	str=str.substring(str1.length());
	
	System.out.println(str);
	System.out.println(str1);
	}
}
