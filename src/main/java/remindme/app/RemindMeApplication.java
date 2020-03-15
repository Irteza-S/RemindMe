package remindme.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"remindme.services", "remindme.app", "remindme.db"})
@EntityScan(basePackages = {"remindme.model.user", "remindme.model"})
public class RemindMeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RemindMeApplication.class, args);
	}	
}
