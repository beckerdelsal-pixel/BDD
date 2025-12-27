package com.krakedev.moduloii.evaluacionfinal.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.moduloii.evaluacionfinal.entidades.Autor;
import com.krakedev.moduloii.evaluacionfinal.entidades.Genero;
import com.krakedev.moduloii.evaluacionfinal.entidades.Libro;
import com.krakedev.moduloii.evaluacionfinal.utils.ConexionBDD;

public class AdminBiblioteca {
	
	private static final Logger LOGGER = LogManager.getLogger(AdminBiblioteca.class);
	
	public static void insertar(Libro libro) throws Exception{
		Connection conect = null;
		PreparedStatement ps = null;
		LOGGER.trace("Libro por insertar..." +libro);
		
		try {
			conect = ConexionBDD.conectar();
			LOGGER.info("Conexion exitosa...");
			LOGGER.trace("insertar..");
			
			ps=conect.prepareStatement("insert into libros(id_libro,titulo,autor_id,genero_id,año_publicacion,esta_disponible)\r\n"
					+ "values(?,?,?,?,?,?)");
			ps.setInt(1, libro.getId_libro());
			ps.setString(2, libro.getTitulo());
			ps.setInt(3, libro.getAutor_id());
			ps.setInt(4, libro.getGenero_id());
			ps.setDate(5, new java.sql.Date(libro.getAño_publicacion().getTime()));
			ps.setBoolean(6, libro.isEsta_disponible());
		} catch (Exception e) {
			LOGGER.error("Error al insertar...",e);
			throw e;
		}finally {
			//cerrar conexion
			try {
				conect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos...",e);
				e.printStackTrace();
				throw new Exception("Error con la base de datos...");
				
			}
		}
	}
	public static void insertar(Autor autor) throws Exception{
		Connection conect = null;
		PreparedStatement ps = null;
		LOGGER.trace("Libro por insertar..." +autor);
		
		try {
			conect = ConexionBDD.conectar();
			LOGGER.info("Conexion exitosa...");
			LOGGER.trace("insertar..");
			
			ps=conect.prepareStatement("insert into autores(id_autor, nombre, fecha_nacimiento, nacionalidad)\r\n"
					+ "values(?,?,?,?)");
			ps.setInt(1, autor.getId_autor());
			ps.setString(2, autor.getNombre());
			ps.setDate(3, new java.sql.Date(autor.getFecha_nacimiento().getTime()));
			ps.setString(4, autor.getNacionalidad());
		} catch (Exception e) {
			LOGGER.error("Error al insertar...",e);
			throw e;
		}finally {
			//cerrar conexion
			try {
				conect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos...",e);
				e.printStackTrace();
				throw new Exception("Error con la base de datos...");
				
			}
		}
	}
	public static void insertar (Genero genero) throws Exception{
		Connection conect = null;
		PreparedStatement ps=null;
		LOGGER.trace("Persona a insertar.... " +genero);
		try {
			//abrir conexion
		conect = ConexionBDD.conectar();
		System.out.println("insertar...");
		
		ps=conect.prepareStatement("insert into genero(id_genero, nombre)" +
				"values(?,?)");
		
		ps.setInt(1, genero.getId_genero());
		ps.setString(2,genero.getNombre());
		
		
		ps.executeUpdate();
		}catch(Exception e){
			//mostrar error al usuario
			//loguear el error
			LOGGER.error("Error al insertar...",e);
			throw e;
		}finally {
			//cerrar conexion
			try {
				conect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos...",e);
				e.printStackTrace();
				throw new Exception("Error con la base de datos...");
				
			}
		}
	}
}
