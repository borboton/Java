package local.vista;

import local.modelo.Cuenta;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta c = new Cuenta () ; 
		c.setSaldo(23000.1); 
		c.muestroSaldo();
		
		c.retiroDieneroDescubierto(700.0);
		c.retiroDieneroDescubierto(400.0);
		c.retiroDieneroDescubierto(250.0);
		
		
		System.out.println("hola Mundo");
		
		System.out.println("Descubierto es: " +  c.getDescubierto() + "\r"); 
		 
		c.retiroDieneroDescubierto(0.1);
		
		System.out.println("ver getdinero: " + c.getDinero() + "\r");
		c.muestroSaldo();
		
		c.retiroDinero(23000);
		c.muestroSaldo();
		//System.out.println("Saldo es : " +  c.getSaldo()) ;
		 

	}

}
