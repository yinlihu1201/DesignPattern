package com.tiger.creational.abstractfactory;

public class ReflectSimpleFactory {
	private static final String db = "Mysql";
	
	@SuppressWarnings("rawtypes")
	public static IUser createUser(){
		IUser user = null;
		
		try {
			Class clazz = Class.forName("com.tiger.creational.abstractfactory." + db + "User");
			user = (IUser)clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	public static IDepartment createDepartment(){
		IDepartment department = null;
		return department;
	}
}
