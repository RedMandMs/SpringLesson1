package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class GreetingServiceUse {

	@Autowired
	@Qualifier("Other")
	public GreetingService service;
	
	public String useService(){
		return service.sayGreeting();
	}
	
	
	
}
