package com.tiger.creational.factory;

public class AddOperation extends Operation {

	@Override
	public double getResult() {
		return numA + numB;
	}
	
}
