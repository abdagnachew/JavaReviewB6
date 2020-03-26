package com.review02;

public class SwitchCapitalCity {

	public static void main(String[] args) {
		
		String capitalCity= "Pakistan";
		String country = "US";
		
		switch (country) {
		case "US":
			capitalCity="Washington DC";
			break;
		case "Russia":
			capitalCity="Moscow";
			break;
		case "China":
			capitalCity="Beijing";
			break;
		case "ALbania":
			capitalCity="Tirana";
			break;
		case "Pakistan":
			capitalCity = "Islamabad";
			break;
		case "Turkey":
			capitalCity = "Ankara";
			break;
			default:
				capitalCity="Not in my list";
				break;
		}
		System.out.println("The capital city of " +country+ "and" + capitalCity);
			
		}
		}


