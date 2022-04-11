package com.firb.doeat.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	// After : try 정상 실행 됐을 때
	// @AfterThrowing : catch 실행 중 예외 발생했을 때
	// @AfterReturn : finally 잘 하든 말든 여튼 실행
	// @arround : 앞에서 한 번 실행하고 끝에
	@Before(value = "execution(* com.firb.doeat.model..*Dao.*(..))")
	// *Dao 로 끝나는 .*(..) 모든 메소드
	public void loggin(JoinPoint jp) {
		logger.debug("메서드 선언부 : {} 전달 파라미터 : {}", jp.getSignature(), Arrays.toString(jp.getArgs()));
	}
}
