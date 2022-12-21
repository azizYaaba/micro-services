package org.epo.ebank;

import org.epo.ebank.dtos.CustomerDTO;
import org.epo.ebank.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class EBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBankApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(
			CustomerService customerService
	) {
		return args -> {
			Stream.of("Marc", "Blandine", "Clara", "Oceane").forEach(name -> {
				CustomerDTO customer = new CustomerDTO();
				customer.setName(name);
				customer.setEmail(name + "@gmail.com");
				customerService.saveCustomer(customer);
			});
		};

	}
}