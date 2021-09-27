package com.vehicles.project;
import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	public Car(String tipo) {
		super(tipo);
	}
	public void addWheels(List<Wheel_car> frontWheels, List<Wheel_car> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}
	public void addTwoWheels(List<Wheel_car> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();
		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);
		if (!rightWheel.toString().equals(leftWheel.toString()))
			throw new Exception();
		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	@Override
	public String toString() {
		return "Car [plate=" + plate + ", brand=" + brand 
				+ ", color=" + color + " \n"  
				+ ", wheels=" + wheels + "]";
	}
	public static Car pide_datos_car (){
		return new Car(" Coche "); 
	}	
	
	
}
