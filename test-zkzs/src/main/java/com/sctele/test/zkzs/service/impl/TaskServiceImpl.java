package com.sctele.test.zkzs.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sctele.test.sys.domain.User;
import com.sctele.test.sys.service.UserService;
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

	//@Autowired
	//SysFeignService sysFeignService;
	
	@Reference
	UserService userService;

	@Override
	public Task getTaskById(Long taskId) {
		
		// 线程调用
		Runnable runnable = new Runnable() {
			public void run() {
				User user = userService.getUserById(taskId);
				System.out.println("name:"+user.getUserName());
				Task task = new Task();
				task.setId(taskId);
				task.setTaskCode("taskCode");
				task.setTaskName(user.getUserName());
			}
		};
		runnable.run();
		
		/*User user = userService.getUserById(taskId);
		System.out.println(user);*/
		return null;
	}

}
