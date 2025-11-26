package com.krakedev.composicion;

public class Direccion {
	private String callePrincipal;
	private String calleSec;
	private String numero;
	private double latitud;
	private double longitud;
	
	
	public Direccion() {

		// TODO Auto-generated constructor stub
	}
	public Direccion(String callePrincipal, String calleSec, String numero) {

		this.callePrincipal = callePrincipal;
		this.calleSec = calleSec;
		this.numero = numero;
	}
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSec() {
		return calleSec;
	}
	public void setCalleSec(String calleSec) {
		this.calleSec = calleSec;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
}
