package org.fail.thirdmodel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.fail.ex.ManualFail;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class ExampleListenfail implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(ManualFail.class);
		
	}

}
