package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto() {
		this.telefonos = new ArrayList<>();
	}

	public Contacto(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<>();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void agregarTelefono(Telefono tlf) {
		if (tlf != null) {
			telefonos.add(tlf);
			System.out.println("Telefono agregado correctamente...");
		}
	}

	public void mostrarTelefonos() {

		System.out.println("Telefonos con estado 'C': ");
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono telf = telefonos.get(i);
			if (telf != null) {

				if (telf.getEstado() == "C") {
					System.out.println("Numero: " + telf.getNumero() + ", Tipo" + telf.getTipo());
				}
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> incorrectos = new ArrayList<>();
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono telf = telefonos.get(i);
			if (telf != null) {
				if (telf.getEstado() == "E") {
					incorrectos.add(telf);
				}
			}
		}

		return incorrectos;
	}

	public void imprimir() {
		
		 System.out.println("Informacion del Contacto:");
		 System.out.println("Cedula: "+ cedula);
		 System.out.println("Nombre: "+nombre);
		 System.out.println("Apellido: "+apellido); 
		 if(direccion != null) {
		 System.out.println("Direccion: ");
		 System.out.println("Calle Principal: "+direccion.getCallePrincipal());
		 System.out.println("Calle Secundaria: "+direccion.getCalleSecundaria()); 
		 }
		 
		 
		 
		/*System.out.println("                                    ");
		System.out.println("*****" + nombre + " " + apellido + "*****");
		if (direccion != null) {
			System.out.println("Direccion: " + direccion.getCallePrincipal() + " " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una direccion...");
		}*/
	}

}
