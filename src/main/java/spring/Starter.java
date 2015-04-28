package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Starter {

    public static void main(String[] args) {
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        System.out.println(greetingService.sayGreeting());  // "Greeting, user!"
    }
    
    
}
