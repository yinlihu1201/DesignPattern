package com.tiger.behavior.observer.base;

public class NBAObserver extends Observer {

	public NBAObserver(String name, Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		System.out.println(subject.getAction() + "  " + name + "关闭NBA视屏，继续工作！");
	}

}
