package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validador val1 = new Validador();
		val1.validarEdad(10);
		val1.validarEdad(20);
		val1.validarEdad(18);
		val1.validarEdad(-5);
		val1.validarEdad(15);
	}

}
