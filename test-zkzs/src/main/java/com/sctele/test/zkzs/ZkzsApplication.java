package com.sctele.test.zkzs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;
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
@EnableDubboConfiguration
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.sctele")
//@EnableFeignClients(basePackages = "com.sctele.test.feign.service")
public class ZkzsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZkzsApplication.class, args);
	}

}
