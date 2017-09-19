package local.modelo;


public class Cuenta {
	
	private double saldo; 
	private int numCuenta; 
	private String tipoCuenta;
	private double descubierto = 2000.0;
	private double dinero;
	
	
	
	// Privacidad + Que devuelve  +  nombreMetodo
	
	public double getDinero() {
		return dinero;
	}

	/*
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}*/



	public void retiroDinero(double dinero) {
		
		saldo = saldo - dinero ;
		System.out.println("usted esta retirando " +  dinero + "\r");
	}
	
	public void retiroDieneroDescubierto(double dinero) {
		
		if(dinero <= descubierto ) {
			
			System.out.println("usted esta retirando " +  dinero + "\r");
			
			descubierto = descubierto - dinero; 
			
			System.out.println("if usted esta retirando" + "\r");
			System.out.println("su descubierto actual es de " + descubierto + "\r");
			
			
		}else
			
		{

			System.out.println("else" + "\r");

			System.out.println("Disculpe usted ya se ha exedido del limite del descubierto" + "\r");
		}
		
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private int getNumCuenta() {
		return numCuenta;
	}
	private void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	private String getTipoCuenta() {
		return tipoCuenta;
	}
	private void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public double getDescubierto() {
		return descubierto;
	}
	private void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	public void muestroSaldo() {
		System.out.println("su saldo es " + saldo + "\r");
	}
	

}