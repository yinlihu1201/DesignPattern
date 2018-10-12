package com.tiger.creational.factory;

/**
 * 工厂方法vs简单工厂模式：
    	简单工厂模式中，工厂类包含了逻辑判断，根据客户端传来的条件动态实例化对象。对于客户端来说，去除了与具体产品的依赖。但是这样的话，如果新增运算，那么客户端和工厂类都需要修改。
    	工厂模式中，客户端需要决定实例化哪一个工厂来实现运算类，把简单工厂模式的逻辑判断移到了客户端进行，这样的话，以后变更的话，只需实现工厂接口，增加相应的对象，然后在客户端增加逻辑运算即可。
    	
 * @author yinlihu
 *
 */
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
