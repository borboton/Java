package local.vista;

import java.util.Scanner;

import local.modelo.CajaDeAhorro;
import local.modelo.Cuenta;
import local.modelo.Cliente;

public class Main {

	public static void main(String[] args) {

//		if (c2 instanceof CajaAhorro) {
//			//esto es un objeto estatico
//			CajaAhorro caObj = (CajaAhorro) c2;
//			//			caObj.depositarDinero(1000);
//
//		}

		CajaDeAhorro c1 = new CajaDeAhorro(12345, 1000, 1000, new Cliente("Ariel", "Lorenzo"));
		
		
		
		
		if (c1 instanceof CajaDeAhorro) {

			CajaDeAhorro p1 = (CajaDeAhorro) c1 ;
			


			System.out.println("Cuenta Nro :" + p1.getNumero());			
			System.out.println("Saldo =  " + p1.getSaldo());
			
			
			Scanner sc = new Scanner(System.in);
			
			String a = sc.nextLine();
			
			System.out.println(a);
			
			
			

		}

	}

}
