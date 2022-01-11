package beta;

import org.apache.logging.log4j.*;

public class demo {
	
	private static Logger log = LogManager.getLogger(demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am debugging");
		
			log.info("I am info");
		log.error("I am error");
		
		log.fatal("this is fatal");
	}

}
