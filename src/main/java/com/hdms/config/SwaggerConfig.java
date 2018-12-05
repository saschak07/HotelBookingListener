package com.hdms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
@Bean
public Docket api() { 
return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())  
.select()                                  
.apis(RequestHandlerSelectors.any())              
.paths(PathSelectors.ant("/api/*"))                          
.build();                                           
}

private ApiInfo apiInfo() {
	return new ApiInfoBuilder().title("HotelPresentationService APIs")
			.description("HotelPresentationService API reference for developers")
			.termsOfServiceUrl("https://hotelservice1.herokuapp.com")
			.license("hotelservice1 License")
			.licenseUrl("saschak07@gmail.com").version("1.0").build();
}

}