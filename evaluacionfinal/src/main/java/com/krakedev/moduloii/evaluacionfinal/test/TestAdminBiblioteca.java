package com.krakedev.moduloii.evaluacionfinal.test;

import java.util.Date;

import com.krakedev.moduloii.evaluacionfinal.entidades.Autor;
import com.krakedev.moduloii.evaluacionfinal.entidades.Genero;
import com.krakedev.moduloii.evaluacionfinal.entidades.Libro;
import com.krakedev.moduloii.evaluacionfinal.entidades.Prestamo;
import com.krakedev.moduloii.evaluacionfinal.servicios.AdminBiblioteca;
import com.krakedev.moduloii.evaluacionfinal.utils.Convertidor;

public class TestAdminBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autor = new Autor(1, "Edgar", "Ecuatoriano");
		Libro libro = new Libro(12,"Sabra dios",1,2,true);
		Genero genero = new Genero(5,"Biblico");
		Prestamo prestamo = new Prestamo();
		
		try {
			Date fechaPu = Convertidor.convertirDate("2000/12/23");
			Date fechaNA = Convertidor.convertirDate("1995/10/05");
		
			libro.setAño_publicacion(fechaPu);
			autor.setFecha_nacimiento(fechaNA);
			AdminBiblioteca.insertar(libro);
			AdminBiblioteca.insertar(autor);
			AdminBiblioteca.insertar(genero);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
	}

}
