package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.servicios.AdminCuentas;

public class TestConsultaCuentas {

	public static void main(String[] args) {
		try {
			ArrayList<Cuentas> cuenta = AdminCuentas.buscarPorSaldo(new BigDecimal("4500"));
			System.out.println(cuenta);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
