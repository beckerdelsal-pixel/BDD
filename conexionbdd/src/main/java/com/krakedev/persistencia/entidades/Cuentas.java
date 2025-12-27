package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Cuentas {
	private String numero_cuenta;
	private String cedula_propietario;
	private Date fecha_creacion;
	private BigDecimal saldo;
	public Cuentas(String numero_cuenta, String cedula_propietario) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.cedula_propietario = cedula_propietario;

	}
	
	public Cuentas(Date fecha_creacion, BigDecimal saldo) {
		super();
		this.fecha_creacion = fecha_creacion;
		this.saldo = saldo;
	}

	public Cuentas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public String getCedula_propietario() {
		return cedula_propietario;
	}
	public void setCedula_propietario(String cedula_propietario) {
		this.cedula_propietario = cedula_propietario;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cuentas [numero_cuenta=" + numero_cuenta + ", cedula_propietario=" + cedula_propietario
				+ ", fecha_creacion=" + fecha_creacion + ", saldo=" + saldo + "]";
	}
	
	
	
}
