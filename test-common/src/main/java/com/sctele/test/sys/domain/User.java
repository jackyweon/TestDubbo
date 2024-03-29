package com.sctele.test.sys.domain;

import java.io.Serializable;

/**
 * 
 *
 * @title: User
 * @company: sctele
 * @author wenlei
 * @date 2019年10月29日
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String userName;

	private String password;

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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
