package com.utn.vista;

import com.utn.controlador.CalculoControlador;

public class Test {

	
	public static void main(String[] args) {
		System.out.println("inicio del programa");
		CalculoControlador cc= new CalculoControlador();
		cc.dividir2Numeros(2, 0);
		
		System.out.println("fin del programa");
	}
}
