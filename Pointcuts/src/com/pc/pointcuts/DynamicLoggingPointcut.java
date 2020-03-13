package com.pc.pointcuts;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.pc.beans.Calculator;

public class DynamicLoggingPointcut extends DynamicMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		if (targetClass.isAssignableFrom(Calculator.class) && method.getName().equals("add")) {
			int a = (Integer) args[0];
			int b = (Integer) args[0];
			if (a>=100 && b>=100) {
				
			}
		}
		return true;
	}

}
