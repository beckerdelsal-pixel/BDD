package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item it1 = new Item();
		it1.setNombre("Agujas");
		it1.setProductosActuales(20);
		//it1.imprimir();
		
		it1.vender(10);
		//it1.imprimir();
		
		it1.devolver(5);
		it1.imprimir();
		
		Item it2 = new Item();
		it2.setNombre("Camisetas");
		
		it2.setProductosActuales(100);
		//it2.imprimir();
		
		it2.vender(55);
		it2.vender(20);
		//it2.imprimir();
		
		it2.devolver(47);
		it2.imprimir();
		
	}

}
