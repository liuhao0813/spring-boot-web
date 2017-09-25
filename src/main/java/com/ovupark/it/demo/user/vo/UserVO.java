package com.ovupark.it.demo.user.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserVO extends BaseVO {

	private String lname;
	
	@NotNull
	@Size(min=1,message="用户ID不能为空")
	private String userId;
	private String email;
	private String userAccount;
	private String password;
	private String loginToken;
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginToken() {
		return loginToken;
	}
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
	
	
	
}
