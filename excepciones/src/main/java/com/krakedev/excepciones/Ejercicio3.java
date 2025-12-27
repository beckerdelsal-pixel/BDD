package com.krakedev.excepciones;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {
	public static final Logger logger = LogManager.getLogger(Ejercicio3.class) ;
	
	
	public void metodo1() {
		String a = null;
		try {	
		a.substring(0);//checked - IOException
		}catch(Exception ex) {
			System.out.println("Error...");
			logger.error("Obtener resultado subcadena...",ex);
		}
	}
	
	public static void main(String[] args) {
		Ejercicio3 ej3 = new Ejercicio3();
		ej3.metodo1();
	}
}
