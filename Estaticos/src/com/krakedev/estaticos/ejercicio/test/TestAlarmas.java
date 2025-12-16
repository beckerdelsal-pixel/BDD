package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiasSemana ds = new DiasSemana();
		
		AdminAlarmas adma = new AdminAlarmas();
		adma.agregarAlarma(new Alarma(DiasSemana.LUNES,5,45));
		adma.agregarAlarma(new Alarma(DiasSemana.MARTES,21,30));
		adma.agregarAlarma(new Alarma(DiasSemana.MIERCOLES,10,25));
		adma.agregarAlarma(new Alarma(DiasSemana.JUEVES,8,40));
		adma.agregarAlarma(new Alarma(DiasSemana.VIERNES,12,00));
		adma.agregarAlarma(new Alarma(DiasSemana.SABADO,7,15));
		adma.agregarAlarma(new Alarma(DiasSemana.DOMINGO,6,50));
		ArrayList<Alarma>  alarmasActuales = adma.getAlarmas();
		
		System.out.println(alarmasActuales);
	}

}
