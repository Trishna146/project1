
package com.maren.Pro1.model;

public class Profile
 {
	private String userid;

	private String name;

	private String email;

	private long mobile;
      	
	
	
public Profile() {

	}

	public Profile(String userid, String name, String email, long mobile) {

		super();
	
	this.userid = userid;

	this.name = name;
	
	this.email = email;

		this.mobile = mobile;
	
}
	public String getUserid()
 {
		return userid;

	}
	
	public void setUserid(String userid) {

		this.userid = userid;
	
	}
	
	public String getName() {
	
	return name;
	
	}

	public void setName(String name) {

		this.name = name;
	
}

	public String getEmail() {

	return email;

	}

	public void setEmail(String email) {

		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}
