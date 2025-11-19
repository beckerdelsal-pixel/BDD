package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// 
		Rectangulo r1 = new Rectangulo(10,5);
		Rectangulo r2 = new Rectangulo(8,3);
		//r1.base = 10;
		//r1.altura = 5;
		
		int area = r1.calcularArea();
		System.out.println("Area: " + area);
		
		int perimetro = r1.calcularPerimetro();
		System.out.println("Perimetro: " + perimetro);
		
		//r2.base = 8;
		//r2.altura = 3;
		
		int area2 = r2.calcularArea();
		System.out.println("Area: " + area2);
		
		int perimetro2 = r2.calcularPerimetro();
		System.out.println("Perimetro: " + perimetro2);
		
		
	}

}
