package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	
	public AdminPersonas() {
		// TODO Auto-generated constructor stub
		personas = new ArrayList<Persona>();
	}


	public void agregar(Persona persona) {
		personas.add(persona);
	}
	
	public void imprimir() {
		Persona elementoP;
		for(int i = 0; i<personas.size();i++) {
			elementoP = personas.get(i);
			System.out.println("Persona: " +elementoP.getNombre() + " " +elementoP.getEdad());
		}
	}
	
	public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada=null;
		Persona elementoP = null;
		for(int i=0;i<personas.size();i++) {
			elementoP = personas.get(i);
			if(nombre.equals(elementoP.getNombre())) {
				personaEncontrada = elementoP;
			}
		}
			
			
		return personaEncontrada;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores = new ArrayList<>();
		Persona elementoP = null;
		for(int i=0; i<personas.size();i++) {
			elementoP = personas.get(i);
			if(elementoP.getEdad()>edad) {
				mayores.add(elementoP);
			}
		}
		return mayores;
	}
}
