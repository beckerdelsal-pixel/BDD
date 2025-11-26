package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Telefono telf1 = new Telefono("claro","0994123420",10);
			Telefono telf2 = new Telefono("movi","0927586990",30);
			Telefono telf3 = new Telefono("claro","0984662390",40);
			Telefono telf4 = new Telefono("movi","0922144266",50);
			AdminTelefono at = new AdminTelefono();
			
			System.out.println("*************************");
			int totalClaro = at.contarClaro(telf1, telf2, telf3, telf4);
			System.out.println("Operadoras Claro: " + totalClaro);
			System.out.println("*************************");
			
	}

}
