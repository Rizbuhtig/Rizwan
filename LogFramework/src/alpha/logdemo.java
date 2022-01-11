package alpha;

import org.apache.logging.log4j.*;

public class logdemo {
	
	private static Logger log = LogManager.getLogger(logdemo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am debugging");
		
			log.info("I am info");
		log.error("I am error");
		
		log.fatal("this is fatal");
	}

}
