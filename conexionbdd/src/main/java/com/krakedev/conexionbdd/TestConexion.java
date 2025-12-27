package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection conect = null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			conect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","BeckerC2005");
			System.out.println("Conexion exitosa...");
			
			ps=conect.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)\r\n"
					+ "values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1,"1713616123");
			ps.setString(2,"Rosalia");
			ps.setString(3,"Andrade");
			ps.setString(4,"S");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.45));
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				//para crear una fecha sql se crea a partir de los milisegundos obtenidos de la fecha de java.util.date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, timeSQL);
				
				ps.executeUpdate();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			System.out.println("Ejecuta insert....");
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}
