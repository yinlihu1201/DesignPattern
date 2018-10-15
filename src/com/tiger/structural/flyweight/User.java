package com.tiger.structural.flyweight;

/**
 * 外部状态
 * @author yinlihu
 *
 */
public class User {
	private String name;
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
