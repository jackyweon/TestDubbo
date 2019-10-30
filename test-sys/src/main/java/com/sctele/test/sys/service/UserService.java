package com.sctele.test.sys.service;

import com.sctele.test.sys.domain.User;

/**
 * 
 *
 * @title: UserService
 * @company: sctele
 * @author wenlei
 * @date 2019年10月29日
 */
public interface UserService {

	/**
	 * 根据用户ID查询用户
	 * 
	 * @title: getUserById
	 * @author wenlei
	 * @data: 2019年10月29日
	 * @param userId
	 * @return
	 */
	User getUserById(Long userId);

}
