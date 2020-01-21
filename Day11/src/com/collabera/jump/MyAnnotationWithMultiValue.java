package com.collabera.jump;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({TYPE, METHOD, CONSTRUCTOR})
public @interface MyAnnotationWithMultiValue {
	
	String value();
	int count() default 0;
	String path() default "";

}
