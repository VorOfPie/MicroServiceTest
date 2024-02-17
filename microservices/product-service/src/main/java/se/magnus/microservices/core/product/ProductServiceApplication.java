package se.magnus.microservices.core.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import se.magnus.util.http.ServiceUtil;

@SpringBootApplication
@ComponentScan("se.magnus")
public class ProductServiceApplication {
	private final ServiceUtil serviceUtil;

	public ProductServiceApplication(ServiceUtil serviceUtil) {
		this.serviceUtil = serviceUtil;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
