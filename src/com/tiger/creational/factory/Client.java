package com.tiger.creational.factory;

public class Client {
	public static void main(String[] args) {
		OperationFactory factory = null;
		String key = "+";
		switch (key) {
		case "+":
			factory = new AddOperationFactory();
			break;
		case "-":
			factory = new DiffOperationFactory();
			break;
		}
		Operation operation = factory.createOperation();
		
		operation.setNumA(10);
		operation.setNumB(5);
		double result = operation.getResult();
		System.out.println(result);
	}
}
