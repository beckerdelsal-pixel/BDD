package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	public static String formatearHora(int valor) {
		String num = valor + "";

		if (valor < 10) {
			return "0" + num;
		} else {
			return num;
		}
	}

	public static String formatearDia(int valor) {
		String diaFormateado = "";

		// Retorna el String equivalente del entero [cite: 37]
		if (valor == DiasSemana.LUNES) { // 0
			diaFormateado = "Lunes";
		} else if (valor == DiasSemana.MARTES) { // 1
			diaFormateado = "Martes";
		} else if (valor == DiasSemana.MIERCOLES) { // 2
			diaFormateado = "Miércoles";
		} else if (valor == DiasSemana.JUEVES) { // 3
			diaFormateado = "Jueves";
		} else if (valor == DiasSemana.VIERNES) { // 4
			diaFormateado = "Viernes";
		} else if (valor == DiasSemana.SABADO) { // 5
			diaFormateado = "Sábado";
		} else if (valor == DiasSemana.DOMINGO) { // 6
			diaFormateado = "Domingo";
		}
		return diaFormateado;
	}

}
