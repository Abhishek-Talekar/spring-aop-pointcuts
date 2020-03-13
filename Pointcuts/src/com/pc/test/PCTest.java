package com.pc.test;

import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.pc.asepect.LoggingAdvice;
import com.pc.beans.Calculator;
import com.pc.pointcuts.LoggingPointcut;

public class PCTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvisor(new DefaultPointcutAdvisor(new LoggingPointcut(), new LoggingAdvice()));
		
		Calculator calculator = (Calculator) pf.getProxy();
		int sum = calculator.add(10, 20);
		
	}
}
