package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p;//1. declarar una variable de tipo persona
		Persona p2 = new Persona();
		p = new Persona(); //se esta instanciando un objeto persona y referenciandolo con p
		
		Persona p3 = new Persona("Pablo");
		Persona p4 = new Persona("Rocio",43,1.60);
		
		System.out.println("Nombre: " + p4.getNombre());
		System.out.println("Edad: " + p4.getEdadPersona());
		System.out.println("Estatura: " + p4.getEstatura());
		//declaracion de valores en las variables
		//modificar los atributos
		
		p.setNombre("Mario");
		p.setEdadPersona(45);
		p.setEstatura(1.85);
		
		p2.setNombre("Angelina");
		p2.setEdadPersona(25);
		p2.setEstatura(1.70);
		
		
		System.out.println("HOLA MUNDO");
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdadPersona());
		System.out.println("Estatura: " + p.getEstatura());
		
		
		
		
		
		System.out.println("HOLA MUNDO");
		System.out.println("Nombre: " + p2.getNombre());
		System.out.println("Edad: " + p2.getEdadPersona());
		System.out.println("Estatura: " + p2.getEstatura());
		
	}

}
