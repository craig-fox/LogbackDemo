package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;



public class FreeBeer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = LoggerFactory.getLogger("demo.FreeBeer");
		Logger otherLogger = LoggerFactory.getLogger("record");
		otherLogger.debug("Free Beer!");
	    logger.warn("Don't drink and drive!");
	    
	    // print internal state
	    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(lc);


	}

}
