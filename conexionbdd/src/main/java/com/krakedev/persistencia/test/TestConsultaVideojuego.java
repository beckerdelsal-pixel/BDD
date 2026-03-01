package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Videojuego;
import com.krakedev.persistencia.servicios.AdminVideojuegos;

public class TestConsultaVideojuego {
	
	public static void main(String[] args) {
		try {
			ArrayList<Videojuego> juego = AdminVideojuegos.buscarPorValoracion(90);
			System.out.println(juego);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
