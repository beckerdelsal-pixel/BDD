package com.cmc.repaso.entidades;

public class Validacion {
	
	public boolean validarMonto(double monto) {
		if (monto >0) {
			System.out.println("monto valido");
			return true;
		}else {
			System.out.println("monto no valido");
			return false;
		}
	}
}
