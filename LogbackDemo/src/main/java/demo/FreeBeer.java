package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;



public class FreeBeer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = LoggerFactory.getLogger("demo.FreeBeer");
		Logger otherLogger = LoggerFactory.getLogger("record");
		otherLogger.debug("Free Beer!");
		
		MDC.put("user", "Craig");
	    
		while(true){
			logger.info("Free beer for everyone");
			logger.warn("Don't drink and drive!");
			try {
				Thread.sleep(5000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	    
	    // print internal state
	//    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	  //  StatusPrinter.print(lc);


	}

}
