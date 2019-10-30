package com.sctele.test.sys.service.impl;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sctele.test.sys.domain.User;
import com.sctele.test.sys.service.UserService;

/**
 * 
 *
 * @title: UserServiceImpl
 * @company: sctele
 * @author wenlei
 * @date 2019年10月29日
 */
// @Service
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

	@Override
	public User getUserById(Long userId) {
		User user = new User();
		user.setId(userId);
		user.setUserName("haha");
		user.setPassword("123456@abc");
		return user;
	}

}
