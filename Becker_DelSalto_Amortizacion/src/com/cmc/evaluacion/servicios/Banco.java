package com.cmc.evaluacion.servicios;

import java.util.ArrayList;


import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {

		this.prestamos = new ArrayList<Prestamo>();
		this.clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarCliente(String cedula) {
		// Usamos el bucle for basado en índices para iterar sobre la lista de clientes
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i); // Obtener el elemento en la posición i

			if (cliente.getCedula().equals(cedula)) {
				return cliente; // Cliente encontrado
			}
		}
		return null; // Cliente no encontrado
	}

	public void registrarCliente(Cliente nuevoCliente) {
		// Verificar si el cliente ya existe usando el método buscarCliente
		if (buscarCliente(nuevoCliente.getCedula()) == null) {
			// Si buscarCliente retorna null, el cliente no existe y se puede agregar
			clientes.add(nuevoCliente);
			System.out.println("Cliente registrado :" + nuevoCliente.getNombre() + " " + nuevoCliente.getApellido() +
                    "[cedula=" + nuevoCliente.getCedula() + ", nombre=" + nuevoCliente.getNombre() +
                    ", apellido=" + nuevoCliente.getApellido() + "]");
		} else {
			System.out.println("Error: El cliente con cédula " + nuevoCliente.getCedula() + " ya está registrado.");
		}
	}

	
	public void asignarPrestamo(String cedula, Prestamo nuevoPrestamo) {
		Cliente cliente = buscarCliente(cedula);

		if (cliente == null) {
			// 1) Valida si el cliente existe. Si no existe, lanza un mensaje.
			System.out.println("Error: El cliente con cédula " + cedula + " no es cliente del banco.");
		} 

		nuevoPrestamo.setCliente(cliente);

        CalculadoraAmortizacion calc = new CalculadoraAmortizacion();
        calc.generarTabla(nuevoPrestamo);

        prestamos.add(nuevoPrestamo);
		
	}
	
	

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {

		ArrayList<Prestamo> prestamosDelCliente = new ArrayList<Prestamo>();

		// Usamos el bucle for simple para iterar sobre la lista de préstamos
		for (int i = 0; i < prestamos.size(); i++) {
			Prestamo prestamo = prestamos.get(i);
			//String cedulaPrestamo = prestamo.getCliente().getCedula();

			// Compara la cédula del cliente asociado al préstamo con la cédula buscada
			if (prestamo.getCliente() != null && prestamo.getCliente().getCedula().equals(cedula)) {
				prestamosDelCliente.add(prestamo);
			}
		}

		// Retorna la lista si contiene elementos, de lo contrario, retorna null
		if (prestamosDelCliente.isEmpty()) {
            return null;
        }
		
		return prestamosDelCliente;
	}
}
