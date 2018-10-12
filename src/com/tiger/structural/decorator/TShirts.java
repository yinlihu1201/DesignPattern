package com.tiger.structural.decorator;

public class TShirts extends Decorator {

	@Override
	public void show() {
		System.out.println("传T恤");
		super.show();
	}
}
