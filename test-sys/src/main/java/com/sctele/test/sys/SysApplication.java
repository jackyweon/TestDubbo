package com.sctele.test.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 * 系统管理启动类
 *
 * @Title: SysApplication
 * @Company: sctele
 * @author wenlei
 * @date 2019年3月12日
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.sctele")
@EnableFeignClients(basePackages = "com.sctele.test.feign.service")
@EnableDubboConfiguration
@EnableDiscoveryClient
public class SysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysApplication.class, args);
	}

}
