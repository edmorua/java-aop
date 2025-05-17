package com.apsus.learn_spring_aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class PerformanceTrackingAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());

	//@Around("execution(* com.apsus.learn_spring_aop.*.*.*(..))")
	@Around("com.apsus.learn_spring_aop.aspects.CommonPointcutConfig.trackTimeAnnotation()")
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		//start a timer
		long startTimeInMillis = System.currentTimeMillis();
		//Execute the method
		Object returnValue = proceedingJoinPoint.proceed();
		//Stop the timer

		long stopTimeInMillis = System.currentTimeMillis();
		long duration = stopTimeInMillis - startTimeInMillis;
		logger.info("Around Aspect - {} method , executionDuration {} ms", proceedingJoinPoint,duration);

		return returnValue;
	}
}
