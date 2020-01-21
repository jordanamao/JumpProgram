package com.collabera.jump.app;

import com.collabera.jump.MyAnnotation;
import com.collabera.jump.MyAnnotationWithMultiValue;
import com.collabera.jump.MyAnnotationWithSingleValue;



@MyAnnotationWithSingleValue("/hello")

@MyAnnotationWithMultiValue(value = "New Value", count = 10, path = "Some_path")

@MyAnnotation
public interface TestAnnotation {
	
	@MyAnnotation
	private String reverse (String data) {
	return new StringBuilder(data).reverse().toString();
	}
	


}
