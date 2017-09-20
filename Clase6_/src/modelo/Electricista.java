package modelo;

public class Electricista extends Trabajador{
	

	public Electricista(String nombre, int edad) {
		super(nombre, edad);
	
	}
	public Electricista(String nombre, int edad, int peso, Turno turno,double salario) {
		super(nombre, edad, peso, turno,salario);
	
	}
}
