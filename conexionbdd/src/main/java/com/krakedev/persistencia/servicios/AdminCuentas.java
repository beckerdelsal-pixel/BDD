package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCuentas {
private static final Logger LOGGER= LogManager.getLogger(AdminCuentas.class);
	
	
	public static void actualizar (Cuentas cuenta) throws Exception{
		Connection conect = null;
		PreparedStatement ps = null;
		LOGGER.trace("Datos de actualizar... "+cuenta);
		
		try {
			conect = ConexionBDD.conectar();
			
			
			String sql = "UPDATE cuentas SET cedula_propietario=?, fecha_creacion=?, "
	                   + "saldo=? WHERE numero_cuenta=?";

	        ps = conect.prepareStatement(sql);
			
			ps.setString(1, cuenta.getCedula_propietario());
			
			ps.setDate(2, new java.sql.Date(cuenta.getFecha_creacion().getTime()));
			ps.setBigDecimal(3, cuenta.getSaldo());
			ps.setString(4, cuenta.getNumero_cuenta());
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
	
	
	public static void insertar (Cuentas cuenta) throws Exception{
		Connection conect = null;
		PreparedStatement ps=null;
		LOGGER.trace("Cuenta a insertar.... " +cuenta);
		try {
			//abrir conexion
		conect = ConexionBDD.conectar();
		System.out.println("insertar...");
		
		ps=conect.prepareStatement("insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)\r\n"
				+ "values (?,?,?,?)");
		
		ps.setString(1,cuenta.getNumero_cuenta());
		ps.setString(2,cuenta.getCedula_propietario());
		ps.setDate(3, new java.sql.Date(cuenta.getFecha_creacion().getTime()));
		ps.setBigDecimal(4, cuenta.getSaldo());
		
		
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
	
	
	public static void eliminar(String numero) throws Exception {
	    Connection conect = null;
	    PreparedStatement ps = null;
	    try {
	        conect = ConexionBDD.conectar();
	        // Sentencia SQL para eliminar por clave primaria
	        String sql = "DELETE FROM cuentas WHERE numero_cuenta = ?";
	        
	        ps = conect.prepareStatement(sql);
	        ps.setString(1, numero); // Seteamos el parámetro recibido

	        ps.executeUpdate(); // Ejecuta la eliminación
	        System.out.println("Registro con Numero de cuenta: " + numero + " eliminado.");

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
