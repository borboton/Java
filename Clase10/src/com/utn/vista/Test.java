package com.utn.vista;

import java.util.ArrayList;

import com.utn.controlador.AccionControlador;
import com.utn.modelo.Accion;
import com.utn.modelo.Borrame;
import com.utn.modelo.Figura2D;
import com.utn.modelo.FiguraTridimencional;
import com.utn.modelo.IAccion;
import com.utn.modelo.IArea;
import com.utn.modelo.IMagia;
import com.utn.modelo.Mamifero;

public class Test {

	public static void main(String[] args) {
		IArea b = new Borrame();

		b.circulo();
		IArea obj1 = null;
		int a = 0;

		if (a < 10) {
			obj1 = new Figura2D();
		} else {
			obj1 = new FiguraTridimencional();
		}

		// obj1.circulo();

		ArrayList<IArea> listaArea = new ArrayList<IArea>();
		listaArea.add(new Figura2D());
		listaArea.add(new FiguraTridimencional());
		listaArea.add(new Borrame());

		listaArea.get(0).circulo();

		// implementacion por clase anonima JDK 7 o menor
		IMagia m = new IMagia() {

			@Override
			public String fliplendo() {
				// TODO Auto-generated method stub
				return "Flipendooooooo juschu juschu walalaaa";
			}
		};

		System.out.println(m.fliplendo());

		// JDK 8 o posterior
		// trabajando con la interfaz
		IAccion acc = new IAccion() {

			@Override
			public void saltar(Mamifero mami) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String fliplendo() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void circulo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado(double lado) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void circulo(double diametro) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public double triangulo() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean daResultado() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		acc.correr();

		// trabajando con la clase
		Accion aclass = new Accion();

		aclass.correr();

		AccionControlador ac = new AccionControlador();

		ac.mamiferoCorrer(new IAccion() {
			@Override
			public void correr() {
				System.out.println("la persona corre con 2 piernas");
			}

			@Override
			public void saltar(Mamifero mami) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String fliplendo() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void circulo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado(double lado) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void circulo(double diametro) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public double triangulo() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean daResultado() {
				// TODO Auto-generated method stub
				return false;
			}
		});

		ac.mamiferoCorrer(new IAccion() {
			@Override
			public void correr() {
				System.out.println("el perro corre en 4 patas");
			}

			@Override
			public void saltar(Mamifero mami) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String fliplendo() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void circulo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado(double lado) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void circulo(double diametro) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public double triangulo() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean daResultado() {
				// TODO Auto-generated method stub
				return false;
			}
		});

		ac.mamiferoCorrer(new IAccion() {
			@Override
			public void correr() {
				System.out.println("el canguro salta en 2 patas");
			}

			@Override
			public void saltar(Mamifero mami) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String fliplendo() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void circulo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado(double lado) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void circulo(double diametro) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public double triangulo() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean daResultado() {
				// TODO Auto-generated method stub
				return false;
			}
		});

		ac.mamiferoCorrer(new IAccion() {
			@Override
			public void correr() {
				// TODO Auto-generated method stub
				IAccion.super.correr();
			}

			@Override
			public void saltar(Mamifero mami) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String fliplendo() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void circulo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void cuadrado(double lado) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void circulo(double diametro) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public double triangulo() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean daResultado() {
				// TODO Auto-generated method stub
				return false;
			}
		});

	}

}
