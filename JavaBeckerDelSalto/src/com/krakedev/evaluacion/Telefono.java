package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		this.estado = validarTelefono();

	}

	private String validarTelefono() {

		//if (this.tipo != null && this.numero!= null) {

			if (this.numero == null || this.tipo == null) {
				return "E";
			}
			boolean esMovil = this.tipo.equals("Movil");
			boolean esConvencional = this.tipo.equals("Convencional");

			if (!esMovil && !esConvencional) {
				return "E";
			}
			
			if (esMovil) {
				if (this.numero.length() != 10) {
					return "E";
				}

			}else if(esConvencional) {
				if (this.numero.length() != 7) {
					return "E";
				}
			}
		//}
		return "C";

	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
