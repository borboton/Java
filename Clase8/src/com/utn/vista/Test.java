package com.utn.vista;

import java.util.ArrayList;

import com.utn.controlador.VehiculoControlador;
import com.utn.modelo.Auto;
import com.utn.modelo.Diesel;
import com.utn.modelo.Motor;
import com.utn.modelo.TipoVehiculo;
import com.utn.modelo.Vehiculo;

public class Test {

	public static void main(String[] args) {
		VehiculoControlador vc = new VehiculoControlador();

		Motor diesel = new Diesel();


		Vehiculo[] vecLista = new Vehiculo[5];

		vecLista[0]= vc.creoVehiculo(TipoVehiculo.AUTO);
		vecLista[1]= vc.creoVehiculo(TipoVehiculo.MOTO);

		vecLista[0].encender(diesel);

		//listas 
		//dos tipos de listas -- 1) generica -- 2)tipada

		ArrayList  vehiculoLista = new ArrayList();

		vehiculoLista.add("Hola mundo");
		vehiculoLista.add(vc.creoVehiculo(TipoVehiculo.AUTO));
		vehiculoLista.add(1234);

		//foreach 
		for (Object item : vehiculoLista) {
			//instance of 

			System.out.println(item.getClass());

			if(item.getClass().getSimpleName().equals("Auto")) {
				System.out.println("entramos en el fin del demonio");
				((Auto)((Vehiculo)item)).doblar();

			}

			if (item instanceof Vehiculo) {
				Vehiculo objVehiculo = (Vehiculo) item;
				objVehiculo.encender(new Diesel());

				((Auto)((Vehiculo)item)).doblar();

				((Auto)objVehiculo).doblar();;


			}

		}



		try {
			vc.devuelvoVehiculoxPosicion(10).encender();;
		} catch (Exception e) {
			System.out.println("Hugo un error");
		}
		System.out.println("Fin de la ejecucion");

	}
}
