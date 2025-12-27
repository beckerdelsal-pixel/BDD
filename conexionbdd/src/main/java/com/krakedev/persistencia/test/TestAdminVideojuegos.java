package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Videojuego;
import com.krakedev.persistencia.servicios.AdminVideojuegos;

public class TestAdminVideojuegos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Videojuego vdi = new Videojuego(12,"Counter Strike","Juego shouter parecido al cod pero con menos graficos",95);
		Videojuego vda = new Videojuego(10,"Need for Speed","Juego de carreras de autos y persecuciones de alta velocidad",100);
		int codigoEliminar = 9;
		//probar insertar
		
		try {
			AdminVideojuegos.insertar(vdi);
			System.out.println("Videojuego agregado a la lista de deseos...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		//probar actualizar
		try {
			AdminVideojuegos.actualizar(vda);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		// probar eliminar
		try {
			AdminVideojuegos.eliminar(codigoEliminar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}

}
