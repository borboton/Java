package vista;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import modelo.TipoVehiculo;
import controlador.VehiculoControlador;

public class Main {

	public static void main(String[] args) {
		
		VehiculoControlador vc = new VehiculoControlador();
		
		
		ArrayList vehiculoLista = new ArrayList(); 
//		
//		
		vehiculoLista.add(vc.creoVehiculo(TipoVehiculo.AUTO));
		vehiculoLista.add("Holaa indice de array");
		
//		vehiculoLista.add("Holaa indice de array");
//		vehiculoLista.add(2);
//		vehiculoLista.add(2.2);
//		
//		vc.creoVehiculo(TipoVehiculo.AUTO);
		
		vc.insertoVehiculoLista(vc.creoVehiculo(TipoVehiculo.MOTO));
		
		

		for (Object item : vehiculoLista) {
		
			System.out.println(vc.devuelvoVehiculoxPosicion(0).getClass());
			System.out.println(vc.devuelvoVehiculoxPosicion(1).getClass());
			
		}

	}
}