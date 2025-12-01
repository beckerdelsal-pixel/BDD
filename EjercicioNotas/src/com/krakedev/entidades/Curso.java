package com.krakedev.entidades;

import java.util.ArrayList;



public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		String cedulaEstudiante = estudiante.getCedula();
		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante est = estudiantes.get(i);
			if (est.getCedula().equals(cedulaEstudiante)) {
				return est;
			}
		}

		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		if (buscarEstudiantePorCedula(estudiante) == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		if(estudiantes.isEmpty()) {
			return 0.0;
		}
		
		double sumaPromedios = 0;
		
		for(int i=0;i<estudiantes.size();i++) {
			Estudiante est = estudiantes.get(i);
			sumaPromedios = sumaPromedios + est.calcularPromedioNotasEstudiante();
		}
		return sumaPromedios / estudiantes.size();
	}

	public void mostrar() {
		Estudiante elementoE;
		for(int i=0;i<estudiantes.size();i++) {
			elementoE = estudiantes.get(i);
			elementoE.mostrar();
			System.out.println("Promedio: " + elementoE.calcularPromedioNotasEstudiante() + "\n");
		}
		System.out.println("Promedio del Curso: " + calcularPromedioCurso());

	}
}
