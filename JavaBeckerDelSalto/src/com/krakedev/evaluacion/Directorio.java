package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		this.contactos = new ArrayList<>();
		this.correctos = new ArrayList<>();
		this.incorrectos = new ArrayList<>();

	}
	

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}


	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}


	public Date getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}


	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}


	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}


	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}


	public boolean agregarContacto(Contacto contac) {
		if (contac == null) {
			System.out.println("El contacto es nulo...");
			return false;
		}

		Contacto existe = buscarPorCedula(contac.getCedula());

		if (existe == null) {
			contactos.add(contac);
			System.out.println("Contacto agregado correctamente....");
			this.fechaModificacion = new Date();
			return true;

		} else {
			return false;
		}

	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoHallado = null;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto c = contactos.get(i);
			if (c != null) {
				if (c.getCedula().equals(cedula)) {
					contactoHallado = c;
				}
			}
		}
		return contactoHallado;
	}

	public String consultarUltimaModificacion() {
		if (this.fechaModificacion == null) {
			return "No hay modificaciones recientes";
		}

		SimpleDateFormat modificada = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return modificada.format(this.fechaModificacion);
	}

	public int contarPerdidos() {
		int perdidos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto cont = contactos.get(i);
			if (cont.getDireccion() == null) {
				perdidos++;
			}
		}

		return perdidos;
	}

	public int contarFijos() {
		int fijos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto cont = contactos.get(i);
			ArrayList<Telefono> telf = cont.getTelefonos();
			for (int t = 0; t < telf.size(); t++) {
				Telefono tlf = telf.get(t);
				if ("Convencional".equals(tlf.getTipo()) && tlf.getEstado().equals("C")) {
					fijos++;
					break;
				}
			}

		}
		return fijos;
	}

	public void depurar() {
		
		for (int i = 0; i < contactos.size(); i++) {
			Contacto cont = contactos.get(i);
			if (cont.getDireccion() != null) {
				correctos.add(cont);
			}
			if(cont.getDireccion() == null) {
				incorrectos.add(cont);
			}
		}
		contactos.clear();
		
		
	}
}
