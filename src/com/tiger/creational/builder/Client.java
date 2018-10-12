package com.tiger.creational.builder;

/**
 * 建造者模式：
 * 		Builder创建一个Product对象的各个部件指定的抽象接口。使用一个Director类来确定对象内部的构建及构建顺序。
 * 		这样就像一套规范流程，把每步定制好，按流程走就行。
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		Director d = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		
		d.construct(b1);
		Product p1 = b1.getProduct();
		p1.show();
		
		d.construct(b2);
		Product p2 = b2.getProduct();
		p2.show();
	}
}
