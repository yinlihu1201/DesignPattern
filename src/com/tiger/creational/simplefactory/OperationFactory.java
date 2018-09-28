package com.tiger.creational.simplefactory;

public class OperationFactory {
	public static Operation createOperation(String operate){
		Operation operation = null;
		switch (operate) {
		case "+":
			operation = new AddOperation();
			break;
		case "-":
			operation = new DiffOperation();
			break;
		}
		return operation;
	}
}
