package com.review01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Please enter age: ");
int age = scan.nextInt();
System.out.println("The age is" +age);

int height = scan.nextInt();
System.out.println("The height is " +height);
	}

}
