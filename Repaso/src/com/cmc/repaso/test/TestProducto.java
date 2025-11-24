package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pro1 = new Producto("Alambre de Puas", 5.50);
		pro1.setNombre("Chaqueta de Cuero Real");
		pro1.setPrecio(-800);
		
		double precio_Final = pro1.calcularPrecioPromo(10);
		
		System.out.println("PRECIO: $"+precio_Final);
		
	}

}
