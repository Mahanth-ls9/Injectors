package com.spring.Basics.Injections;

public class Student {
private int sid;
private String url;
private String userName;
private String password;

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

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

}
