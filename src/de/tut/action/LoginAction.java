package de.tut.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.template.utility.StringUtil;

public class LoginAction extends ActionSupport {

	private String userId;
	private String password;

	public void validate() {
		if (StringUtils.isEmpty(this.getUserId())) {
			// user id is blank
			addFieldError("userId","User Id cannot be blank");

		}
		if (StringUtils.isEmpty(this.getPassword())) {
			//password is blank
			addFieldError("password","Password Id cannot be blank");

		}

	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		if (getUserId().equals("userId") && getPassword().equals("password")) {
			return "success";
		} else {
			return Action.LOGIN;
		}
	}

}
