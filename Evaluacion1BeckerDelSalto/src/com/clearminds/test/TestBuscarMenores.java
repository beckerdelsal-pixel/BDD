package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));
        
        Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "B1", 6);
		
		Producto producto3=new Producto("F597","Galak",1.50);
		maquina.cargarProducto(producto3, "C1", 4);
		
		Producto producto4=new Producto("J432","Tatos",0.25);
		maquina.cargarProducto(producto4, "A2", 6);
		
		Producto producto5=new Producto("Q522","Chococake",0.90);
		maquina.cargarProducto(producto5, "B2", 4);
		
		Producto producto6=new Producto("H008","Galleta Amor",1.51);
		maquina.cargarProducto(producto6, "C2", 6);
		
		
		
		ArrayList<Producto> product = maquina.buscarMenores(0.85);
		System.out.println("Productos con menores precios: " + product.size());
	}

}
