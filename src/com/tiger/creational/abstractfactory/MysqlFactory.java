package com.tiger.creational.abstractfactory;

public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new MysqlUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new MysqlDepartment();
	}

}
