package spring;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("greetingService")
public class GreetingServiceImpl implements GreetingService {


	public String sayGreeting() {
		
		return "Hiiii!!!!";
	}
}
