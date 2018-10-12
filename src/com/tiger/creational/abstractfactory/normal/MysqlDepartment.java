package com.tiger.creational.abstractfactory.normal;

public class MysqlDepartment implements IDepartment {

	@Override
	public void insert() {
		System.out.println("mysql插入department");
	}

	@Override
	public String getId(Department department) {
		return department.getName();
	}

}
