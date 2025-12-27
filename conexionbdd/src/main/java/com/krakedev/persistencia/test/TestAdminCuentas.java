package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.servicios.AdminCuentas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuentas ct = new Cuentas("22157","09946");
		Cuentas cta = new Cuentas();
		String cuentaEliminar = "25571";
		
		//probar insertar
		try {
			Date fechaCr = Convertidor.convertirDate("1995/06/23");
			ct.setFecha_creacion(fechaCr);
			ct.setSaldo(new BigDecimal(3500.45));

			AdminCuentas.insertar(ct);
			System.out.println("Cuenta agregada exitosamente...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		//probar actualizar
		cta.setNumero_cuenta("25569");
		cta.setCedula_propietario("09961");
		Date fechaCr;
		try {
			fechaCr = Convertidor.convertirDate("2005/10/25");
			cta.setFecha_creacion(fechaCr);
			cta.setSaldo(new BigDecimal(4500.00));
			AdminCuentas.actualizar(cta);
			System.out.println("Actualizado exitosamente...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
		//probar eliminar
		try {
			AdminCuentas.eliminar(cuentaEliminar);
			System.out.println("Eliminado exitosamente...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el test de eliminación: " + e.getMessage());
		}
	}

}
