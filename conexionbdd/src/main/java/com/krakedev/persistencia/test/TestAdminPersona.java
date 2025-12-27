package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;
//System.out.println solo se podra usar en los test
public class TestAdminPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstadoCivil ec = new EstadoCivil("U","Union Libre");
		Persona p = new Persona("1752466990","Julio","Jaramillo",ec);
		try {
			Date fechaNa = Convertidor.convertirDate("2000/12/23");
			Date horaNa = Convertidor.convertirTime("12:23");
			p.setFecha_nacimiento(fechaNa);
			p.setHora_nacimiento(horaNa);
			p.setCantidad_ahorrada(new BigDecimal(1230.45));
			p.setNumero_hijos(50);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
	}

}
