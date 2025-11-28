package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		this.celda1 = new Celda(codigoCelda1);
		this.celda2 = new Celda(codigoCelda2);
		this.celda3 = new Celda(codigoCelda3);
		this.celda4 = new Celda(codigoCelda4);

	}

	public void mostrarConfiguracion() {
		System.out.println("*********************");
		System.out.println("Celda1: " + celda1.getCodigo());
		System.out.println("Celda2: " + celda2.getCodigo());
		System.out.println("Celda3: " + celda3.getCodigo());
		System.out.println("Celda4: " + celda4.getCodigo());
		System.out.println("*********************");
	}

	public Celda buscarCelda(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1;
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2;
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3;
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}

	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadItems) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidadItems);
		}

	}

	public void mostrarProductos() {
		System.out.println("*********Producto 1************");
		System.out.println("Codigo Celda: " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() == null) {
			System.out.println("La celda no tiene producto!!!");
		} else {
			
			System.out.println("Nombre Producto: " + celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda1.getProducto().getCodigo());
		}

		System.out.println("*********Producto 2************");
		System.out.println("Codigo Celda: " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() == null) {
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Nombre Producto: " + celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda2.getProducto().getCodigo());
		}

		System.out.println("*********Producto 3************");
		System.out.println("Codigo Celda: " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() == null) {
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Nombre Producto: " + celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda3.getProducto().getCodigo());
		}

		System.out.println("*********Producto 4************");
		System.out.println("Codigo Celda: " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() == null) {
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Nombre Producto: " + celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda4.getProducto().getCodigo());
		}

		System.out.println("*********Saldo de Maquina************");
		System.out.println("Saldo de Maquina: " + saldo);
		System.out.println("*********************");
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}

	}

	public double consultarPrecio(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		} else {
			return 0;
		}
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null) {
			if (codigoProducto.equals(celda1.getProducto().getCodigo())) {
				return celda1;
			}
		}
		if (celda2.getProducto() != null) {
			if (codigoProducto.equals(celda2.getProducto().getCodigo())) {
				return celda2;
			}
		}
		if (celda3.getProducto() != null) {
			if (codigoProducto.equals(celda3.getProducto().getCodigo())) {
				return celda3;
			}
		}
		if (celda4.getProducto() != null) {
			if (codigoProducto.equals(celda4.getProducto().getCodigo())) {
				return celda4;
			}
		} 
			return null;
		
	}

	public void incrementarProductos(String codigoProducto, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		int cantidad = celdaEncontrada.getStock();
		celdaEncontrada.setStock(cantidadItems + cantidad);
	}

	public void vender(String codigoCelda) {
		Celda pro = buscarCelda(codigoCelda);
		if(pro != null) {
			int cantidad = pro.getStock();
			int nuevoStock = cantidad-1;
			pro.setStock(nuevoStock);
			double ingreso = pro.getProducto().getPrecio();
			saldo = saldo + ingreso;
			
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		Celda pro = buscarCelda(codigoCelda);
		double precio = pro.getProducto().getPrecio();
		if(valorIngresado >= precio) {
			int cantidad = pro.getStock() -1;
			pro.setStock(cantidad);
			double cambio = valorIngresado - precio;
			saldo = saldo + precio;
			return cambio;
		}else {
			return valorIngresado;
		}
		
	}
	
}
