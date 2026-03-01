package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.servicios.AdminCuentas;

public class TestConsultaClavePrimariaCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Cuentas cuenta = AdminCuentas.buscarPorNumeroCuenta("25569");
			System.out.println(cuenta);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
