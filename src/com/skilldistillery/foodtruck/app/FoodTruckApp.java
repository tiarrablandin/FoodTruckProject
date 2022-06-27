package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	Scanner sc = new Scanner(System.in);
	private FoodTruck fleet[] = new FoodTruck [5];
	
	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
		
	}	

	public void run() {
		
		String name;
		String foodType;
		double rating;
		
		System.out.println("Hello! Please enter up to five food trucks, if you have less than five type \"quit\" to stop entering.\n");
		
		for(int i = 0; i < fleet.length; i++) {
			System.out.println("What is the name of the food truck? ");
			name = sc.nextLine();
				if (name.equals("quit")) {
					break;
				}
			System.out.println("What is the food type? ");
			foodType = sc.nextLine();
			System.out.println("How would you rate this truck? ");
			rating = sc.nextDouble();
			sc.nextLine();
			fleet [i] = new FoodTruck(name, foodType, rating);
		}
		
		options();
		
	}
	
	
	public void options() {
		
		while (true) {
			System.out.println("Menu:");
			System.out.println("1: List food trucks");
			System.out.println("2: See average rating for food trucks.");
			System.out.println("3: See highest rated food truck.");
			System.out.println("4: Quit");
			int selection = sc.nextInt();
			
			int i = 0;
			double highestRating = 0.0;
			double avg = 0.0;
			double counter = 0.0;
			
			if (selection == 1) {
				for (i = 0; i < fleet.length; i++  ) {
					if (fleet[i] != null) {
						System.out.println(fleet[i].toString() + "\n");
					}
			    } 
			}
			if (selection == 2) {
				for (i = 0; i < fleet.length; i++  ) {
					if (fleet[i] != null) {
						avg += fleet[i].getRating();
						counter++;
					}
			    } 
				avg /= counter;
				System.out.println("The average rating for food trucks is: " + avg + "\n");
			}
			if (selection == 3) {
				int highestRated = 0;
				for (i = 0; i < fleet.length; i++  ) {
					if (fleet[i] != null) {
						if (highestRating < fleet[i].getRating()) {
							highestRating = fleet[i].getRating();
							highestRated = i;
						}
					}
				}
				System.out.println(fleet[highestRated].toString() + "\n");
			} 
			if (selection == 4) {
			    	System.out.println("Goodbye.");
			       break;
			    }
			
		}	
	}
	
		
}
