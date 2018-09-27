package com.tiger.structural.adapter;

public class USACenter extends USABasketballPlayer{

	public USACenter(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("美国中锋" + name + "进攻");
	}

	@Override
	public void defense() {
		System.out.println("美国中锋" + name + "防守");
	}
}
