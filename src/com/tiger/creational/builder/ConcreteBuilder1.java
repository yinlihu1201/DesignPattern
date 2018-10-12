package com.tiger.creational.builder;

public class ConcreteBuilder1 extends Builder {
	
	@Override
	public void buildPartA() {
		product.add("部件A");
	}

	@Override
	public void buildPartB() {
		product.add("部件B");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
