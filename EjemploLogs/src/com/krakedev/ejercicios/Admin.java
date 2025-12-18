package com.krakedev.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger = LogManager.getLogger(Admin.class);
	
	
	public void agregar() {
		logger.warn("Mensaje de Warn");
		logger.info("Mensaje de Info");
		logger.debug("Mensaje de Debug");
		logger.trace("Mensaje de Trace");
		
		
		logger.error("Mensaje de Error");
		
	}
}
