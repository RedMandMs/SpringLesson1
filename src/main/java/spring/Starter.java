package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Starter {

    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);
        GreetingServiceUse greetingServiceUse = context.getBean(GreetingServiceUse.class);
        System.out.println(greetingServiceUse.useService());  // "Other Greeting, user!"
    }
    
    
}
