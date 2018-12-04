package com.test.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * Description	: @SpringBootApplication�� ������ ��Ʈ ���ø����̼����� ��Ÿ���� ������̼��̴�.
 * 				    �ش� ������̼��� @Configuration, @EnableAutoConfiguration, @ComponentScan�� ���� ���̴�.
 * 				  SpringApplicaion.run �޼ҵ带 ���� ��������Ʈ ���ø����̼��� �����Ų��. 
 * 				  @EnableEurekaServer ������̼����� ����ī ���� ������Ʈ�� ����� �߰��Ѵ�.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}
