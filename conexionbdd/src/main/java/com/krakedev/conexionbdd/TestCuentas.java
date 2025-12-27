package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conect = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			conect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","BeckerC2005");
			System.out.println("Conexion exitosa...");
			
			ps = conect.prepareStatement("insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)\r\n"
					+ "values(?,?,?,?)");
			
			ps.setString(1, "22143");
			ps.setString(2, "13290");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr = "2023/06/29";
			try {
				Date fecha = sdf.parse(fechaStr);
				long fechaMilis = fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				ps.setDate(3, fechaSQL);
				ps.setBigDecimal(4, new BigDecimal(2500.75));
				ps.executeUpdate();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
