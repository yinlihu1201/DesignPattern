package com.tiger.creational.factory;

public class DiffOperationFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new DiffOperation();
	}

}
