package controlador;

import modelo.Auto;
import modelo.Vehiculo;
import vista.Moto;

public class vehiculoControlador {
	
	
	public Vehiculo creoVehiculo(TipoVehiculo vehiculo) {
		
		switch (vehiculo) {
		case MOTO:
			
			new Moto();
		
			break;
		case AUTO:
			
			new Auto();
			
			break;
		
		default:
			break;
		}
		return null;
	
		
	}


}
