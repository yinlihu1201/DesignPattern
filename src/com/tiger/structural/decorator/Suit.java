package com.tiger.structural.decorator;

public class Suit extends Decorator {
	@Override
	public void show() {
		System.out.println("穿西装");
		super.show();
	}

}
