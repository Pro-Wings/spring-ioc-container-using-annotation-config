package com.prowings.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class DataBaseDetails {

	@Value("${dburl}")
	private String url;
	@Value("prowings")
	private String userName;
	@Value("prowings")
	private String password;

	public DataBaseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DataBaseDetails [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}
