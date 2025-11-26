package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tel1 = new Telefono("tuenti","0984662390",15);
		Contacto c1 = new Contacto("Juanito","Alcachofa",tel1,60.30);
		AdminContactos ac = new AdminContactos();

		
		System.out.println("Nombre: " +c1.getNombre() + " "+ c1.getApellido());
		System.out.println("Operadora: " + tel1.getOperadora());
		System.out.println("Numero: " +tel1.getNumero());
		System.out.println("Codigo: " + tel1.getCodigo());
		System.out.println("Tiene whatsapp: " + tel1.isTieneWhatsapp());
		System.out.println("Peso: " + c1.getPeso());
		System.out.println("Activo: " +c1.isActivo());
		System.out.println("*************************");
		//tel1.setTieneWhatsapp(true);
		ac.activarUsuario(c1);
		System.out.println("Nombre: " +c1.getNombre() + " "+ c1.getApellido());
		System.out.println("Operadora: " + tel1.getOperadora());
		System.out.println("Numero: " +tel1.getNumero());
		System.out.println("Codigo: " + tel1.getCodigo());
		System.out.println("Tiene whatsapp: " + tel1.isTieneWhatsapp());
		System.out.println("Peso: " + c1.getPeso());
		System.out.println("Activo: " +c1.isActivo());
		
		
		
		
		
		
	}

}
