package modelo;

public class Auto extends Vehiculo{

	
	public Auto() {
		super();
	}

	public Auto(String marca, String modelo, String color) {
		super(marca, modelo, color);
	}
	

	@Override
	public void endender(Motor motor) {
	}

	@Override
	public void apagar(String tipo) {
	}

	public void doblar() {
		System.out.println("Estoy doblando class :  "  + getClass().getSimpleName());
		
	}
	
}
