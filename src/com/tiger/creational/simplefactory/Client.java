package com.tiger.creational.simplefactory;
/**
 * 简单工厂模式
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		Operation ope = OperationFactory.createOperation("-");
		ope.setNumA(10);
		ope.setNumB(20);
		double result = ope.getResult();
		System.out.println(result);
	}
}
