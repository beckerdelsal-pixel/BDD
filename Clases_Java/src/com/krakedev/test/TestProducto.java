package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear 3 variables de tipo producto
		Producto productoA;
		Producto productoB;
		Producto productoC;
		// instanciar 3 objetos de producto y referenciarlo con las variables anteriores
		productoA = new Producto("Ciprofloxacina","Medicamento para las infecciones y parasitos", 5.50, 50);
		productoB = new Producto("Paracetamol","Medicamento para el malestar",11.60,50);
		productoC = new Producto("Omeprazol","Medicamento para acidez estomacal",6.50,50);
		// modificar los atributos de cada producto
		/*productoA.setNombre("Ciprofloxacina");
		productoA.setDescripcion("Medicamento para las infecciones y parasitos");
		productoA.setPrecio(5.50);
		productoA.setStockActual(50);
		productoB.setNombre("Paracetamol");
		productoB.setDescripcion("Medicamento para el malestar");
		productoB.setPrecio(11.60);
		productoB.setStockActual(50);
		productoC.setNombre("Omeprazol");
		productoC.setDescripcion("Medicamento para acidez estomacal");
		productoC.setPrecio(6.50);
		productoC.setStockActual(50);*/
		// mostrar en pantalla los valores de los productos
		System.out.println("**********Producto 1**********");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Actual: " + productoA.getStockActual());
		System.out.println("**********Producto 2**********");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Actual: " + productoB.getStockActual());
		System.out.println("**********Producto 3**********");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Actual: " + productoC.getStockActual());
	}

}
