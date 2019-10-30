package com.sctele.test.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * eureka启动类
 *
 * @Title: EurekaApplication
 * @Company: sctele
 * @author wenlei
 * @date 2019年3月15日
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaServer
@ComponentScan(basePackages = "com.sctele")
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
