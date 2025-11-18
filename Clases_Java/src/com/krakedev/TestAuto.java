package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar 2 autos y referenciarlos con las variables auto1 y auto2
				Auto auto1 = new Auto();
				Auto auto2 = new Auto();
				
				//modificar los valores de los atributos de cada auto
				auto1.setMarca("HYUNDAI");
				auto1.setAnio(2000);
				auto1.setPrecio(1500);
				
				auto2.setMarca("PAGANI");
				auto2.setAnio(1995);
				auto2.setPrecio(2500);
				
				//mostrar los valores de los atributos de los autos en consola
				System.out.println("**********AUTO 1**********");
				System.out.println("Marca: " + auto1.getMarca());
				System.out.println("Anio: "+ auto1.getAnio());
				System.out.println("Precio: "+ auto1.getPrecio());
				System.out.println("**********AUTO 2**********");
				System.out.println("Marca: " + auto2.getMarca());
				System.out.println("Anio: " + auto2.getAnio());
				System.out.println("Precio: " + auto2.getPrecio());
	}

}
