package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProductos {
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println(producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println(producto);
	}
	
	
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos(){
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Categoria cat1 = new Categoria(001,"Consumibles");
		Producto pro1 = new Producto("01","Arroz",cat1,8.10,20);
		Producto pro2 = new Producto("02","Pollo Congelado",cat1,10.5,50);
		Producto pro3 = new Producto("03","Papas",cat1,2.50,100);
		productos.add(pro1);
		productos.add(pro2);
		productos.add(pro3);
		
		return productos;
	}
}
