package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion validar1 = new Validacion();
		validar1.validarMonto(500.50);
		validar1.validarMonto(0);
	}

}
