package com.collabera.jump.app;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import com.collabera.test.Test;
import com.collabera.jump.MyAnnotationWithMultiValue;
import com.collabera.jump.MyAnnotationWithSingleValue;



public class AnnotationProcessor {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Test test = new Test();
		
		for (Method m: TestAnnotation.class.getDeclaredMethods()) {
			System.out.println(m.getName());
			
		}
		Class<TestAnnotation> testAnnotationClass = TestAnnotation.class;
		
		Annotation[] myAnnotations = testAnnotationClass.getAnnotationsByType(MyAnnotationWithSingleValue.class);
		
		for (Annotation a: myAnnotations) {
			
			MyAnnotationWithSingleValue myAnnotation = (MyAnnotationWithSingleValue) a;
			System.out.println(myAnnotation.value());	
		}
		
		Annotation[] myAnnotationWithMultiValue = testAnnotationClass
				.getAnnotationsByType(MyAnnotationWithMultiValue.class);
		
		for (Annotation a: myAnnotationWithMultiValue) {
			
			MyAnnotationWithMultiValue myAnnotation = (MyAnnotationWithMultiValue) a;
			
			System.out.println(myAnnotation.value());
			System.out.println(myAnnotation.path());
			System.out.println(myAnnotation.count());
			
		
			
		}
				
		
		

	}

}
