package com.review03;

public class Lesson4 {

	public static void main(String[] args) {
		
		int var1=5;
		double var2=3.65;
		
		aircraft cessena172 = new aircraft();  //creates object of class aircraft
		
		aircraft piperSaratoga = new aircraft();
		
		cessena172.passenger = 4;
		cessena172.cruiseSpeed = 140;
		cessena172.fuelCapacity = 56.5;
		cessena172.fuelBurnRate = 9.5;
		
		System.out.println("cessna 172 passengers: " + cessena172.passenger);
		System.out.println("fuel burn rate: " + cessena172.fuelBurnRate + "gph");
		
		piperSaratoga.passenger = 6;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;
		
		System.out.println("\nPiper sratgoa cruise ships: " +piperSaratoga.cruiseSpeed +"mph");
		
	}

}
 
class aircraft {
	int passenger;  		//number of people
	int cruiseSpeed;		//miles per hour
	double fuelCapacity;	//gallons
	double fuelBurnRate;	//gallons per hour
	
}