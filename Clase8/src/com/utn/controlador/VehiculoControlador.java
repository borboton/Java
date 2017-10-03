package com.utn.controlador;

import com.utn.modelo.Auto;
import com.utn.modelo.Moto;
import com.utn.modelo.TipoVehiculo;
import com.utn.modelo.Vehiculo;

public class VehiculoControlador {


	private Vehiculo[] vecLista = new Vehiculo[5];
	private int cont=0;
	
	public Vehiculo devuelvoVehiculoxPosicion(int index) {
		if(vecLista.length< index) {
			return vecLista[index];
			
		}else
			return null;
		
	}
	
	public void insertoVehiculoLista(Vehiculo vehi) {
		vecLista[cont]=vehi;
		cont++;
	}
	
	public Vehiculo creoVehiculo(TipoVehiculo vehiculo) {
		
		Vehiculo vehi = null;
		switch (vehiculo) {
		case AUTO:
			vehi= new Auto("Toyota","Corolla","Rojo");
			break;
		case MOTO:
			vehi = new Moto();
			break;
		}
		return vehi;
	}
	public Vehiculo creoVehiculo() {
		return new Auto();
	}
	public Vehiculo creoVehiculoAuto() {
		Vehiculo v = new Auto();
		return v;
	}
	public Vehiculo creoVehiculoMoto() {
		Vehiculo v = new Moto();
		return v;
	}
}
