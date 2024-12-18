package demo.schoolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SchoolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolarApplication.class, args);
	}

}
