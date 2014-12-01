package de.tut.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
 

import com.opensymphony.xwork2.ModelDriven;

import de.stut.service.LoginService;
import de.tut.model.User;

public class LoginAction extends ActionSupport  implements ModelDriven<User> {


	private User user= new User();

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		if (StringUtils.isEmpty(this.user.getUserId())) {
			// user id is blank
			addFieldError("userId", "User Id cannot be blank");

		}
		if (StringUtils.isEmpty(this.user.getPassword())) {
			// password is blank
			addFieldError("password", "Password Id cannot be blank");

		}

	}

 

 

	public String execute() {

		LoginService loginService = new LoginService();

		 

		if (loginService.verifyLogin(user)) {
			return Action.SUCCESS;
		} else {
			return Action.LOGIN;
		}

	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
