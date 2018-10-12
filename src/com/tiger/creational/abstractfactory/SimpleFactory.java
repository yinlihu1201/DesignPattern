package com.tiger.creational.abstractfactory;

import com.tiger.creational.abstractfactory.normal.IDepartment;
import com.tiger.creational.abstractfactory.normal.IUser;
import com.tiger.creational.abstractfactory.normal.MysqlDepartment;
import com.tiger.creational.abstractfactory.normal.MysqlUser;

public class SimpleFactory {
	private static final String data = "mysql";
	
	public static IUser createUser(){
		IUser user = null;
		switch (data) {
		case "mysql":
			user = new MysqlUser();
			break;
		case "oracle":
			
			break;
		}
		
		return user;
	}
	
	public static IDepartment createDepartment(){
		IDepartment department = null;
		switch (data) {
		case "mysql":
			department = new MysqlDepartment();
			break;
		case "oracle":
			
			break;
		}
		
		return department;
	}
}
