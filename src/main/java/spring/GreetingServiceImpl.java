package spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Main")
public class GreetingServiceImpl implements GreetingService {

	private ApplicationContext context;
	
	@Required
    public void setContext(ApplicationContext context) {
        this.context = context;
    }
	
	public String sayGreeting() {
		return "Greeting, user!";
	}

	
}
