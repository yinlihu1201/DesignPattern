package com.tiger.creational.factory;

public class AddOperationFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new AddOperation();
	}

}
