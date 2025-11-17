package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear 3 variables de tipo producto
		Producto productoA;
		Producto productoB;
		Producto productoC;
		// instanciar 3 objetos de producto y referenciarlo con las variables anteriores
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		// modificar los atributos de cada producto
		productoA.nombre = "Ciprofloxacina";
		productoA.descripcion = "Medicamento para las infecciones y parasitos";
		productoA.precio = 5.50;
		productoA.stockActual = 50;
		productoB.nombre = "Paracetamol";
		productoB.descripcion = "Medicamento para el malestar";
		productoB.precio = 11.60;
		productoB.stockActual = 50;
		productoC.nombre = "Omeprazol";
		productoC.descripcion = "Medicamento para acidez estomacal";
		productoC.precio = 6.50;
		productoC.stockActual = 50;
		// mostrar en pantalla los valores de los productos
		System.out.println("**********Producto 1**********");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock Actual: " + productoA.stockActual);
		System.out.println("**********Producto 2**********");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock Actual: " + productoB.stockActual);
		System.out.println("**********Producto 3**********");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock Actual: " + productoC.stockActual);
	}

}
