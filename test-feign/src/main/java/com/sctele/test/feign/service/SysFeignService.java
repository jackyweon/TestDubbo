package com.sctele.test.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sctele.test.sys.domain.User;

/**
 * sys远程调用feign服务
 *
 * @Title: SysFeignService
 * @Company: sctele
 * @author wenlei
 * @date 2019年3月14日
 */
@Service
@FeignClient(value = "test-sys")
public interface SysFeignService {

	@GetMapping(value = "test-sys/user/getUserById")
	public User getUserById(@RequestParam Long userId);

}