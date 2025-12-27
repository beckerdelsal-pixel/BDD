package com.krakedev.moduloii.evaluacionfinal.entidades;

import java.util.Date;

public class Prestamo {
	private int id_prestamo;
	private int libro_id;
	private String usuario;
	private Date fecha_prestamo;
	private Date fecha_devolucion;
	public Prestamo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prestamo(int id_prestamo, int libro_id, String usuario, Date fecha_prestamo, Date fecha_devolucion) {
		super();
		this.id_prestamo = id_prestamo;
		this.libro_id = libro_id;
		this.usuario = usuario;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_devolucion = fecha_devolucion;
	}
	public int getId_prestamo() {
		return id_prestamo;
	}
	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}
	public int getLibro_id() {
		return libro_id;
	}
	public void setLibro_id(int libro_id) {
		this.libro_id = libro_id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}
	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}
	public Date getFecha_devolucion() {
		return fecha_devolucion;
	}
	public void setFecha_devolucion(Date fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}
	@Override
	public String toString() {
		return "Prestamo [id_prestamo=" + id_prestamo + ", libro_id=" + libro_id + ", usuario=" + usuario
				+ ", fecha_prestamo=" + fecha_prestamo + ", fecha_devolucion=" + fecha_devolucion + "]";
	}
	
	
}
