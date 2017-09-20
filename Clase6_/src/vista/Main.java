package vista;

import modelo.Albañil;
import modelo.Electricista;
import modelo.Trabajador;
import modelo.Turno;

public class Main {

	public static void main(String[] args) {


		Trabajador t1 = new Electricista("jose", 23, 80, Turno.NOCHE, 10000);
		Trabajador t2 = new Albañil("Juan", 35, 75, Turno.TARDE, 8500);
		
		System.out.println("Trabajador: " + t1.getClass());
		System.out.println("Nobre: " + t1.getNombre());
		System.out.println("Edad: " + t1.getEdad());
		System.out.println("Turno: " + t1.getTurno());
		System.out.println("Salario x turno: " + t1.getSalario());
		System.out.println();
		
		System.out.println("Trabajador: " + t2.getClass());
		System.out.println("Nobre: " + t2.getNombre());
		System.out.println("Edad: " + t2.getEdad());
		System.out.println("Turno: " + t2.getTurno());
		System.out.println("Salario x turno: " + t2.getSalario());
		System.out.println();
		
	}

}
