package com.utn.controlador;

import com.utn.modelo.Calculo;

public class CalculoControlador {

	public void dividir2Numeros(int num1, int num2){
		try {
			Calculo c = new Calculo();
			
			System.out.println("El resultado de la division de: " + num1 + " y  " + num2 +  " el resultado es: " + c.divido2Num(num1, num2));
			
		} catch (Exception e) {
			System.out.println("se presento un error!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
