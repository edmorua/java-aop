package com.apsus.learn_spring_aop;

import com.apsus.learn_spring_aop.business.BusinessService1;
import com.apsus.learn_spring_aop.business.BusinessService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	private final BusinessService1 businessService1;
	private final BusinessService2 businessService2;

	public LearnSpringAopApplication(BusinessService1 businessService1, BusinessService2 businessService2) {
		this.businessService1 = businessService1;
		this.businessService2 = businessService2;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("BusinessService1 Value returned is {}", businessService1.calculateMax());
		logger.info("BusinessService2 Value returned is {}", businessService2.calculateMint());
	}
}
