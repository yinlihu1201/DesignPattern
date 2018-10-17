package com.tiger.behavior.observer.reflect;

public class StockObserver {
	
	private String name;
	private Subject subject;

	public StockObserver(String name, Subject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public void closeStock() {
		System.out.println(subject.getAction() + "  " + name + "关闭股票软件，继续工作！");
	}
	
}
