package io.pivotal;

import io.pivotal.dao.GreetingRepository;
import io.pivotal.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringBootApplication {
	Logger logger = LoggerFactory.getLogger(HelloSpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

	@Bean
	CommandLineRunner loadDatabase(GreetingRepository repository){
		return args -> {
			logger.debug("Loading database");
			repository.save(new Greeting(1, "Hello"));
			repository.save(new Greeting(2, "Ola"));
			repository.save(new Greeting(3, "Namaste"));
			logger.debug("record count:", repository.count());
			repository.findAll().forEach(x -> logger.debug(x.toString()));
		};
	}
}
