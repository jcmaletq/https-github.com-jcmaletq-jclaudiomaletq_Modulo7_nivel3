package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	public Bike(String tipo) {
		super(tipo);
	}
	public static Bike pide_datos_bike (){
		return new Bike(" moto "); 
	}	
	@Override
	public String toString() {
		return "Bike [plate=" + plate + ", brand=" + brand 
				+ ", color=" + color + " \n"  
				+ ", wheels=" + wheels + "]";
	}
	public void addWheels(List<Wheel_bike> frontWheels, List<Wheel_bike> backWheels) throws Exception {
		addWheels(frontWheels);
		addWheels(backWheels);
	}
	public void addWheels(List<Wheel_bike> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();
		Wheel Wheel = wheels.get(0);
		this.wheels.add(Wheel);
	}	
}




