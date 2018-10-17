package com.tiger.behavior.observer.reflect;

public class NBAObserver {
	
	private String name;
	private Subject subject;
	
	public NBAObserver(String name, Subject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public void closeNBA() {
		System.out.println(subject.getAction() + "  " + name + "关闭NBA视屏，继续工作！");
	}

}
