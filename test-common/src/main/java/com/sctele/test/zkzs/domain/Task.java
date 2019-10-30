package com.sctele.test.zkzs.domain;

/**
 * 
 *
 * @title: Task
 * @company: sctele
 * @author wenlei
 * @date 2019年10月29日
 */
public class Task {

	private Long id;

	private String taskName;

	private String taskCode;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the taskCode
	 */
	public String getTaskCode() {
		return taskCode;
	}

	/**
	 * @param taskCode the taskCode to set
	 */
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

}
