package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Videojuego;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminVideojuegos {
private static final Logger LOGGER= LogManager.getLogger(AdminVideojuegos.class);

public static void insertar (Videojuego videojuego) throws Exception{
	Connection conect = null;
	PreparedStatement ps=null;
	LOGGER.trace("Videojuego a insertar.... " +videojuego);
	try {
		//abrir conexion
	conect = ConexionBDD.conectar();
	System.out.println("insertar...");
	
	ps=conect.prepareStatement("insert into videojuegos(codigo, nombre, descripcion, valoracion)\r\n"
			+ "values(?,?,?,?)");
	
	ps.setInt(1,videojuego.getCodigo());
	ps.setString(2,videojuego.getNombre());
	ps.setString(3,videojuego.getDescripcion());
	ps.setInt(4,videojuego.getValoracion());
	
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
	
	
	public static void actualizar (Videojuego videojuego) throws Exception{
		Connection conect = null;
		PreparedStatement ps = null;
		LOGGER.trace("Datos de actualizar... "+videojuego);
		
		try {
			conect = ConexionBDD.conectar();
			
			
			String sql = "UPDATE videojuegos SET nombre=?, descripcion=?, "
	                   + "valoracion=? WHERE codigo=?";

	        ps = conect.prepareStatement(sql);
			
			ps.setString(1, videojuego.getNombre());
			ps.setString(2, videojuego.getDescripcion());
			ps.setInt(3,videojuego.getValoracion());
			ps.setInt(4, videojuego.getCodigo());
			
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
	
	
	public static void eliminar(int codigo) throws Exception {
	    Connection conect = null;
	    PreparedStatement ps = null;
	    try {
	        conect = ConexionBDD.conectar();
	        // Sentencia SQL para eliminar por clave primaria
	        String sql = "DELETE FROM videojuegos WHERE codigo = ?";
	        
	        ps = conect.prepareStatement(sql);
	        ps.setInt(1, codigo); // Seteamos el parámetro recibido

	        ps.executeUpdate(); // Ejecuta la eliminación
	        LOGGER.info("Registro con codigo: " + codigo + " eliminado.");

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
	
	//varios registros
	
	public static ArrayList<Videojuego> buscarPorValoracion(Integer valoracion) throws Exception{
		ArrayList<Videojuego> juego = new ArrayList<Videojuego>();
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
			con=ConexionBDD.conectar();
			ps = con.prepareStatement("select * from videojuegos where valoracion = ?");
			ps.setInt(1,valoracion);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Integer codigo = rs.getInt("codigo");
				String nombre = rs.getString("nombre");
				String descripcion = rs.getString("descripcion");
				Integer valor = rs.getInt("valoracion");
				Videojuego v = new Videojuego();
				v.setCodigo(codigo);
				v.setNombre(nombre);
				v.setDescripcion(descripcion);
				v.setValoracion(valor);
				juego.add(v);
			}
		} catch (Exception e) {
			LOGGER.error("Error al consultar por valoracion...",e);
			throw new Exception ("Error al consultar por valoracion...");
		} finally {
			//cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos...",e);
				e.printStackTrace();
				throw new Exception("Error con la base de datos...");
				
			}
		}
		
		return juego;
	}
	
	//solo un registro
	
	public static Videojuego buscarPorCodigo(Integer codigo) throws Exception {
		Videojuego juego = new Videojuego();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from videojuegos where codigo = ?");
			ps.setInt(1, codigo);

			rs = ps.executeQuery();
			
			if(rs.next()) {
				Integer cod = rs.getInt("codigo");
				String nombre = rs.getString("nombre");
				String descripcion = rs.getString("descripcion");
				Integer valor = rs.getInt("valoracion");
				juego.setCodigo(cod);
				juego.setNombre(nombre);
				juego.setDescripcion(descripcion);
				juego.setValoracion(valor);

			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por codigo...", e);
			e.printStackTrace();
			throw new Exception("Error al consultar por codigo...");
		} finally {
			// cerrar conexion
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de datos...", e);
				e.printStackTrace();
				throw new Exception("Error con la base de datos...");

			}
		}

		return juego;
	}
	
	
}
