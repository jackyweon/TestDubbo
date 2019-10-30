package com.sctele.test.zkzs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sctele.test.zkzs.domain.Task;
import com.sctele.test.zkzs.service.TaskService;

/**
 * 
 *
 * @title: UserController
 * @company: sctele
 * @author wenlei
 * @date 2019年10月29日
 */
@RestController
public class TaskController {

	@Autowired
	TaskService taskService;

	/**
	 * http://127.0.0.1:9002/test-zkzs/task/getTaskById?task=5
	 * 		
	 * @title: getTaskById
	 * @author wenlei
	 * @data: 2019年10月30日
	 * @param taskId
	 * @return
	 */
	@GetMapping("task/getTaskById")
	public Task getTaskById(@RequestParam("task") Long taskId) {
		return taskService.getTaskById(taskId);
	}

}
