package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		p1.setNombre("Romario");
		p1.setApellido("Meneses");
		
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Av siempre viva");
		dir.setCalleSec("Av nunca muerta");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		System.out.println(nombre);
		//d1 esta null y se trata invocar un metodo con dicha variable
		System.out.println(d1.getCallePrincipal());
		
		//si tenemos algun apuntador que este en null y sobre ese se llama a algun metodo se llega a causar las excepciones
		// ejemplo: null.algunmetodo();
		
		p1.imprimir();
		
		Persona p2 = new Persona();
		p2.setNombre("Becker");
		Direccion d2 = new Direccion("Av Montecristi","Santo Domingo","45-N O");
		p2.setDireccion(d2);
		p2.imprimir();
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("xx", "yy", "123"));
		p3.imprimir();
		
		
	}

}
