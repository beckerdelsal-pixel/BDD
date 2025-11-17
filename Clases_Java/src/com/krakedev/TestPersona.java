package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p;//1. declarar una variable de tipo persona
		Persona p2 = new Persona();
		p = new Persona(); //se esta instanciando un objeto persona y referenciandolo con p
		//declaracion de valores en las variables
		//modificar los atributos
		
		p.nombre="Mario";
		p.edadPersona=45;
		p.estatura=1.85;
		
		p2.nombre="Angelina";
		p2.edadPersona=25;
		p2.estatura=1.70;
		
		
		System.out.println("HOLA MUNDO");
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edadPersona);
		System.out.println("Estatura: " + p.estatura);
		
		
		
		
		
		System.out.println("HOLA MUNDO");
		System.out.println("Nombre: " + p2.nombre);
		System.out.println("Edad: " + p2.edadPersona);
		System.out.println("Estatura: " + p2.estatura);
		
	}

}
