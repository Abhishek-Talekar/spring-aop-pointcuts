package com.pc.asepect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName= null;
		Object[] args = null;
		
		methodName = invocation.getMethod().getName();
		args = invocation.getArguments();
		
		System.out.println("Logging performing for:"+methodName+"("+args[0]+","+args[1]+")");
		
		Object ret = invocation.proceed();
		
		System.out.println("---Logging performed for:"+methodName+"("+args[0]+","+args[1]+")	is Successful.\n Output is:"+ret);
		
		return ret;
	}

}
