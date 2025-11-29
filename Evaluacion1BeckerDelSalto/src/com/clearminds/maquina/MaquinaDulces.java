package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	// private ArrayList<Producto> productos;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
		// productos = new ArrayList<Producto>();
	}

	public void agregarCelda(Celda codigo) {
		celdas.add(codigo);
	}

	public void mostrarConfiguracion() {
		Celda elementoC;
		for (int i = 0; i < celdas.size(); i++) {
			elementoC = celdas.get(i);
			System.out.println("Celda " + (i + 1) + ": " + elementoC.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada = null;
		Celda elementoC = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoC = celdas.get(i);
			if (codigo.equals(elementoC.getCodigo())) {
				celdaEncontrada = elementoC;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigo, int cantdad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantdad);
		}
	}

	public void mostrarProductos() {
		Celda elementoC;
		for (int i = 0; i < celdas.size(); i++) {
			elementoC = celdas.get(i);
			System.out.println("*********************");
			System.out.println("Codigo: " + elementoC.getCodigo());
			System.out.println("Stock: " + elementoC.getStock());
			if (elementoC.getProducto() != null) {
				System.out.println("Producto: " + elementoC.getProducto().getCodigo());
				System.out.println("Nombre: " + elementoC.getProducto().getNombre());
				System.out.println("Precio: " + elementoC.getProducto().getPrecio());
			} else {
				System.out.println("Sin producto asignado");
			}
			System.out.println("*********************");
		}
		System.out.println("*********Saldo de Maquina************");
		System.out.println("Saldo de Maquina: " + saldo);
		System.out.println("*********************");
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda elementoP;
		for (int i = 0; i < celdas.size(); i++) {
			elementoP = celdas.get(i);
			if (codigo.equals(elementoP.getCodigo())) {
				return elementoP.getProducto();
			}
		}
		return null;
	}

	public double consultarPrecio(String codigo) {
		Celda elementoP;
		for (int i = 0; i < celdas.size(); i++) {
			elementoP = celdas.get(i);
			if (elementoP.getProducto() != null) {
				return elementoP.getProducto().getPrecio();
			}
		}
		return 0;
	}

	public Celda buscarCeldaProducto(String codigoP) {
		Celda elemento = null;
		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);
			if (elemento.getProducto() != null) {
				if (codigoP.equals(elemento.getProducto().getCodigo())) {
					return elemento;
				}
			}

		}
		return elemento;
	}

	public void incrementarProductos(String codigoP, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoP);
		int cantidad = celdaEncontrada.getStock();
		celdaEncontrada.setStock(cantidad + items);
	}

	public void vender(String codigo) {
		Celda pro = buscarCelda(codigo);
		if (pro != null) {
			int cantidad = pro.getStock();
			int nuevoStock = cantidad - 1;
			pro.setStock(nuevoStock);
			double ingreso = pro.getProducto().getPrecio();
			saldo = saldo + ingreso;
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {

		Celda pro = buscarCelda(codigoCelda);
		if (pro != null) {
			if (pro.getProducto() != null) {

				double precio = pro.getProducto().getPrecio();
				if (valorIngresado >= precio) {
					int cantidad = pro.getStock() - 1;
					pro.setStock(cantidad);
					double cambio = valorIngresado - precio;
					saldo = saldo + precio;
					return cambio;
				}
			}
		}
		return valorIngresado;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<>();
		Celda celd = null;
		Producto elementoMen = null;
		for (int i = 0; i < celdas.size(); i++) {
			celd = celdas.get(i);
				elementoMen = celd.getProducto();
				if (elementoMen != null && elementoMen.getPrecio() <= limite) {
					menores.add(elementoMen);
				}
			

		}
		return menores;
	}
}
