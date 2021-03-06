package com.test.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * Description	: @SpringBootApplication은 스프링 부트 애플리케이션임을 나타내는 어노테이션이다.
 * 				    해당 어노테이션은 @Configuration, @EnableAutoConfiguration, @ComponentScan을 묶은 것이다.
 * 				  SpringApplicaion.run 메소드를 통해 스프링부트 애플리케이션을 실행시킨다. 
 * 				  @EnableEurekaServer 어노테이션으로 유레카 서비스 레지스트리 기능을 추가한다.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}
