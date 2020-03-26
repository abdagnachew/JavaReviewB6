package com.review02;

import java.util.Scanner;

public class AndOperatorRichBoy {

	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		
    		System.out.println("Enter if your boy or girl? ");
    		String boyGirl= input.next();
    		
    		System.out.println("Are you rich? Type: true or false");
    		boolean rich= input.nextBoolean();
    		
    		System.out.println("You are a " +boyGirl+ " and you are rich:" +rich);
    		
    		String example= " ";
    		
    		if (boyGirl.equals("boy")&& rich) {
    			example="Hi there";
    			
    		}
    		
    		
    
 
	}

}
