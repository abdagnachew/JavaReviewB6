package com.review01;

public class VariableDemo {

	public static void main(String[] args) {

		// assign value
		String firstName;
		firstName = "John";

		// declare the variable & assign a value
		String lastName = "Smith";
		
		int age = 28;

		System.out.println(firstName + " " + lastName +" is " +age + " years old ");

		// re-assign a new value
		lastName = "Brown";
		age=32;

		System.out.println("after getting married :)");
		System.out.println(firstName + " " + lastName +" is " +age + " years old ");

}
}
