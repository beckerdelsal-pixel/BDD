package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu1 = new Calculadora();
		Calculadora calcu2 = new Calculadora();
		int resultadoSuma;
		resultadoSuma = calcu1.sumar(5, 3);
		System.out.println("**********SUMA**********");
		System.out.println("Resultado Suma: " + resultadoSuma);
		int resultadoResta;
		resultadoResta = calcu2.restar(10, 3);
		System.out.println("**********RESTA**********");
		System.out.println("Resultado Resta: " + resultadoResta);
		//prueba multiplicar
		double resultadoMultiplicacion;
		resultadoMultiplicacion = calcu1.multiplicar(10, 5);
		System.out.println("**********MULTIPLICACION**********");
		System.out.println("Resultado Multiplicar: " + resultadoMultiplicacion);
		//prueba dividir
		double resultadoDivision;
		resultadoDivision = calcu1.dividir(10, 2);
		System.out.println("**********DIVISION**********");
		System.out.println("Resultado Dividir: " + resultadoDivision);
		//prueba promediar
		double resultadoPromedio;
		resultadoPromedio = calcu2.promediar(10, 8, 9);
		System.out.println("**********PROMEDIOS**********");
		System.out.println("Resultado Promediar: " + resultadoPromedio);
		//prueba mostrarResultado
		System.out.println("**********MOSTRAR RESULTADO MENSAJE**********");
		calcu2.mostrarResultado();

	}

}
