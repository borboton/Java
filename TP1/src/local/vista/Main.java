package local.vista;
import java.util.Scanner;

import local.modelo.Conejo;
import local.modelo.Gato;
import local.modelo.Perro;



public class Main {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Bienvenido al sistema veterinario de Gestion. ");
		System.out.println("----------------------------------------------");
		System.out.println("Enter para continuar... ");
        scan.nextLine();

        Conejo conejo = new Conejo();
        Gato gato = new Gato();
        Perro perro = new Perro();
        

        System.out.println("Tipo de Mascota: ");
        String tipo =  scan.nextLine();
        

        	String nombre = scan.nextLine();
        	int edad = scan.nextInt();
        	String raza = scan.nextLine();
        	
        	conejo.setNombre(nombre);
        	conejo.setEdad(edad);
        	conejo.setRaza(raza);
        	
        	System.out.println("Nombre: " + conejo.getNombre());
        			
            System.out.println("Raza: " + conejo.getEdad());
            
            System.out.println("Edad: " + conejo.getRaza());

        
        
                
        
        
        
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Ingrese nombew de animal: " );
//		String nombre = sc.nextLine();	
//		Perro.setNombre(nombre);
//		
//		System.out.println("Nombre del perro :" + Perro.getNombre());


	}
}