package log4jPackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {

	static Logger logger = Logger.getLogger(PropertyLog4jExample.class);
	
	public static void main(String args[]) {
		
		PropertyConfigurator.configure("Files/log4j.properties");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is Warning Message");
		logger.error("This is error Message");
		logger.fatal("This is fatal message");
		
}
}
