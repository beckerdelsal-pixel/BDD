package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto mc;
		AdminProducto admin = new AdminProducto();
		Producto a = new Producto("Doritos", 0.75);
		Producto b = new Producto("Papitas", 0.50);

		mc = admin.buscarMasCaro(a, b);
		if (mc == null) {
			System.out.println("Ambos productos son iguales en precio");
		} else
			System.out.println("El producto mas caro entre los mencionados es: " + mc.getNombre());
	}
}
