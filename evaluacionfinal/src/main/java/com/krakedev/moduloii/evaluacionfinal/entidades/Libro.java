package com.krakedev.moduloii.evaluacionfinal.entidades;

import java.util.Date;

public class Libro {
	private int id_libro;
	private String titulo;
	private int autor_id;
	private int genero_id;
	private Date año_publicacion;
	private boolean esta_disponible;
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(int id_libro, String titulo, int autor_id, int genero_id, 
			boolean esta_disponible) {
		super();
		this.id_libro = id_libro;
		this.titulo = titulo;
		this.autor_id = autor_id;
		this.genero_id = genero_id;

		this.esta_disponible = esta_disponible;
	}
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAutor_id() {
		return autor_id;
	}
	public void setAutor_id(int autor_id) {
		this.autor_id = autor_id;
	}
	public int getGenero_id() {
		return genero_id;
	}
	public void setGenero_id(int genero_id) {
		this.genero_id = genero_id;
	}
	public Date getAño_publicacion() {
		return año_publicacion;
	}
	public void setAño_publicacion(Date año_publicacion) {
		this.año_publicacion = año_publicacion;
	}
	public boolean isEsta_disponible() {
		return esta_disponible;
	}
	public void setEsta_disponible(boolean esta_disponible) {
		this.esta_disponible = esta_disponible;
	}
	@Override
	public String toString() {
		return "Libro [id_libro=" + id_libro + ", titulo=" + titulo + ", autor_id=" + autor_id + ", genero_id="
				+ genero_id + ", año_publicacion=" + año_publicacion + ", esta_disponible=" + esta_disponible + "]";
	}
	
	
}
