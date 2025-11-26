package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf1) {
		if(telf1.getOperadora() == "movi") {
			telf1.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int contadorMovi = 0;
		if(telf1.getOperadora() == "movi") {
			contadorMovi++;
		}
		if(telf2.getOperadora()=="movi") {
			contadorMovi++;
		}
		if(telf3.getOperadora()=="movi") {
			contadorMovi++;
		}
		
		return contadorMovi;
	}
	
	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
		int contadorClaro = 0;
		
		if(telf1.getOperadora() == "claro") {
			contadorClaro++;
		}
		if(telf2.getOperadora()=="claro") {
			contadorClaro++;
		}
		if(telf3.getOperadora()=="claro") {
			contadorClaro++;
		}
		if(telf4.getOperadora() == "claro") {
			contadorClaro++;
		}
		
		return contadorClaro;
		
	}
}
