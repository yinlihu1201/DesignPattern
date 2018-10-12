package com.tiger.creational.abstractfactory;

public class Client {
	public static void main(String[] args) {
		// 正常抽象工厂模式
		IFactory factory = new MysqlFactory();
		IUser user = factory.createUser();
		User u = new User();
		u.setName("aaa");
		user.insert(u);
		IDepartment dep = factory.createDepartment();
		dep.insert();
		
		// 使用简单工厂简化抽象工厂模式
		IUser createUser = SimpleFactory.createUser();
		System.out.println(createUser.getUser("aaa").getName());
		
		// 简单工厂加反射
		IUser createUser2 = ReflectSimpleFactory.createUser();
		System.out.println(createUser2.getUser("bbb").getName());
	}
}
