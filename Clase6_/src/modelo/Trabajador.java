package modelo;

public class Trabajador {
	
	private String nombre;
	private int edad;
	private int peso;
	private Turno turno;
	private double salario;
	
	public Trabajador(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public Trabajador(String nombre, int edad, int peso, Turno turno, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.turno = turno;
		this.salario = salario;
		this.valorTurno(turno);
	}

//	public Trabajador(String nombre2, int edad2, int peso2, Turno turno2, double salario2) {
//		this.nombre = nombre2;
//		this.edad = edad2;
//		this.peso = peso2;
//		this.turno = turno2;
//		this.salario=salario2;
//		this.valorTurno(turno2);
//	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void valorTurno(Turno turno) {
		switch (turno) {
		case MAÑANA:
			//this.salario = salario;
			break;

		case TARDE:
			this.salario = (this.salario * 18 / 100 + this.salario);
			break;
			
		case NOCHE:
			this.salario = (this.salario * 20 / 100 + this.salario);
			break;
		}
	}
	
	

}
