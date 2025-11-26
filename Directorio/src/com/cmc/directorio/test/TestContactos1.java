package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi","0994123420",50);
		Telefono telf2 = new Telefono("movi","0984662390",70);
		Contacto c = new Contacto("Juanito","Alcachofa",telf,50.20);
		Contacto c2 = new Contacto("Señor","Maya",telf2,45.70);
		AdminContactos ac = new AdminContactos();
		
		System.out.println("*************************");
		Contacto retornado = ac.buscarMasPesado(c, c2);
		System.out.println("Nombre: "+ retornado.getNombre() + " " + retornado.getApellido());
		System.out.println("Numero: " +retornado.getTelefono().getNumero());
		System.out.println("Peso: "+ retornado.getPeso());
		System.out.println("*************************");
		System.out.println("¿Tienen la misma operadora?");
		System.out.println(ac.compararOperadoras(c, c2));
		System.out.println("*************************");
	}

}
