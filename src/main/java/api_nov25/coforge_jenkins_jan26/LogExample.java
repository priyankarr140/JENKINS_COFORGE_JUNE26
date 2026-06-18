package api_nov25.coforge_jenkins_jan26;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogExample {

	 private static final Logger logger =
	            LogManager.getLogger(LogExample.class);

	    public static void main(String[] args) {

	        logger.trace("This is TRACE level log");
	        logger.debug("This is DEBUG level log");
	        logger.info("Application started");
	        logger.warn("This is a WARNING message");
	        logger.error("This is an ERROR message");
	        logger.fatal("This is an FATAL message");

	    }

}
