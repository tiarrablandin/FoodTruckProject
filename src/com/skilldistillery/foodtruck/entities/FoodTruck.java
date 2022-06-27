package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	public int id;
	public static int nextId = 1;
	public String name;
	public String foodType;
	public double rating;
	
	public FoodTruck() {}
	
	public FoodTruck(String name, String foodType, double rating) {
		this.id = nextId++;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}
	
	public String getInfo() {
		return id + " " + name +  " " + foodType +  " " + rating;
	}

	@Override
	public String toString() {
		return "FoodTruck ID= " + id + ", Name= " + name + ", Food Type= " + foodType + ", Rating= " + rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
}
