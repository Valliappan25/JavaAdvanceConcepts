package log4jPackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfigClassExample {
	
	static Logger logger = Logger.getLogger(BasicConfigClassExample.class);

	public static void main(String args[]) {
		
		BasicConfigurator.configure();
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is Warning Message");
		logger.error("This is error Message");
		logger.fatal("This is fatal message");
		
}
	
}
