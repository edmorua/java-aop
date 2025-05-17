package com.apsus.learn_spring_aop.aspects;

//Configuration
//AOP

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

	private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	//Pointcut - when? expression that identifies method calls to be intercepted
	@Before("com.apsus.learn_spring_aop.aspects.CommonPointcutConfig.allPackageConfigUsingBean()")
	public void logMethodCall(JoinPoint joinPoint) {
		// Logic - What?
		logger.info("BeforeAspect method is called - {} - args - {}", joinPoint, joinPoint.getArgs());
	}

	@After("com.apsus.learn_spring_aop.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
	public void logMethodAfter(JoinPoint joinPoint) {
		logger.info("AfterAspect method is called - {}  has executed", joinPoint);
	}


	@AfterThrowing(
		pointcut = "com.apsus.learn_spring_aop.aspects.CommonPointcutConfig.businessAndDataPackageConfig()",
		throwing = "exception"
	)
	public void logMethodAfterThrowing(JoinPoint joinPoint, Exception exception) {
		logger.info("AfterThrowing method is called - {} has thrown an exception {}", joinPoint, exception.getMessage());
	}


	@AfterReturning(
		pointcut = "com.apsus.learn_spring_aop.aspects.CommonPointcutConfig.businessAndDataPackageConfig()",
		returning = "resultValue"
	)
	public void logMethodAfterReturning(JoinPoint joinPoint, Object resultValue) {
		logger.info("AfterReturning method is called - {} has returned {}", joinPoint, resultValue);
	}
}
