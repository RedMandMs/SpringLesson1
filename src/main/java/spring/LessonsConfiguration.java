package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
@ComponentScan
public class LessonsConfiguration {

	@Bean
	@Description("������������� ���� greetingService")
    GreetingServiceUse greetingServiceUse() {
        return new GreetingServiceUse();
    }
	
	@Bean
	@Description("��������� �������� ���� greetingServiceImpl")
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
	
	@Bean
	@Description("��������� �������� ���� greetingOtherService")
    GreetingService greetingOtherService() {
        return new GreetingOtherServiceImpl();
    }
	
	
	
}
