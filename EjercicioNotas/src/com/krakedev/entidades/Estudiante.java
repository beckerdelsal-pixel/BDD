package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = new ArrayList<Nota>();
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
		double calificacion = nuevaNota.getCalificacion();
		String codigoMateria = nuevaNota.getMateria().getCodigo();
		
		if (calificacion < 0 || calificacion > 10) {
			System.out.println("Nota no valida....");
			return;
		}

		for (int i = 0; i < notas.size(); i++) {
			Nota notaE = notas.get(i);
			if (notaE.getMateria().getCodigo().equals(codigoMateria)) {
				System.out.println("Error: materia con codigo: " + codigoMateria + notaE.getMateria().getNombre()
						+ " ya se encuentra registrada");
				return;
			}
		}
		
		notas.add(nuevaNota);
		System.out.println("Nueva nota registrada exitosamente!");
	}

	public void modificarNota(String codigo, double nuevaNota) {
		
		if (nuevaNota < 0 || nuevaNota > 10) {
			System.out.println("Nota no valida....");
			return;
		}
		boolean encontrado = false;
		for (int i = 0; i < notas.size(); i++) {
			Nota n = notas.get(i);
			if (n.getMateria().getCodigo().equals(codigo)) {
				System.out.println("Nota modificada exitosamente...");
				n.setCalificacion(nuevaNota);
				encontrado = true;
				break;
			}
		}
		if(!encontrado ) {
			System.out.println("No se hallo una materia con dicho codigo");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		if (notas.isEmpty()) {
			return 0.0;
		}

		double suma = 0;
		for (int i = 0; i < notas.size(); i++) {
			Nota n = notas.get(i);
			suma += n.getCalificacion();
		}
		return suma  / notas.size();
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Cedula: " + cedula);
		if (notas != null) {
			for (int i = 0; i < notas.size(); i++) {
				Nota nota = notas.get(i);
				System.out.println(" Nota Materia: " + nota.getMateria().getNombre() + " con calificacion: "
						+ nota.getCalificacion());
				
				
			}
		}

	}

}
