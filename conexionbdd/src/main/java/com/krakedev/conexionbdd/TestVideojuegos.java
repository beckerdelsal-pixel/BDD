package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestVideojuegos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			conect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","BeckerC2005");
			System.out.println("Conexion exitosa...");
			
			ps = conect.prepareStatement("insert into videojuegos(codigo, nombre, descripcion, valoracion)\r\n"
					+ "values(?,?,?,?)");
			
			ps.setInt(1, 11);
			ps.setString(2, "Valorant");
			ps.setString(3, "Juego shooter multijugador, accion y trabajo en equipo");
			ps.setInt(4, 89);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
