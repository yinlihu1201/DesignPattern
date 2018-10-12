package com.tiger.creational.abstractfactory;

public interface IFactory {
	IUser createUser();
	
	IDepartment createDepartment();
}
