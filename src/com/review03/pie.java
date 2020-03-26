package com.review03;

import java.util.Scanner;

public class pie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Print number here:");
		int number = input.nextInt();
		// boolean num=true;

		if (number ==0 || number ==1) {
			System.out.println("not " +number);
		} else {
			System.out.println(" prime number");

		}
	}

}
