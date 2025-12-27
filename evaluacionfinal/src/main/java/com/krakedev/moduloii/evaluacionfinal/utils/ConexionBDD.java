package com.krakedev.moduloii.evaluacionfinal.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USER = "postgres";
	private final static String PASSWORD = "BeckerC2005";
	private static final Logger LOGGER= LogManager.getLogger(ConexionBDD.class);
	
	public static Connection conectar() throws Exception{
		
		Connection conect=null;
		try {
			Class.forName(DRIVER);
			conect=DriverManager.getConnection(URL,USER,PASSWORD);
			LOGGER.debug("Conexion exitosa!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error en infraestructura...",e);
			throw new Exception("Error...");
		}
		return conect;
	}
}
