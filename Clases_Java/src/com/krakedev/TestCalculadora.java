package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu1 = new Calculadora();
		Calculadora calcu2 = new Calculadora();
		int resultadoSuma;
		resultadoSuma = calcu1.sumar(5, 3);
		System.out.println("Resultado Suma: " + resultadoSuma);
		int resultadoResta;
		resultadoResta = calcu2.restar(10, 3);
		System.out.println("Resultado Resta: " + resultadoResta);
		

	}

}
