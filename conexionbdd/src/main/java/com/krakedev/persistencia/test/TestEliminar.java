package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cedulaAEliminar = "1732268934";
        try {
            // Llamamos al método estático con la cédula
            AdminPersonas.eliminar(cedulaAEliminar);
        } catch (Exception e) {
            System.out.println("Error en el test de eliminación: " + e.getMessage());
        }
	}

}
