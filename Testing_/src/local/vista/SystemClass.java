package local.vista;

import java.io.IOException;

public class SystemClass {

	private String comando;
	private char[] datos = new char[2];
	
	
	public void cualquierCosa(String comando) throws IOException   {
		
		try {

			Runtime.getRuntime().exec(comando);

		} catch (Exception e) {

			System.out.println("error : " + e.getMessage());
		}
	
		
	}
	
	public void asciiConverter() {
		
	}
	
	
	
}
