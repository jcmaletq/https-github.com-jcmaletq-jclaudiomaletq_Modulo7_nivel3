package com.vehicles.project;

import java.util.*;
import javax.swing.JOptionPane;
/*
 * el dialogo es por pantalla y uso la consola para el log y los resultados.
 */
public class main {

	public static void main(String[] args) {
		String vehic;
		do {
			  vehic = null;	
			  try {vehic=JOptionPane.showInputDialog("introudce si quiere crear coche o moto","car/bike").toUpperCase();
			      }
			  catch (Exception e)
			       {  System.out.println("error no se ha introducido vehiculo");
			       System.exit(0);}
			 }
			while (! Vehicle.vehic_valid(vehic));		
         if (vehic.equals("CAR")) {creaCar();}
         if (vehic.equals("BIKE")) {creaBike();}
	}
public static void creaCar() {
	Car coche;
	coche = Car.pide_datos_car();
	List<Wheel_car> frontWheels =new ArrayList<>();
	frontWheels = Wheel_car.pide_datos_rueda_car ("Back");
	List<Wheel_car> backWheels =new ArrayList<>();
	backWheels = Wheel_car.pide_datos_rueda_car ("Front");
	try {
	 coche.addWheels(frontWheels,backWheels);
	 }
	catch (Exception e)
	{  System.out.println("error en las ruedas"+ "");
	} 
	System.out.println(coche.toString());
	JOptionPane.showMessageDialog(null,coche.toString());
   } 
public static void creaBike() {
	Bike moto;
	moto = Bike.pide_datos_bike();
	List<Wheel_bike> frontWheels =new ArrayList<>();
	frontWheels = Wheel_bike.pide_datos_rueda_bike ("Back");
	List<Wheel_bike> backWheels =new ArrayList<>();
	backWheels = Wheel_bike.pide_datos_rueda_bike ("Front");
	try {
	 moto.addWheels(frontWheels,backWheels);
	 }
	catch (Exception e)
	{  System.out.println("error en las ruedas"+ "");
	}
	System.out.println(moto.toString());
	JOptionPane.showMessageDialog(null,moto.toString());
   } 
   
}
