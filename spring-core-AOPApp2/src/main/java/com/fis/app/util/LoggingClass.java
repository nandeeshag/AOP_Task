package com.fis.app.util;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingClass {

	@After("execution(public void com.fis.app.service.ClientService.doSearchMovie())")
	public void doLogging()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("[INFO] do Logging 1 -> "+dateTime);
	}
	
	/*
	 * @After("execution(public * do*())") public void doLogging_noArgMethods() {
	 * LocalDateTime dateTime = LocalDateTime.now();
	 * System.out.println("[INFO] Do Logging NoArg -> "+dateTime); }
	 */
	
	
	@After("execution(public * do*(*))") 
	public void doLogging_ForArgumentMethods(JoinPoint joinPoint)
	{
		LocalDateTime dateTime = LocalDateTime.now();
		
		/*
		MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
		System.out.println(methodSignature);
		*/
		
		Object obj[] = joinPoint.getArgs();
		String Resolution = "";
		for (Object arg : obj) {
			
			if(arg instanceof String)
			{
				Resolution = (String)arg;
			}
			
		}
		
		
		
		
		System.out.println("[INFO] Do Logging with Stream Quality called for "+Resolution+" -> "+dateTime);
	}
	
	
}
