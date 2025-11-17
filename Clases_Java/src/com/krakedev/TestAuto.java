package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar 2 autos y referenciarlos con las variables auto1 y auto2
				Auto auto1 = new Auto();
				Auto auto2 = new Auto();
				
				//modificar los valores de los atributos de cada auto
				auto1.marca = "HYUNDAI";
				auto1.anio = 2000;
				auto1.precio = 1555;
				
				auto2.marca = "PAGANI";
				auto2.anio = 1995;
				auto2.precio = 2590;
				
				//mostrar los valores de los atributos de los autos en consola
				System.out.println("**********AUTO 1**********");
				System.out.println("Marca: " + auto1.marca);
				System.out.println("Anio: "+ auto1.anio);
				System.out.println("Precio: "+ auto1.precio);
				System.out.println("**********AUTO 2**********");
				System.out.println("Marca: " + auto2.marca);
				System.out.println("Anio: " + auto2.anio);
				System.out.println("Precio: " + auto2.precio);
	}

}
