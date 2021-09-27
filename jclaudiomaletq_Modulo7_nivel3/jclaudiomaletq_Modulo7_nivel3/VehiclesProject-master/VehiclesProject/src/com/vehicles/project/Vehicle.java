package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	public Vehicle(String tipo) {
		String vplate,vbrand,vcolor;
		int val;
		vbrand =null;
		vcolor = null;
		do {
		  vplate = null;	
		  try {vplate=JOptionPane.showInputDialog("introudce la matricula del vehiculo " +tipo,"1234ab").toUpperCase();
		      }
		  catch (Exception e)
		       {  System.out.println("error no se ha introducido matricula del " +tipo);
		       System.exit(0);}
		 }
		while (! plate_valid(vplate));
		try {vbrand=JOptionPane.showInputDialog("introudce la marca del vehiculo" +tipo,"Brand "+ tipo);
		      val = vbrand.length();   // para detectar el cancel 
		     }
		  catch (Exception e)
		      {  System.out.println("error no se ha introducido la marca del " +tipo);
		         System.exit(0);
		       }
		
		try {vcolor=JOptionPane.showInputDialog("introudce el color del vehiculo" +tipo,"Color");
		       val = vcolor.length();   // para detectar el cancel
		     }
	        catch (Exception e)
	            { System.out.println("error no se ha introducido el color del vehiculo " +tipo);
		         System.exit(0);
		       }
		this.plate = vplate;
		this.brand = vbrand;
		this.color = vcolor; 
	}
	public static boolean vehic_valid (String vehic) {
		boolean valid;
		valid = false;
		if (vehic.equals("CAR")) {
			valid = true;}
		if (vehic.equals("BIKE")) {
			valid = true;}		
		return valid;
	 }
	public static boolean plate_valid (String plate) {
		boolean valid, valid1,valid2;
		valid = false;
		valid1 = false;
		valid2 = false;
		if (plate.length()>=6 && plate.length()<=7) {
			valid = true;
			if (! plate.substring(0,4).matches(".*[A-Z].*")) {
				valid1 = true;
				if (! plate.substring(4).matches(".*[0-9].*")) {
					valid2 = true;}
				else {System.out.println("la matricula " +plate +" con letras incorrectas, 2 o 3 letras");
				JOptionPane.showMessageDialog(null,"la matricula " +plate +" con letras incorrectas, 2 o 3 letras");}
				}
			else {System.out.println("la matricula " +plate +" ha de tener 4 numeros");
			   JOptionPane.showMessageDialog(null,"la matricula " +plate +" ha de tener 4 numeros");}	
			}
		else {System.out.println("la matricula " +plate +" es corta 4 numeros y 2 o 3 letras");
		   JOptionPane.showMessageDialog(null,"la matricula " +plate +" es corta 4 numeros y 2 o 3 letras");}
		return valid && valid1 && valid2;
	}
}
