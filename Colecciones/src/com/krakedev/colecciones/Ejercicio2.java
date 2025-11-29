package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Leo","Messi"));
		personas.add(new Persona("Alan","Brito"));
		personas.add(new Persona("Susana","Horia"));
	
		System.out.println(personas.size());
		Persona elementoP;
		for(int i=0;i<personas.size();i++) {
			elementoP = personas.get(i);
			System.out.println("Nombre: " + elementoP.getNombre() + " " + elementoP.getApellido());
		}
		
	}

}
