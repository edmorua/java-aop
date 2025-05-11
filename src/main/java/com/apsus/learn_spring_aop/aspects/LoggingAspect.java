package com.apsus.learn_spring_aop.aspects;

//Configuration
//AOP

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	//Pointcut - when? expression that identifies method calls to be intercepted
	@Before("execution(* com.apsus.learn_spring_aop.data.*.*(..))")
	public void logMethodCall(JoinPoint joinPoint) {
		// Logic - What?
		logger.info("Before method is called - {}", joinPoint.getSignature().getName());
	}

	@After("execution(* com.apsus.learn_spring_aop.business.*.*(..))")
	public void logMethodReturn(JoinPoint joinPoint) {
		logger.info("After method is called - {}", joinPoint.getSignature().getName());
	}
}
