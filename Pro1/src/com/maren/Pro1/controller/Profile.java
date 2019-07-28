//java package (trishna146)
package com.maren.Pro1.controller;
//class Profile (trishna146)
public class Profile
{
	private String userid;
    private String name;
	private String email;
	private long mobile;
    //default constructor (trishna146)
	public Profile() {
	}
//copy constructor (trishna146)
public Profile(String userid, String name, String email, long mobile) {
//super key word is the reference veriable use to refer parent class (trishna146)
		super();
	//tish key word is used as a reference for current object (trishna146)
	this.userid = userid;
	this.name = name;	
	this.email = email;
    this.mobile = mobile;
}
//return the  value of variable userid (trishna146)
	public String getUserid()
{
		return userid;
}
	//set the value of userid (trishna146)
	public void setUserid(String userid) {
    this.userid = userid;
	}
	public String getName() {
	return name;
	}
//set value of name (trishna146)
	public void setName(String name) {
    this.name = name;
	}
    public String getEmail() {
    return email;
    }
//set value of email (trishna146)
	public void setEmail(String email) {
    this.email = email;
	}
	public long getMobile() {                                                    
		return mobile;
	}
	//set  value of mobile (trishna146)
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	

}
