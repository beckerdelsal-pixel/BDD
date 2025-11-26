package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi","099412342",10);
		
		System.out.println("*************************");
		System.out.println("Operadora: " + telf.getOperadora());
		System.out.println("Numero: " + telf.getNumero());
		System.out.println("Codigo: " + telf.getCodigo());
		System.out.println("Tiene Whatsapp:" + telf.isTieneWhatsapp());
		System.out.println("*************************");

	}

}
