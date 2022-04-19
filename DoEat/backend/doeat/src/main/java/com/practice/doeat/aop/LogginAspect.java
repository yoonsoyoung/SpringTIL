package com.practice.doeat.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

	private Logger logger = LoggerFactory.getLogger(LogginAspect.class);
	
	@Before(value = "execution(* com.practice.doeat.model..*.*(..))")
	public void loggin(JoinPoint jp) {
		logger.debug("메서드 선언부 : {} 전달 파라미터 : {}", jp.getSignature(), Arrays.toString(jp.getArgs()));
	}
}
