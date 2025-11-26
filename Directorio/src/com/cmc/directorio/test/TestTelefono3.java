package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf2 = new Telefono("movi","0927586990",30);
		Telefono telf3 = new Telefono("claro","0984662390",40);
		Telefono telf4 = new Telefono("movi","0922144266",50);
		AdminTelefono at = new AdminTelefono();
		
		System.out.println("*************************");
		int totalMovi = at.contarMovi(telf4, telf2, telf3);
		System.out.println("Operadoras movi: " + totalMovi);
		System.out.println("*************************");
	}

}
