package com.tiger.creational.simplefactory;

public class AddOperation extends Operation {

	@Override
	public double getResult() {
		return numA + numB;
	}

}
