package com.tiger.creational.builder;

public abstract class Builder {
	
	protected Product product = new Product();
	
	public abstract void buildPartA();
	public abstract void buildPartB();
	
	public abstract Product getProduct();
}
