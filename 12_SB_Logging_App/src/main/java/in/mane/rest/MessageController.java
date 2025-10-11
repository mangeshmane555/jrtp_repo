package in.mane.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	private Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		logger.debug("*debug* This is info logger message from welcome()");
		logger.warn("*warn* THis is warning from welcome method");
		logger.info("*info* welcomeMsg() execution started");
		String msg = "Welcome to India";
		
		try {
			int i = 10/0;
			
		} catch (Exception e) {
			logger.error("Error Occurred"+ e.getMessage()); // to set exception data to log file
		}
		
		
		logger.info("*info* welcomeMsg() execution Ended");
		
		return msg;
	}

	@GetMapping("/greet")
	public String greetMsg() {
		
		logger.debug("This is logger message from greet()");
		
		logger.warn("THis is warning from greet method");
		logger.info("greetMsg() execution started");
		String msg = "Good Morning";
		
		String s = null;
//		s.length();
		logger.info("greetMsg() execution ended");
		
		return msg;
	}

}
