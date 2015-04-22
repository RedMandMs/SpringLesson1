package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
@ComponentScan
public class LessonsConfiguration {

	@Bean
	@Description("Использование бина greetingService")
    GreetingServiceUse greetingServiceUse() {
        return new GreetingServiceUse();
    }
	
	@Bean
	@Description("Текстовое описание бина greetingServiceImpl")
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
	
	@Bean
	@Description("Текстовое описание бина greetingOtherService")
    GreetingService greetingOtherService() {
        return new GreetingOtherServiceImpl();
    }
	
	
	
}
