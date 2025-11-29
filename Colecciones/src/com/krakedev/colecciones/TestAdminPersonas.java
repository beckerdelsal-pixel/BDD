package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersonas adm = new AdminPersonas();
		adm.agregar(new Persona("Gustavo","Cerati",54));
		adm.agregar(new Persona("Axl","Rose",65));
		adm.agregar(new Persona("Steven","Tyler",60));
		adm.agregar(new Persona("Avril","Lavigne",48));
		adm.imprimir();
		
		Persona p1 = adm.buscarPorNombre("Josefino");
		if(p1 != null) {
			System.out.println("La persona buscada es: " + p1.getApellido() + " "+p1.getEdad());
		}else {
			System.out.println("No existe la persona con el nombre indicado.");
		}
		
		ArrayList<Persona> personasMayores = adm.buscarMayores(50);
		//for(int i=0; i<personasMayores.size();i++) {
			System.out.println("Personas Mayores: " + personasMayores.size());
		
	}
	
	

}
