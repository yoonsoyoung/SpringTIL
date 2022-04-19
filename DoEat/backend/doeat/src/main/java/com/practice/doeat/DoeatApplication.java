package com.practice.doeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
@EnableAutoConfiguration
@Configuration
@Component
이 3가지를 통해 java에서 xml의 설정파일을 지정해줬던 걸 SpringBootApplication 어노테이션이 해줌
이때, base-package 는 해당 파일이 있는 패키지(com.practice.java)로 자동 설정 
*/
@SpringBootApplication
@EnableAspectJAutoProxy
public class DoeatApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoeatApplication.class, args);
	}

}
