package vista;

import modelo.Albañil;
import modelo.Electricista;
import modelo.Trabajador;
import modelo.Turno;

public class Main {

	public static void main(String[] args) {
		
		Trabajador t1 = new Electricista("Jose", 23, 80, Turno.NOCHE, 10000);
		Trabajador t2 = new Albañil("Juan", 35, 75, Turno.TARDE, 10000);
		Trabajador t3 = new Electricista("Marcelo", 32, 88, Turno.MAÑANA,10000 );
		
		System.out.println("Trabajador: " + t1.getClass());
		System.out.println("Nobre: " + t1.getNombre());
		System.out.println("Edad: " + t1.getEdad());
		System.out.println("Turno: " + t1.getTurno());
		System.out.println("Salario: " + t1.getSalario());
		System.out.println();
		
		System.out.println("Trabajador: " + t2.getClass());
		System.out.println("Nobre: " + t2.getNombre());
		System.out.println("Edad: " + t2.getEdad());
		System.out.println("Turno: " + t2.getTurno());
		System.out.println("Salario : " + t2.getSalario());
		System.out.println();
		

		System.out.println("Trabajador: " + t3.getClass());
		System.out.println("Nobre: " + t3.getNombre());
		System.out.println("Edad: " + t3.getEdad());
		System.out.println("Turno: " + t3.getTurno());
		System.out.println("Salario : " + t3.getSalario());
		System.out.println();
		
		
	}

}
