package com.tiger.creational.builder;

public class ConcreteBuilder2 extends Builder {
	
	@Override
	public void buildPartA() {
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		product.add("部件Y");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
