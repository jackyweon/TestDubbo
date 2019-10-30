package com.sctele.test.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sctele.test.sys.domain.User;
import com.sctele.test.sys.service.UserService;

/**
 * 
 *
 * @title: UserController
 * @company: sctele
 * @author wenlei
 * @date 2019年10月29日
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("user/getUserById")
	public User getUserById(@RequestParam("userId") Long userId) {
		return userService.getUserById(userId);
	}

}
