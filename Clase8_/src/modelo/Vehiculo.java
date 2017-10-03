package modelo;

public abstract class Vehiculo {

	
	private String marca;
	private String modelo;
	private String color;
	
	
	public abstract void apagar (String tipo);	
	public abstract void endender (Motor motor) ; 
//	public abstract void endender();
	
	
	// crear constructor aqui ... 
	
	public Vehiculo() {
		 
	}

	public Vehiculo(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void tocarBocina() {
		// TODO Auto-generated method stub
		
	}

	
}


