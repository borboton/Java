package com.utn.modelo;

public class Cuenta {
	
	private double saldo;
	private int numCuenta;
	private String tipoCuenta;
	private double descubierto = 1000.0;
	
	
	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void retiroDieneroDescubierto(double dinero) {
		if(dinero <= descubierto ) {
			System.out.println("usted esta retirando " +  dinero);
			descubierto = descubierto - dinero; 
			System.out.println("su descubierto actual es de " + descubierto);
		}else
		{
			System.out.println("Disculpe usted ya se ha exedido del limite del descubierto");
		}
	}
	public void muestroSaldo() {
		System.out.println("su saldo es " + saldo);
	}
	
	//setter
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//getter
	public double getSaldo() {
		return saldo;
	}
	
	
}
