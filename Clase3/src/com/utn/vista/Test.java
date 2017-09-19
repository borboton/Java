package com.utn.vista;

import com.utn.modelo.Auto;
import com.utn.modelo.Moto;
import com.utn.modelo.Motor;
import com.utn.modelo.Vehiculo;

public class Test {

	public static void main(String[] args) {
		Motor motorcito =new Motor(500l, "GAS");
		Auto a = new Auto(motorcito, "Fiat", "500", true);
	
		System.out.println(a.getMarca());
		System.out.println(a.getMotor().getCc());
		System.out.println(a.getMotor().getCombustible());
		
		a.frenar();
		
		a.setMotor(new Motor(1600l, "nuclear"));
		
		System.out.println(a.getMotor().getCc());
		System.out.println(a.getMotor().getCombustible());
		
		Moto m = new Moto(new Motor(200l, "nafta"),"zanella","patagonia");
		System.out.println(m.getMarca());
		System.out.println(m.getMotor().getCc());
		System.out.println(m.getMotor().getCombustible());
	
		Vehiculo v1 = new Auto(new Motor(2000l, "Gasoil"),"Peugeot","308");
		
		Vehiculo v2 = new Moto(motorcito,"Honda","VStrom");
		
		v2 = new Auto(new Motor(2000l, "Gasoil"),"Peugeot","308");
		
		
		
	}

}
