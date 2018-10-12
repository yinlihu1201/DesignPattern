package com.tiger.creational.abstractfactory.normal;

public class MysqlUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("插入mysql的用户");
	}

	@Override
	public User getUser(String name) {
		User user = new User();
		user.setName(name);
		return user;
	}

}
