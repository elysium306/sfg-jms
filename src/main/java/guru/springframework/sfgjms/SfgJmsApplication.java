package guru.springframework.sfgjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgJmsApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Application Is Starting ...");
		SpringApplication.run(SfgJmsApplication.class, args);
		System.out.println("This is after Spring Boot Application Started ...");
	}

}
