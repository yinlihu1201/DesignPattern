package com.tiger.behavior.observer.base;

/**
 * 观察者
 * @author yinlihu
 *
 */
public abstract class Observer {
	protected String name;
	protected Subject subject;
	
	public Observer(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}

	public abstract void update();
}
