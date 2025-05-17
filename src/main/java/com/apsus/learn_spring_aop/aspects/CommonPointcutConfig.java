package com.apsus.learn_spring_aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

	@Pointcut("execution(* com.apsus.learn_spring_aop.*.*.*(..))")
	public void businessAndDataPackageConfig(){}

	@Pointcut("execution(* com.apsus.learn_spring_aop.business.*.*(..))")
	public void businessPackageConfig(){}

	@Pointcut("execution(* com.apsus.learn_spring_aop.data.*.*(..))")
	public void dataPackageConfig(){}

	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean(){}

	@Pointcut("@annotation(com.apsus.learn_spring_aop.annotations.TrackTime)")
	public void trackTimeAnnotation () {}

}
