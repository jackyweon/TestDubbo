package com.sctele.test.zkzs.service;

import com.sctele.test.zkzs.domain.Task;

/**
 * 
 *
 * @title: UserService
 * @company: sctele
 * @author wenlei
 * @date 2019年10月29日
 */
public interface TaskService {

	/**
	 * 根据任务ID查询任务
	 * 
	 * @title: getTaskById
	 * @author wenlei
	 * @data: 2019年10月29日
	 * @param taskId
	 * @return
	 */
	Task getTaskById(Long taskId);

}
