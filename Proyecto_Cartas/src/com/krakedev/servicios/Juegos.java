package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Jugadores;
import com.krakedev.entidades.Naipe;

public class Juegos {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores; // arraylist anidado
	private ArrayList<Carta> barajeado;
	private ArrayList<String> nombreJugadores;

	public Juegos() {
		this.naipe = new Naipe();
		this.barajeado = new ArrayList<>();
		this.barajeado = this.naipe.barajar();
		this.cartasJugadores = new ArrayList<>();
		this.nombreJugadores = new ArrayList<>();

	}

	public Juegos(ArrayList<String> idJugadores) {
		naipe = new Naipe();
		this.barajeado = this.naipe.barajar();
		this.cartasJugadores = new ArrayList<>();
		this.nombreJugadores = idJugadores;
		for (int i = 0; i < idJugadores.size(); i++) {
			ArrayList<Carta> mazo = new ArrayList<>();
			this.cartasJugadores.add(mazo);
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int entregarCartasPorJugador) {
		// validaciones para evitar un nullPointerException
		if (barajeado == null) {
			System.out.println("Naipe no ha sido barajeado");
		}
		int numeroJugadores = cartasJugadores.size();
		if (numeroJugadores == 0) {
			System.out.println("Error, no hay jugadores en la mesa");
		}

		int cartasEntrega = 0;
		// en estos for no se usa el ".size" debido a que son tipos de datos primitivos
		for (int c = 0; c < entregarCartasPorJugador; c++) {
			for (int j = 0; j < numeroJugadores; j++) {
				if (barajeado != null) {
					if (cartasEntrega < barajeado.size()) {
						Carta entregar = barajeado.get(cartasEntrega);
						cartasJugadores.get(j).add(entregar);
						cartasEntrega++;
					} else {
						System.out.println("Ya no hay cartas en el mazo...");
					}
				}

			}
		}
	}

	public String determinarGanador() {
		
		if (cartasJugadores.isEmpty() || nombreJugadores == null || nombreJugadores.isEmpty()) {
            return "Nadie";
        }
		
		int idGanador = 0;
		int sumaGanador = devolverTotal(0);

		for (int i = 1; i < cartasJugadores.size(); i++) {
			
			int sumaN = devolverTotal(i);

			if (sumaN >= sumaGanador) {
				sumaGanador = sumaN;
				idGanador = i;
			}
		}

		return nombreJugadores.get(idGanador);

	}

	public int devolverTotal(int idJugador) {
		ArrayList<Carta> mano = cartasJugadores.get(idJugador);
		int total = 0;
		for (int i = 0; i < mano.size(); i++) {
			total += mano.get(i).getValor();
		}
		return total;
	}
}
