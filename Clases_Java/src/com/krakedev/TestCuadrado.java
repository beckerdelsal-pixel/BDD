package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar objetos
		Cuadrado cua1 = new Cuadrado();
		Cuadrado cua2 = new Cuadrado();
		Cuadrado cua3 = new Cuadrado();
		cua1.lado = 4;
		System.out.println("-------------------------");
		double area1 = cua1.calcularArea();
		double perimetro1 = cua1.calcularPerimetro();
		System.out.println("\n Area Cuadrado 1: " + area1);
		System.out.println("Perimetro Cuadrado 1: " + perimetro1);
		cua2.lado = 6;
		System.out.println("-------------------------");
		double area2 = cua2.calcularArea();
		double perimetro2 = cua2.calcularPerimetro();
		System.out.println("\n Area Cuadrado 2: " + area2);
		System.out.println("Perimetro Cuadrado 2: " + perimetro2);
		cua3.lado = 8;
		System.out.println("-------------------------");
		double area3 = cua3.calcularArea();
		double perimetro3 = cua3.calcularPerimetro();
		System.out.println("\n Area Cuadrado 3: " + area3);
		System.out.println("Perimetro Cuadrado 3: " + perimetro3);
	}

}
