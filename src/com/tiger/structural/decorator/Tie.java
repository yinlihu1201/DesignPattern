package com.tiger.structural.decorator;

public class Tie extends Decorator {

	@Override
	public void show() {
		System.out.println("打领带");
		super.show();
	}
	
}
