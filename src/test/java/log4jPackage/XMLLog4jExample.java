package log4jPackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLLog4jExample {

	static Logger logger = Logger.getLogger(XMLLog4jExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("Files/log4j.xml");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is Warning Message");
		logger.error("This is error Message");
		logger.fatal("This is fatal message");

	}

}
