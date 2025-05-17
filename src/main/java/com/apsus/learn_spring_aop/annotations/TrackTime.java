package com.apsus.learn_spring_aop.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//runtime
//methods only
@Target( ElementType.METHOD )
@Retention( RetentionPolicy.RUNTIME )
public @interface TrackTime {

}
