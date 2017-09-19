package com.utn.vista;

import com.utn.modelo.CajaAhorro;
import com.utn.modelo.Cliente;
import com.utn.modelo.Cuenta;
import com.utn.modelo.CuentaCorriente;
import com.utn.modelo.exception.MiException;

public class Test {

	public static void main(String[] args) {

		/*
		 * Ejemplo sobre cuenta corriente utilizando como base la misma cuenta corriente
		 */
		CuentaCorriente cc = new CuentaCorriente(12345, 1000, 1000, new Cliente("Amilcar", "Arbolito"));

		try {
			cc.retiroDescubierto(2000);
			System.out.println(cc.getDescubierto());
			cc.retiroDescubierto(1);
			System.out.println(cc.getDescubierto());
			cc.retiroDescubierto(1);
			
		} catch (MiException sarasa) {
			sarasa.muestroMensajeError();
		}
		
		
		//Aplicando polimorfismooooo muejeje!!!
		
		//Factoria Abstracta
		Cuenta c1 = new CuentaCorriente(123123, 1000, 50, new Cliente("Juan", "Tello"));
		
		
		//Factoria Abstracta de Caja de Ahorro donde 
		//No redefine metodos pero si atributos
		
		Cuenta c2 = new CajaAhorro(123123, 1000, 0, new Cliente("Matias", "Mon"));
		
		c2.setSaldo(1000);
		
		CajaAhorro c3 = new CajaAhorro(123123, 1000, 0, new Cliente("Pepe", "Gonazalez"));

//		c3.depositarDinero(1000);
			
		try {
			String[] nombres = new String[0];
			
			nombres[2]="pepe";
		} catch (Exception e) {
			System.out.println("la cagaste! con el indice!! ameo!");
		}
		
		if (c2 instanceof CajaAhorro) {
			//esto es un objeto estatico
			CajaAhorro caObj = (CajaAhorro) c2;
//			caObj.depositarDinero(1000);
			
		}
		
		
		
		
	}

}
