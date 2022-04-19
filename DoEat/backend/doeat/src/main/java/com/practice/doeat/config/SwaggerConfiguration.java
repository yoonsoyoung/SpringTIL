package com.practice.doeat.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	// swagger local 확인
	// http://locahost/doeat/swagger-ui.html
	
	private String version = "v1";
	private String title = "Soyoung's toy project DoEat API " + version;

	@Bean
	public Docket api() {
		List<ResponseMessage> responseMessages = new ArrayList<ResponseMessage>();
		responseMessages.add(new ResponseMessageBuilder().code(200).message("success!").build());
		responseMessages.add(new ResponseMessageBuilder().code(500).message("서버 문제 발생")
				.responseModel(new ModelRef("Error")).build());
		responseMessages.add(new ResponseMessageBuilder().code(404).message("페이지를 찾을 수 없음").build());

		return new Docket(DocumentationType.SWAGGER_2).consumes(getConsumeContentTypes()).produces(getProduceContentTypes())
				.apiInfo(apiInfo()).groupName(version).select()
				.apis(RequestHandlerSelectors.
                        basePackage("com.practice.doeat.controller"))
				.paths(PathSelectors.any()).build();

	}
	private Set<String> getConsumeContentTypes() {
		// 넘겨오는 데이터의 타입
        Set<String> consumes = new HashSet<>();
        consumes.add("application/json;charset=UTF-8");
        //consumes.add("application/xml;charset=UTF-8");
        consumes.add("application/x-www-form-urlencoded");
        return consumes;
    }

    private Set<String> getProduceContentTypes() {
    	// 넘겨주는 데이터의 타입
        Set<String> produces = new HashSet<>();
        produces.add("application/json;charset=UTF-8");
        return produces;
    }

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title).description(
				"<h3>DoEat API Reference for Developers</h3>Swagger를 이용한 DoEat API_소영의 토이프로젝트")
				.contact(new Contact("yoonsoyoung", "", "soyoung_it@fistbrain.co.kr")).build();

	}
}
