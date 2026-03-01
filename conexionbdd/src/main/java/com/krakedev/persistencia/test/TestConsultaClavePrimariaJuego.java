package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Videojuego;
import com.krakedev.persistencia.servicios.AdminVideojuegos;

public class TestConsultaClavePrimariaJuego {

	public static void main(String[] args) {
		try {
			Videojuego juego = AdminVideojuegos.buscarPorCodigo(10);
			System.out.println(juego);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
