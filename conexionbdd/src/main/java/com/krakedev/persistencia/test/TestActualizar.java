package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("C","Casado");
		Persona p = new Persona("0985667850","Adolf","Hitler",ec);
		
		try {
			Date fechaNa = Convertidor.convertirDate("2005/06/29");
			Date horaNa = Convertidor.convertirTime("12:20");
			p.setFecha_nacimiento(fechaNa);
			p.setHora_nacimiento(horaNa);
			p.setCantidad_ahorrada(new BigDecimal(150.35));
			p.setNumero_hijos(1);
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
	}

}
