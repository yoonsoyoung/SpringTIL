package com.example.web.dto;

import java.util.List;

public class ParamDto {
	private String userid;
	private String username;
	private List<String> fruit;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getFruit() {
		return fruit;
	}
	public void setFruit(List<String> fruit) {
		this.fruit = fruit;
	}
	
	
}
