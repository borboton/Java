package vista;

import java.util.ArrayList;

import modelo.Auto;
import modelo.Diesel;
import modelo.Vehiculo;
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
//		vc.creoVehiculo(TipoVehiculo.AUTO);
		
		vc.insertoVehiculoLista(vc.creoVehiculo(TipoVehiculo.MOTO));
		
		for (Object item : vehiculoLista) {
			//instance of 
			System.out.println(item.getClass());

			if(item.getClass().getSimpleName().equals("Auto")) {

				System.out.println("entramos en el fin del demonio");
				((Auto)((Vehiculo)item)).doblar();

			}

			if (item instanceof Vehiculo) {

				Vehiculo objVehiculo = (Vehiculo) item;

				objVehiculo.endender(new Diesel());

				((Auto)((Vehiculo)item)).doblar();
				((Auto)objVehiculo).doblar();;

			}
		}
	}
}