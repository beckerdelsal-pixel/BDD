package com.krakedev.practicas;

public class Cuenta {
	private String numeroCuenta;
	private double saldo;
	public Cuenta(String numero_cuenta, double saldo) {
		super();
		this.numeroCuenta = numero_cuenta;
		this.saldo = saldo;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Numero de Cuenta: "+numeroCuenta+"\nSaldo: "+saldo;
	}
	
	
}
