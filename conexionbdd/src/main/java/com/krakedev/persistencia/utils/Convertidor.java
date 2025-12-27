package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd";
	private static final String FORMATO_HORA = "hh:mm";
	private static final Logger LOGGER= LogManager.getLogger(Convertidor.class);
	
	public static Date convertirDate(String fechaStr) throws Exception{
		Date fechaDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		try {
			LOGGER.trace("Conviertiendo fecha "+ fechaStr);
			fechaDate = sdf.parse(fechaStr);
			LOGGER.trace("Fecha convertida: " + fechaDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error("La fecha no tiene el formato correcto... "+fechaStr,e);
			throw new Exception("La fecha no tiene el formato correcto... "+fechaStr);
		}
		return fechaDate;
	}
	
	public static Date convertirTime(String horaStr) throws Exception{
		Date horaDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		try {
			LOGGER.trace("Convirtiendo Hora "+ horaStr);
			horaDate = sdf.parse(horaStr);
			LOGGER.trace("Hora convertida: " + horaDate);
		}catch(ParseException e) {
			LOGGER.error("La hora no tiene el formato correcto... "+ horaStr,e);
			throw new Exception("La hora no tiene el formato correcto... "+horaStr);
		}
		return horaDate;
	}
}
