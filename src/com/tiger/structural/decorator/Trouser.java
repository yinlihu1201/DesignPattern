package com.tiger.structural.decorator;

public class Trouser extends Decorator {

	@Override
	public void show() {
		System.out.println("穿裤子");
		super.show();
	}
}
