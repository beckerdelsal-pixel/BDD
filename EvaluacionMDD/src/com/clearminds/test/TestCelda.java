package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		Producto producto=new Producto("KE34","Papitas",0.85);
		celda.setProducto(producto);
		System.out.println("CELDA:"+celda.getCodigo());
		//System.out.println(celda.getProducto().getNombre());
		System.out.println("*************************************");
		
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("Codigo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}
