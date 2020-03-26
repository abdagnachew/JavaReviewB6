package com.review04;

public class TwoDArrayDemo {

	public static void main(String[] args) {
//1st way
		int [] [] numbers = { { 2, 3, 4, 7}, {5, 6, 2, 7}, {0, 9, 8, 7}};
		   
		int row=numbers.length;
		for (int i=0; i< row; i++) {
			System.out.println("i am the row index" +i);
		}
	}

}
