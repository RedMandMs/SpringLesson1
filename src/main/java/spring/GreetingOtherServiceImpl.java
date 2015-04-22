package spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("Other")
public class GreetingOtherServiceImpl implements GreetingService {

	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Other Greeting, user!";
	}

}
