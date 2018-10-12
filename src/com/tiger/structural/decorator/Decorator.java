package com.tiger.structural.decorator;

public class Decorator extends Person {
	
	protected Person component;

	public void decorator(Person component) {
		this.component = component;
	}

	@Override
	public void show() {
		if(component != null){
			component.show();
		}
	}
}
