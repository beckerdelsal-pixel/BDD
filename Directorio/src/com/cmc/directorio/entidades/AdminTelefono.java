package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf1) {
		if(telf1.getOperadora() == "movi") {
			telf1.setTieneWhatsapp(true);
		}
	}
}
