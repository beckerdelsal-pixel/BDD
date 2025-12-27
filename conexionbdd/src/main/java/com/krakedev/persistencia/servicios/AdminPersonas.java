package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	
	private static final Logger LOGGER= LogManager.getLogger(AdminPersonas.class);
	
	
	public static void actualizar (Persona persona) throws Exception{
		Connection conect = null;
		PreparedStatement ps = null;
		LOGGER.trace("Datos de actualizar... "+persona);
		
		try {
			conect = ConexionBDD.conectar();
			
			
			String sql = "UPDATE personas SET nombre=?, apellido=?, estado_civil_codigo=?, "
	                   + "numero_hijos=?, estatura=?, cantidad_ahorrada=?, "
	                   + "fecha_nacimiento=?, hora_nacimiento=? WHERE cedula=?";

	        ps = conect.prepareStatement(sql);
			
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3,persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumero_hijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidad_ahorrada());
			ps.setDate(7, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHora_nacimiento().getTime()));
			ps.setString(9,persona.getCedula());
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error al actualizar..." + e);
			throw e;
		}finally {
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
	
	
	public static void insertar (Persona persona) throws Exception{
		Connection conect = null;
		PreparedStatement ps=null;
		LOGGER.trace("Persona a insertar.... " +persona);
		try {
			//abrir conexion
		conect = ConexionBDD.conectar();
		System.out.println("insertar...");
		
		ps=conect.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)\r\n"
				+ "values(?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1,persona.getCedula());
		ps.setString(2,persona.getNombre());
		ps.setString(3,persona.getApellido());
		ps.setString(4,persona.getEstadoCivil().getCodigo());
		ps.setInt(5, persona.getNumero_hijos());
		ps.setDouble(6, persona.getEstatura());
		ps.setBigDecimal(7, persona.getCantidad_ahorrada());
		ps.setDate(8, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
		ps.setTime(9, new Time(persona.getHora_nacimiento().getTime()));
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
	
	
	public static void eliminar(String cedula) throws Exception {
	    Connection conect = null;
	    PreparedStatement ps = null;
	    try {
	        conect = ConexionBDD.conectar();
	        // Sentencia SQL para eliminar por clave primaria
	        String sql = "DELETE FROM personas WHERE cedula = ?";
	        
	        ps = conect.prepareStatement(sql);
	        ps.setString(1, cedula); // Seteamos el parámetro recibido

	        ps.executeUpdate(); // Ejecuta la eliminación
	        System.out.println("Registro con cédula " + cedula + " eliminado.");

	    } catch (Exception e) {
	    	LOGGER.error("Error al eliminar..." + e);
			throw e;
	    } finally {
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
