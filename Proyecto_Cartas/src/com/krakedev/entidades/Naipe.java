package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		super();
		this.numerosPosibles = new ArrayList<>();
		this.cartas = new ArrayList<>();

		this.numerosPosibles.add(new Numero("A", 11));
		this.numerosPosibles.add(new Numero("2", 2));
		this.numerosPosibles.add(new Numero("3", 3));
		this.numerosPosibles.add(new Numero("4", 4));
		this.numerosPosibles.add(new Numero("5", 5));
		this.numerosPosibles.add(new Numero("6", 6));
		this.numerosPosibles.add(new Numero("7", 7));
		this.numerosPosibles.add(new Numero("8", 8));
		this.numerosPosibles.add(new Numero("9", 9));
		this.numerosPosibles.add(new Numero("10", 10));
		this.numerosPosibles.add(new Numero("J", 10));
		this.numerosPosibles.add(new Numero("Q", 10));
		this.numerosPosibles.add(new Numero("K", 10));

		Palos paloComb = new Palos();
		// se crea un arreglo para obtener los get de los atributos de nuestro objeto de
		// clase Palos
		String[] palos = new String[] { paloComb.getCorazonRojo(), paloComb.getCorazonNegro(), paloComb.getDiamante(),
				paloComb.getTrebol() };
		// recorremos el arreglo creado, para que se esta manera podamos combinar los
		// numeros posibles
		for (int p = 0; p < palos.length; p++) {
			String palo = palos[p];//lo que obtenemos en cada iteracion se va guardando secuencialmente en "palo"

			for (int i = 0; i < numerosPosibles.size(); i++) {//ahora recorremos la lista de numeros posibles

				Numero num = numerosPosibles.get(i);//obtenemos su posicion en cada recorrido y la guardamos en la variable num
				Carta nuevaCarta = new Carta(num, palo);//con lo ya obtenido, creamos una carta de tipo carta pasandole los parametros solicitados y guardandolos en una variable
				cartas.add(nuevaCarta);//al final, guardamos esta variable como una nueva carta ya combinada con todos los elementos

			}
		}
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public ArrayList<Carta> barajar(){
		int posicion;
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		for(int i=0;i<100;i++) {
			posicion = Random.obtenerPosicion();
			Carta cartaObtenida = this.cartas.get(posicion);
			if("N".equals(cartaObtenida.getEstado())) {
				auxiliar.add(cartaObtenida);
				cartaObtenida.setEstado("C");
			}
		}
		
		for(int i=0;i<cartas.size();i++) {
			Carta restante = cartas.get(i);
			if("N".equals(restante.getEstado())) {
				auxiliar.add(restante);
			}
		}
		return auxiliar;
	}

}
