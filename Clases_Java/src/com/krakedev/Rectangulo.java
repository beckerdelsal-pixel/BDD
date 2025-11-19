package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	
	public Rectangulo(int base,int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public int calcularArea() {
		int area = 0;
		area = base * altura;
		return  area;
	}
	
	public int calcularPerimetro() {
		int perimetro = 0;
		perimetro = (base + altura) * 2;
		return perimetro;
	}
}
