package com.cmc.directorio.test;


import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi","0994123420",50);
		
		Contacto c = new Contacto("Juanito","Alcachofa",telf,50.20);
		
		
		
		System.out.println("*************************");
		System.out.println("\n Nombres: " + c.getNombre() + " "+ c.getApellido());
		System.out.println("\n Activo: " + c.isActivo());
		System.out.println("\n Operadora: " + telf.getOperadora());
		System.out.println("\n Numero: " + telf.getNumero());
		System.out.println("\n Peso: " +c.getPeso());
		System.out.println("\n*************************");
		
		
	}

}
