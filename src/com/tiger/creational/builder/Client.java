package com.tiger.creational.builder;

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
