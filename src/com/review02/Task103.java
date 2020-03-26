package com.review02;

public class Task103 {

	public static void main(String[] args) {

		for (int a = 17; a < 31; a++) {
			if (a % 2 == 0);
			System.out.println(a);

		}
		System.out.println("------------------------");
		
		for (int i=15; i<=35; i++) {
			System.out.println(i);
			if (i % 6 ==0) {
				continue;
			}
			System.out.println(i);

		}
		
		
		for (int i = 0; i < 10; i++) {  
			if (i == 4) {    
				break;  
				}
			System.out.println(i);} 


	}
}
