package com.javadev.file;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class WriteLogEntriesToLogFile {

	public static void main(String[] args) throws Exception {

		boolean append = true;
		FileHandler handler = new FileHandler("D:\\Users\\Default User\\Desktop\\default.log", append);

		Logger logger = Logger.getLogger("com.mufg.mdm.log");
		logger.addHandler(handler);

		logger.severe("severe message");

		logger.warning("warning message");

		logger.info("info message");

		logger.config("config message");

	}

}
