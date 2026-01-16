package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtility { // this is Singleton utility used - need to visit this again 

	static private Logger logger;
	
	private LoggerUtility() {
		
	}
	public static Logger getLogger(Class<?> clazz) {
		if(logger == null) {
			logger = LogManager.getLogger(clazz);
		}
		return logger;
		
	}
}
