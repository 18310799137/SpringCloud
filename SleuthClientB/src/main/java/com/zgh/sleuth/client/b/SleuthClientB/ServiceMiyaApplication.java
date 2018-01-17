package com.zgh.sleuth.client.b.SleuthClientB;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMiyaApplication.class, args);
	}

	private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());

	@RequestMapping("/hi")
	public String home() {
		LOG.info("this is service-b");

		return restTemplate.getForObject("http://localhost:9001/servicea", String.class);
	}

	@RequestMapping("/serviceb")
	public String info() {
		LOG.info("this is service-b");
		return "hi i'm serviceb!";
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
