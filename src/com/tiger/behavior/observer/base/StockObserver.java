package com.tiger.behavior.observer.base;

public class StockObserver extends Observer{

	public StockObserver(String name, Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		System.out.println(subject.getAction() + "  " + name + "关闭股票软件，继续工作！");
	}
	
}
