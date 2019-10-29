package xsdvi.utils;

import xsdvi.XsdVi;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

/**
 * @author Václav Slavìtínský
 *
 */
public final class LoggerHelper {
	
	/**
	 * 
	 */
	public static final String LOGGER_NAME = XsdVi.class.getPackage().getName() + "." + XsdVi.class;
	
	/**
	 * 
	 */
	public static final String DEFAULT_URI = "xsdvi.log";
	
	private static final Logger logger = Logger.getLogger(LOGGER_NAME);
	
	/**
	 * 
	 */
	private LoggerHelper() {
		// no instances
	}
	
	/**
	 * @param uri
	 */
	public static void setupLogger(String uri) {
		logger.setLevel(Level.ALL);

		try {
			System.out.println("ololo1");
			InputStream configFile = LoggerHelper.class.getClassLoader()
					.getResourceAsStream("logging.properties");
			if (configFile != null) {
				logger.info("initializing - trying to load configuration file ...");
				LogManager.getLogManager().readConfiguration(configFile);
			} else {
				System.err.println("No such logging.properties in classpath for jdk logging config!");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

		logger.info("initializing - trying to set log file ...");
		try {
			FileHandler fileHandler = new FileHandler(uri, true);
			logger.addHandler(fileHandler);
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("starting xsdvi app");
	}

	/**
	 * 
	 */
	public static void setupLogger() {
		setupLogger(DEFAULT_URI);
	}
}