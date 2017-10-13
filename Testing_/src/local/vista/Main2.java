package local.vista;

import java.io.IOException;
import java.util.ArrayList;

import javax.print.attribute.IntegerSyntax;

public class Main2 {

	public static void main(String[] args) throws IOException {
	
		SystemClass sc = new SystemClass();
//		ArrayList<int> asciiChar = new ArrayList<int>();
		ArrayList asciiChar = new ArrayList();

		//cadena = 
		//118.112.110.45.112.101.114.115.111.110.97.108.45.99.111.110.116.114.111.108.45.119.105.102.105//
		asciiChar.add(65);
		asciiChar.add(65);
		asciiChar.add(102);
			
		for (Object item : asciiChar) {
			
			try {
				
				
				System.out.println(item);
					
			} catch (Exception e) {
				
				System.out.println(e.getLocalizedMessage());
			}
			
			
		}
		

	
	}

}
