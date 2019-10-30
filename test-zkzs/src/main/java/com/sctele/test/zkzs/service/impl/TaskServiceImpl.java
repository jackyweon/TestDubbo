package com.sctele.test.zkzs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sctele.test.feign.service.SysFeignService;
import com.sctele.test.zkzs.domain.Task;
import com.sctele.test.zkzs.service.TaskService;

/**
 * 
 *
 * @title: UserServiceImpl
 * @company: sctele
 * @author wenlei
 * @date 2019年10月29日
 */
@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	SysFeignService sysFeignService;

	@Override
	public Task getTaskById(Long taskId) {
		sysFeignService.getUserById(taskId);
		Task task = new Task();
		task.setTaskCode("taskCode");
		task.setTaskName("taskName");
		return task;
	}

}
