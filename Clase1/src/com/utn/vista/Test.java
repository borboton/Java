package com.utn.vista;

import java.net.StandardSocketOptions;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.utn.controlador.Contenedor;
import com.utn.controlador.Ladino;
import com.utn.modelo.Cuenta;
import com.utn.modelo.Persona;

public class Test {

	public static void main(String[] args) {

		Cuenta c = new Cuenta();
		c.setSaldo(50000.00);

		System.out.println(c.getSaldo());

		System.out.println("dinero disponible x descubierto" + c.getDescubierto());
		c.retiroDieneroDescubierto(700.0);
		c.retiroDieneroDescubierto(400.0);
		c.retiroDieneroDescubierto(250.0);
		
		System.out.println("vuelvo a mostrar el saldo asignandole 10 pesos");
		c.setSaldo(10.0);
		System.out.println(c.getSaldo());
		
		//el objeto es estatico hasta que se instancie
		Persona p= new Persona("Mariano","Perez",12345); 
		           //es un objeto instanciado
		
				
		System.out.println("imprimo el objeto P " + p.getNombre() + " " +  p.getApellido() );
		p = null;
		p = new Persona("Juan carlos","Perez",213456);
	
		p.setFuma(false);
		p.setDeporte(false);
//		p.setDni(1234576);
		p.setEdad(25);
		System.out.println(p.getNombre());
		
		Contenedor cx = new Contenedor();
		
		cx.setPersona(p);
		
		cx.muestroObjetoPersona();
		
		System.out.println("======p.getNombre()==========");
		System.out.println(p.getNombre());
		
		
		System.out.println("Muestro con ejemplo mas sencillo");
		
		Persona p1 = new Persona("dante","panella",123456);
//		p1.setNombre("Matias");
		System.out.println("p1.getNombre = " + p1.getNombre());
		
		Persona p3 = p1;
		
//		p3.setNombre("Gabriel");
		
		System.out.println("p1.getNombre= " + p1.getNombre());
		
		
		
		Persona p4 = new Persona("Juan Pablo","Pereira",12345);
		Persona p5 = new Persona("Rosana","cespedes",1234);
		
		
		System.out.println(p4.getNombre());
		System.out.println(p5.getNombre());
		
		
	}

}
