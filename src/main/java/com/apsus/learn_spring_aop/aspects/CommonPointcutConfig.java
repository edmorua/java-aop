package com.apsus.learn_spring_aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

	@Pointcut("execution(* com.apsus.learn_spring_aop.*.*.*(..))")
	public void businessAndDataPackageConfig(){}
}
